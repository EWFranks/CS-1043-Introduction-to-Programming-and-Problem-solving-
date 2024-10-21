import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   Backward.java
Classes:     Backward
Description: Printing String Backwards with a loop.
*/
public class Backward {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String initial, rev = "";
		initial = scnr.nextLine();
		int length = initial.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + initial.charAt(i);
		System.out.println(rev);
	}
}
