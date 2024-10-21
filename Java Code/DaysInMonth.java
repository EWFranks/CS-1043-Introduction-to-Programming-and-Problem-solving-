import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-16-20 
Course:      CS 1043
Section      1
File Name:   TaxTable.java
Classes:     TaxTable
Description: Determine if a month has 30, 28/29, or 31 days.
*/

public class DaysInMonth {

public static void main(String[] args) {
		
		Scanner scnr = new Scanner( System.in );
		
		int month = scnr.nextInt();
	
		if (month >= 1 && month <= 12) {
	
			if ( month == 9 || month == 4 || month == 6 || month == 11) {
				System.out.println("30days");
			} else if ( month == 2 ) {
				System.out.println("28 or 29 days");
			} else { 
				System.out.println("31 days");
			}
				
		} else {
				System.out.print("invalid month");
		}
		
		scnr.close();
	}

}
