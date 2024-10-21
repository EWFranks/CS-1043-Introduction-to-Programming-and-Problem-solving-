import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-7-20 
Course:      CS 1043
Section      1
File Name:   DicePai.java
Classes:     DicePair
Description: Formating of grouping numbers from a dice pair
*/
public class DicePair {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int nSides = scnr.nextInt();
		int ir = 1, ic = 1;

		for (ir = 1; ir <= nSides; ++ir) {
			for (ic = 1; ic <= nSides; ++ic) {
				System.out.printf("(%d, %d) ", ir, ic);
			}	
		System.out.println();
	}
	
}
}