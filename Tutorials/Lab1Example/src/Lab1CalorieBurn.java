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

public class Lab1CalorieBurn {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("");
		double age = scnr.nextFloat();
		double weight = scnr.nextFloat();
		double heartRate = scnr.nextFloat();
		double time = scnr.nextFloat();
		
		
		double femCal = (((age * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022)
				* time / 4.184);
		
		double menCal = (((age * 0.2017) + (weight * 0.09036) + (heartRate * 0.6309) - 55.0969)
				* time / 4.184);
		
		System.out.print("Women: ");
		System.out.printf("%.2f", femCal);
		System.out.print(" calories");
		
		System.out.println();
		
		System.out.print("Men: ");
		System.out.printf("%.2f", menCal);
		System.out.print(" calories");
		
}
}