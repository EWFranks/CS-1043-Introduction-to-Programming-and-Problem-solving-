import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Lab2Coins.java
Classes:     Lab2Coins
Description: Computing the values of money with addition.
*/

public class Lab2Coins {  
	   
   public static void main( String[] args ) {
		   
	      java.util.Scanner scnr = new Scanner(System.in);
	      System.out.printf("How many pennies do you have?");
		  int pennies = scnr.nextInt();
		  System.out.printf("\nHow many nickels do you have?");
		  int nickels = scnr.nextInt();
		  System.out.printf("\nHow many dimes do you have?");
		  int dimes = scnr.nextInt();
		  System.out.printf("\nHow many quarters do you have?");
		  int quarters = scnr.nextInt();
		  System.out.printf("\nHow many half-dollars do you have?");
		  int halfDollars = scnr.nextInt();
		  System.out.printf("\nHow many dollar coins do you have?");
		  int dollars = scnr.nextInt();
		  double totalMoney = dollars*1 + halfDollars*.50+ quarters*.25+ dimes*.10+ nickels*.05+ pennies*.01;
		  
		  System.out.printf("\nTotal value = $%.2f", totalMoney);
		  
		  
		  

   } // end main
}    // end class