import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-6-20 
Course:      CS 1043
Section      1
File Name:   BowTie.java
Classes:     BowTie
Description: Using nested loops to make a bow tie type figure.
*/

public class BowTie {
	public static void main(String[] args) {
		// Open Scanner
		Scanner console = new Scanner(System.in);
		int nRows = console.nextInt();

		if (nRows % 2 == 1) {
			int ir, ic, ib;
			int nStars = 1;
			int nSpaces = nRows - 2; // the left and right star.

			for (ir = 1; ir <= nRows; ++ir) {
				if (ir != nRows / 2 + 1) { // if it's not the center line, then:
					for (ic = 1; ic <= nStars; ic++) { // left stars
						System.out.print('*');
					}
					for (ib = 1; ib <= nSpaces; ib++) { // center spaces
						System.out.print(' ');
					}
					for (ic = 1; ic <= nStars; ic++) { // right stars
						System.out.print('*');
					}
					System.out.println();
					if (ir < nRows / 2) {
						nSpaces -= 2;
						++nStars;
					} else {
						nSpaces += 2;
						--nStars;
					}
				} else { // the center line is special!
					for (ic = 1; ic <= nRows; ic++) {
						System.out.print('*');
					}
					System.out.println();
					nSpaces = 1; // Reset the spaces and stars.
					nStars = nRows / 2;
				}
			}

		} // end if
		console.close();
	} // end main
} // enc class