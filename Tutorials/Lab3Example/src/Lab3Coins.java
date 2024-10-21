import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Lab3Coins.java
Classes:     Lab3Coins
Description: Computing amount of coins and dollars.
*/

public class Lab3Coins {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int dollars = 100;
		int halfDollars = 50;
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;

		System.out.print("");

		int amt = scnr.nextInt();
		scnr.close();
		
		int originalamt = amt;
		
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

		
		
		if (0 == originalamt)
			System.out.println("\nno change");

		if (originalamt > 0) {

			if (ndollars > 0) {
				if (1 == ndollars) {
					System.out.println("1 dollar");
				} else {
					System.out.println(ndollars + " dollars");
				}
			}
			if (nhalfds > 0) {
				if (1 == nhalfds) {
					System.out.println("1 half-dollar");
				} else {
					System.out.println(nhalfds + " half-dollars");
				}
			}

			if (nquarters > 0) {
				if (1 == nquarters) {
					System.out.println("1 quarter");
				} else {
					System.out.println(nquarters + " quarters");
				}
			}

			if (ndimes > 0) {
				if (1 == ndimes) {
					System.out.println("1 dime");
				} else {
					System.out.println(ndimes + " dimes");
				}
			}

			if (nicks > 0) {
				if (1 == nicks) {
					System.out.println("1 nickel");
				} else {
					System.out.println(nicks + "nickels");
				}
			}

			if (pen > 0)

			{
				if (1 == pen) {
					System.out.println("1 penny");
				} else {
					System.out.println(pen + " pennies");

				}
			}
		}
	}
}
