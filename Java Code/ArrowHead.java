import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   ArrowHead.java
Classes:     ArrowHead
Description: Writing a nested for-loop to generate an arrowhead
*/
public class ArrowHead {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int nRows = scnr.nextInt();
		int nColumns = 1;
		int nSpaces = nRows - 1;
		int ic, ir, ib;

		if (nRows % 2 == 1) {
			for (ir = 1; ir <= nRows; ir++) {
				for (ib = 1; ib <= nSpaces; ib++) {
					System.out.print(' ');
				}
				for (ic = 1; ic <= nColumns; ic++) {
					System.out.print('*');
				}
				System.out.println();
				nColumns += 2;
				nSpaces--;

			}
		}
		scnr.close();

	}
}