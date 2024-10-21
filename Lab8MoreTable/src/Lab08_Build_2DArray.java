import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-21-20 
Course:      CS 1043
Section      1
File Name:   Lab08_MaxColumn.java
Classes:     Lab08_MaxColumn
Description: Using nested loops to make a bow tie type figure.
*/

import java.util.Scanner;

public class Lab08_Build_2DArray {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int nRows = Integer.parseInt(console.nextLine());
		nRows = Math.max(0, nRows);

		// Define the arrays:
		String[] inputData;
		int[][] data = new int[nRows][]; // allocate number of rows
		int ir, ic;

		
		
		// For each row:
		for (ir = 0; ir < nRows; ir++) {
			System.out.print("Enter a row of comma separated numbers: ");
			inputData = console.nextLine().split(",");			
			data[ir] = new int[inputData.length]; // allocate row length

			// For each String, convert and place in the 2D-array.
			for (ic = 0; ic < data[ir].length; ic++) {
				data[ir][ic] = Integer.parseInt(inputData[ic].trim());
			}
		}
			for (ir = 0; ir < nRows; ir++) {
				for (ic = 0; ic < data[ir].length; ic++) {
					System.out.printf("%5d", data[ir][ic]);

				}

				System.out.println();
			

		}
		console.close();
	}
}
