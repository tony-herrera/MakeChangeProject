package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		// Import scanner
		Scanner sc = new Scanner(System.in);

		// Declare variables
		double prodPrice, amtTendered, cashBack, maxPrice;
//		int pennies, nickels, dimes, quarters, dollars, fives, tens, twenties;

		// Initialize variables
//		double Pennies = .01;
//		double Nickels = .05;
//		double Dimes = .10;
//		double Quarters = .25;
//		double Dollars = 1.00;
//		double Fives = 5.00;
//		double Tens = 10.00;
//		double Twenties = 20.00;
//		boolean keepGoing = true;

		maxPrice = 20;

		// Prompt user to input the item's price
		System.out.println("Please, enter the price for the item: ");
		prodPrice = sc.nextDouble();
		System.out.println(prodPrice);
		System.out.println("Please, enter amount tendered: ");
		amtTendered = sc.nextDouble();
		if (amtTendered < prodPrice) {
			System.out.println("Please enter the correct amount of money");
		} else if (amtTendered == prodPrice) {
			System.out.println("Have a nice day. Come again");
		} else {
			System.out.println(amtTendered - prodPrice);
		}
		

//		while (prodPrice <= maxPrice) 	
//		{System.out.println("Please, enter the amount tendered: ");
//			amtTendered = sc.nextDouble();

//			if (prodPrice > maxPrice) 
//			{System.out.println("We can't afford those items. Spend less money");
//			return;
//																	} 
//
//				 if (amtTendered > maxPrice) {
//					System.out.println("Please, offer amount less than $20.");
//					return;
//				}
//			} 
		}
	}



