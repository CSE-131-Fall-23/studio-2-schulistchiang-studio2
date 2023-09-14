package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount: ");
		double startAmount0 = in.nextDouble();
		System.out.println("Win chance: ");
		double winChance0 = in.nextDouble();
		System.out.println("Win limit: ");
		double winLimit0 = in.nextDouble();
		System.out.println("Total simulations: ");
		double nSims = in.nextDouble();
		
		int wins = 0;
		int losses = 0;

		for (int i = 0; i < nSims; i++) {
			double startAmount = startAmount0;
			double winChance = winChance0;
			double winLimit = winLimit0;
			
			while (startAmount > 0 && startAmount < winLimit) {
				startAmount = simulant(startAmount, winChance, winLimit);
				System.out.println(startAmount);
			}
			if (startAmount >= winLimit) {
				wins++;
			} else {
				losses++;
			}
		}

	}

	public static double simulant(double startAmount, double winChance, double winLimit) {
		if (Math.random() < winChance) {
			return startAmount + 1;
		}
		return startAmount - 1;
	}

}
