import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Lab3WeeklyPay.java
Classes:     Lab3WeeklyPay
Description: Computing pay per week with if else statements.
*/
public class Lab3WeeklyPay {
	public static void main(String[] args) {

		double hoursperWeek;
		double pay = 0.0;
		double wage;
		java.util.Scanner scnr = new Scanner(System.in);
		
		System.out.printf("Enter the wage and hours worked per week:");
		wage = scnr.nextDouble();

		
		hoursperWeek = scnr.nextDouble();

		if (hoursperWeek > 40.00) {
			pay = ((hoursperWeek - 40.00) * (1.50 * wage)) + (wage * 40.00);
		} else {
			pay = (hoursperWeek * wage);
		}
		System.out.printf("\nWorker pay is $%.2f", pay);
	}
}