// Chapter 6 example (Pg 291)

import java.util.Scanner;

public class BankBalance {
	public static void main(String[] args) {

// Variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

// Input phase
		System.out.print("Enter initial bank balance: ");
		balance = keyboard.nextDouble();

// Processing and output phase
		do {
			balance = balance + (balance * INT_RATE);
			double roundBal = (double) Math.round(balance * 100d) / 100d;
			System.out.println("After year " + year + " your balance will be $" + roundBal + " at a " + INT_RATE + " intrest rate.");
			year = year +1;
			System.out.println("Would you want to see the next years balance?");
			System.out.print("Enter 1 for YES or any other number for NO: ");
			response = keyboard.nextInt();
		} while (response == 1);
		System.out.println("\nThank you come again!");
	}
}