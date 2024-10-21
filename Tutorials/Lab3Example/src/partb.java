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

public class partb {
	public static void main(String[] args) {
        
        double weightedTotals;
        char Grade = 0;
        java.util.Scanner scnr = new Scanner(System.in);
	    System.out.printf("");

	    weightedTotals = scnr.nextDouble();
	    
	    
			if (weightedTotals >= 90) {
				System.out.print("the grade is an A");
			} else if (weightedTotals < 90 && weightedTotals >= 80) {
				System.out.print("the grade is an B");
			} else if (weightedTotals < 80 && weightedTotals >= 70) {
				System.out.print("the grade is an C");
			} else if (weightedTotals < 70 && weightedTotals >= 60) {
				System.out.print("the grade is an D");
			} else if (weightedTotals < 60) {
				System.out.print("the grade is an F");
			}
		
	}
	
}
