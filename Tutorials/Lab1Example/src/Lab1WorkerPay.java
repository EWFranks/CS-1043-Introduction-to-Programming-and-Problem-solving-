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
public class Lab1WorkerPay {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		double weeks = 50;
		double hours = 40;
		
		System.out.print("");
		double yourValue = scnr.nextDouble();
		
		double annualPay = yourValue * weeks * hours;
		double monthlyPay = yourValue * weeks/12 * hours;


		System.out.printf("Annual pay: $%,.2f\n", annualPay);
		System.out.printf("Monthly pay: $%,.2f\n", monthlyPay );
		
			}
}