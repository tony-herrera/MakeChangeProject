package makechange;
import java.util.Scanner;
import java.math.RoundingMode;
import java.lang.Math; 
public class MakeChange {
	public static void main(String[] args) {
		// Import scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double prodPrice, amtTendered, cashBack, maxPrice;
		maxPrice = 20.0;
		int changeAmt = (int) .00000005;
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
			// Declare cashBack variable and initialize
			cashBack = (.00000005 + amtTendered) - prodPrice;
			int tens = (int) (cashBack / 10);
			cashBack = cashBack - (tens * 10);
			int fives = (int) (cashBack / 5);
			cashBack = cashBack - (fives * 5);
			int dollars = (int) (cashBack / 1);
			cashBack = cashBack - (dollars * 1);
			
			int quarters = (int) (cashBack / .25);
			cashBack = cashBack - (quarters * .25);
			int dimes = (int) (cashBack / .10);
			cashBack = cashBack - (dimes * .10);
			int nickels = (int) (cashBack / .05);
			cashBack = cashBack - (nickels * .05);
			int pennies = (int) (cashBack /.01 );
			cashBack = cashBack - (pennies * .01);
			if (pennies != 0);
			System.out.println("Here is your change: " + tens + " tens " + fives + " fives " + dollars + " dollars "
					+ quarters + " Quarters, " + dimes + " Dimes," + nickels + " Nickels, " + pennies + " Pennies "
					+ " Have a nice day!");
		} sc.close();
	} 
}