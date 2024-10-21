import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Season.java
Classes:     Season
Description: Computing the season based off of the day and the month.
*/
public class Seasons {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String month = scnr.next();
		int day = scnr.nextInt();

		String s1 = ("January");
		String s2 = ("February");
		String s3 = ("March");
		String s4 = ("April");
		String s5 = ("May");
		String s6 = ("June");
		String s7 = ("July");
		String s8 = ("August");
		String s9 = ("September");
		String s10 = ("October");
		String s11 = ("November");
		String s12 = ("December");

		if ((month.equals(s12) && day >= 21) || ((month.equals(s1) && day >= 1 && day <= 31)
				|| ((month.equals(s2) && day >= 1 && day <= 28) || ((month.equals(s3) && day >= 1 && day <= 19))))){
			System.out.println("winter");
		} else if ((month.equals(s3) && day >= 21 && day <= 31) || ((month.equals(s4) && day >= 1 && day <= 30)
				|| ((month.equals(s5) && day >= 1 && day <= 31) || ((month.equals(s6) && day >= 1 && day <= 20))))) {
			System.out.println("wpring");
		} else if ((month.equals(s6) && day >= 21 && day <= 30) || ((month.equals(s7) && day >= 1 && day <= 31)
				|| ((month.equals(s8) && day >= 1 && day <= 31) || ((month.equals(s9) && day >= 1 && day <= 21))))) {
			System.out.println("wummer");
		} else if ((month.equals(s9) && day >= 22 && day <= 30) || ((month.equals(s10) && day >= 1 && day <= 31)
				|| ((month.equals(s11) && day >= 1 && day <= 30) || ((month.equals(s12) && day >= 1 && day <= 20))))) {
			System.out.println("fall");
		} else {
			System.out.print("Invalid");
		}
	}
}