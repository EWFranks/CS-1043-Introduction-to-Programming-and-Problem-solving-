import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   ExactChange.java
Classes:     ExactChange
Description: Computing the values through a currency formula.
*/

public class Lab2ExactChange {  
	   
   public static void main( String[] args ) {
		   
	  java.util.Scanner scnr = new Scanner(System.in);
	  int dollars = 100;
	  int halfDollars = 50;
	  int quarters = 25;
	  int dimes = 10;
	  int nickels = 5;
	  int pennies = 1;
	 
	  
	  System.out.print("Enter the amount in cents:");
	  
	  int amt = scnr.nextInt();
	  System.out.println("The change for " + amt + " cents is:");
	 
	  
	  int ndollars = amt / dollars;
	  amt %= dollars;
	  
	  int nhalfds = amt / halfDollars;
	  amt %= halfDollars;
	  
	  int nquarters = amt / quarters;
	  amt %= quarters;
	  
	  int ndimes = amt / dimes;
	  amt %= dimes;
	  
	  int nicks = amt / nickels;
	  amt %= nickels;
	  
	  int pen = amt / pennies;
	  amt %= pennies;
	  
		  if(dollars>0)
			System.out.println("Dollars = "+ ndollars);
		  else
			  System.out.println("Dollars = 0");
		  if(halfDollars>0)
		  	System.out.println("Half-Dollars = "+ nhalfds);
		  if(quarters>0)
		  	System.out.println("Quarters = "+ nquarters);
		  if(dimes>0)
		  	System.out.println("Dimes = "+ ndimes);
		  if(nickels>0)
		  	System.out.println("Nickels = "+ nicks);
		  if(pennies>0)
			  	System.out.println("Pennies = "+ pen);
			
   } // end main
}    // end class