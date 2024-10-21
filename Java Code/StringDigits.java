import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   StringDigits.java
Classes:     StringDigits
Description: Doing a variety of calculation for quiz scores.
*/
public class StringDigits {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		String x = scnr.nextLine();
		String str = x;
		splitString(x);
	}

	public static void splitString(String str) {

		StringBuffer letter = new StringBuffer();
		StringBuffer number = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				number.append(str.charAt(i));
			else
				letter.append(str.charAt(i));

		}
		System.out.println(letter);
		System.out.println(number);
	}
}
