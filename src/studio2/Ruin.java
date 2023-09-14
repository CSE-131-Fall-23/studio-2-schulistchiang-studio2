package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		double winLimit = in.nextDouble();
		
		

	}
	
	public static double simulant(double startAmount, double winChance, double winLimit) {
		if (Math.random() < winChance) {
			return startAmount + 1;
		}
		return startAmount - 1;
	}

}
