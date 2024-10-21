import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-13-20 
Course:      CS 1043
Section      1
File Name:   ForEachLoop.java
Classes:     ForEachLoop
Description: Formating arrays with loops.
*/

public class ForEachLoop {

	public static void main(String[] args) {

		int[][] table = { { 1, 2, 3 }, { 6, 5, 4, }, { 7, 8, 9 } };
		/*
		 * int [] example = { 8, 9, 10, 11 };
		 * 
		 * for (int target : example ) {
		 * 
		 * System.out.printf( "%4d", target );
		 * 
		 * }
		 */

		for (int[] ar1D : table) {
			for (int target : ar1D) {
				System.out.printf("%4d", target);
			}
			System.out.println();
		}

	}
}
