
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/7/2020 
Assignment: Lab 2
Description: Modularization with Static Methods
*/
import java.util.Scanner;
import java.lang.Math;

public class Lab2SystematicInvestmentPlan {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter your Regular Monthly Investment: ");//this line prompts the user with the message Days Worked:
		double rMonthlyInvestment = myScanner.nextDouble();
		
		System.out.print("MonthlyInterestRate: ");//this line prompts the user with the message Days Worked:
		double interestRate = myScanner.nextDouble();
		
		System.out.print("DurationInMonths: ");//this line prompts the user with the message Days Worked:
		int durationMonths = myScanner.nextInt(); 
		
		System.out.println("The SIP is: "+ sip(rMonthlyInvestment,interestRate,durationMonths));
		
	}
	
	public static double sip(double r, double i,int n) {
		
		return r*((Math.pow(1+i, n)-1)/i)*(1+i);
	}
}
