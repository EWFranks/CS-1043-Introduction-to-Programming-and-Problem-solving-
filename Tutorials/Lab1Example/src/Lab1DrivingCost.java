import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        8-26-20 
 Course:      CS 1043
 Section      1
 File Name:   Lab1ComputeAnnualandMonthlyPay.java
 Classes:     Lab1ComputeAnnualandMonthlyPay
 Description: Using and assigning variable to mathematical expressions
*/

public class Lab1DrivingCost {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		double miles;
		double dollarsperGallon;
		
		
		System.out.print("");
		miles = scnr.nextDouble();
		System.out.print("");
		dollarsperGallon = scnr.nextDouble();
		
		double cost1 = (20 * dollarsperGallon)/miles;
		double cost2 = (75 * dollarsperGallon)/miles;
		double cost3 = (500 * dollarsperGallon)/miles;

		System.out.printf("%.2f", cost1);
		System.out.println();
		System.out.printf("%.2f", cost2);
		System.out.println();
		System.out.printf("%.2f", cost3);
		
		
	}
}
