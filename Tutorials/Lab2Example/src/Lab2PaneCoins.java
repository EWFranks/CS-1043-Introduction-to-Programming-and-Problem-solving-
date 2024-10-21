import javax.swing.JOptionPane;
/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Lab2PaneCoins.java
Classes:     Lab2PaneCoins
Description: Computing the counting of money.
*/

public class Lab2PaneCoins {

	public static void main(String[] args) {

		String input = null;
		
		input = JOptionPane.showInputDialog("How many pennies do you have?");
		int pennies = Integer.parseInt( input );
		
		input = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickels = Integer.parseInt( input );
		
		input = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt( input );
		
		input = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt( input );
		
		input = JOptionPane.showInputDialog("How many half-dollars do you have?");
		int halfDollars = Integer.parseInt( input );
		
		input = JOptionPane.showInputDialog("How many dollars do you have?");
		int dollars = Integer.parseInt( input );
		
		

		double totalMoney = dollars * 1 + halfDollars * .50 + quarters * .25 + dimes * .10 + nickels * .05
				+ pennies * .01;

		System.out.printf("Total value = $%.2f", totalMoney);

	} // end main
} // end class