package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Start amount: ");
		double startAmount0 = in.nextDouble();
		System.out.print("Win chance: ");
		double winChance0 = in.nextDouble();
		System.out.print("Win limit: ");
		double winLimit0 = in.nextDouble();
		System.out.print("Total simulations: ");
		int nSims = in.nextInt();
		
		int wins = 0;
		int losses = 0;

		for (int i = 0; i < nSims; i++) {
			String result;
			double startAmount = startAmount0;
			double winChance = winChance0;
			double winLimit = winLimit0;
			
			while (startAmount > 0 && startAmount < winLimit) {
				startAmount = simulant(startAmount, winChance, winLimit);
			}
			if (startAmount >= winLimit) {
				wins++;
				result = "WIN";
				
			} else {
				losses++;
				result = "LOSE";
			}
			
			System.out.println("Simulation " + (i + 1) + ": " + result);
		}
		double alpha = (1-winChance0) / winChance0;
		double expectedRuin = (Math.pow(alpha, startAmount0) - Math.pow(alpha, winLimit0)) / (1-Math.pow(alpha, winLimit0));
		
		System.out.println("Losses: " + losses);
		System.out.println("Simulations: " + nSims);
		System.out.println("Ruin rate from simulation: " + (double)losses/nSims);
		System.out.println("Expected ruin rate: " + expectedRuin);
		

	}

	public static double simulant(double startAmount, double winChance, double winLimit) {
		if (Math.random() < winChance) {
			return startAmount + 1;
		}
		return startAmount - 1;
	}

}
