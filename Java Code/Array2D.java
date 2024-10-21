import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-13-20 
Course:      CS 1043
Section      1
File Name:   Array2D.java
Classes:     Array2D
Description: Formating arrays with loops.
*/

public class Array2D {

	public static void main(String[] args) {
	   int ir, ic;  // loop counters
	   Scanner console = new Scanner( System.in );
		
	   int [][] array2D = { 
               { 7, 2, 0, 8 },    // row 0, columns 0 to 3
			      { 6, 5, 4, 9, 2 }, // row 1, columns 0 to 4
               { 1, 2, 3 } };     // row 2, columns 0 to 2

   // 1. Display all 2-D array elements as a left justified table
	   System.out.println("The 2D array: ");
	   for ( ir = 0; ir < array2D.length; ir++ ) {
		   for ( ic = 0; ic < array2D[ir].length; ic++) {
			   System.out.printf("%-4d", array2D[ir][ic] );
		   }
		   System.out.println();
	   }

	   // 2. Display the number of array elements. Add logic to find the
	   //    longest row.
	   // 
	   
		int total = 0;    // running sum total
		int longRowIdx = 0;  // this is the length of the longest row
		int longRow = 0;
		
		for ( ir = 0; ir<array2D.length; ir++ ) {
			total += array2D[ir].length;
			if ( array2D[ir].length > longRow ) {
				longRow = array2D[ir].length;
				longRowIdx = ir;
			}
		}

      System.out.printf("\nTotal number of array elements: %d\n", total );

		System.out.printf("Row index %d, has %d members.\n", longRowIdx, 
						longRow );
		
		total = 0;
		
	   for ( ir = 0; ir < array2D.length; ir++ ) {
		   for( ic = 0; ic< array2D[ir].length; ic++) {
			   total += array2D[ir][ic];
		   }
	   }
		
	   // 3. Sum all array elements and display the total:
	
		
        System.out.printf("Sum of all array elements: %d\n", total );
		
	   // 4. Select and display a column given its index:
	   
		System.out.print("\nEnter a column index to display: ");
		ic = console.nextInt();
		ic = Math.min( longRow-1, Math.max(ic, 0) ); // prevents bounds error.
	
		for ( ir = 0; ir < array2D.length; ir++) {
			if (ic < array2D[ir].length)
			System.out.printf("%d\n", array2D[ir][ic] );
			else
				System.out.println("empty");
		}

 
			console.close();
	}			// end main
}				// end class