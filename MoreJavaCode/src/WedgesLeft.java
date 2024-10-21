import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   Wedges.java
Classes:     Wedges
Description: Formatting outputs.
*/
public class WedgesLeft {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int nRows = scnr.nextInt();
		int nColumns = 1;
		int nSpaces = nRows + 1;
		int ic, ir, ib;

		for (ir = 1; ir <= nRows; ir++) {
			if (nRows == 1) {
				System.out.println('*');

				break;
			}
			for (ib = 1; ib >= nSpaces; ib++) {
				System.out.print(' ');
				System.out.print(' ');
			}
			for (ic = 1; ic <= nColumns; ic++) {
				System.out.print('*');
				
			}
			System.out.println();
			nColumns++;
			nSpaces--;

		}
		scnr.close();

	}
}