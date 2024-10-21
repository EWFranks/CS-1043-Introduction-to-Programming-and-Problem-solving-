import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-21-20 
Course:      CS 1043
Section      1
File Name:   Lab08_MaxColumn.java
Classes:     Lab08_MaxColumn
Description: Outputting specific number from max column calculation from an array.
*/

public class Lab08_MaxColumn {
	public static void main(String[] args) {
		// find the column in the data array with the maximum sum.
		int[][] data = { { 7, 2, 0, 8 }, { 6, 5, 4, 9, 2 }, { 1, 2, 3 } };

		// int ir, ic;

		/*
		 * Use a for-loop to determine the maximum row length.
		 */
		int totCol = 0;
		for (int i = 0; i < data.length; i++) {
			totCol = Math.max(totCol, data[i].length);
		}

		int maxRowLength = data[0].length; // Add your code here:
		int colIndexMaxSum = 0;
		int total;
		int maxsum = 0;
		
		for (int col = 0; col < totCol; col++) {
			int newSum = 0;

			for (int row = 0; row < data.length; row++) {
				if (data[row].length > col )
					 newSum += data[row][col];

			}
			if (newSum > maxsum) {
				maxsum = newSum;
				colIndexMaxSum = col;

			}
		}
			/*
			 * Find the column with the maximum sum.
			 */
			// int maxSum = Integer.MIN_VALUE; // smallest possible value
		
			// Add your code here:

		System.out.printf("Column index %d, has the largest sum = %d.\n", colIndexMaxSum, maxsum);
		
	}
}
