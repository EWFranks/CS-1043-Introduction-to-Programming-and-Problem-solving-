import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-7-20 
Course:      CS 1043
Section      1
File Name:   DicePai.java
Classes:     DicePair
Description: Formating list with arrays
*/
public class RemoveBias {
	public static void main(String[] args) {

		Scanner console = new Scanner( System.in );
		System.out.print("Enter a comma separated list of numbers: ");
		
		String [] inpStrings = console.nextLine().split(",");
		int idx;
		double avg = 0.0;

		// instantiate the new data array
		double [] data = new double[ inpStrings.length]; // fix this!
		
		// convert the input strings into numbers.
		// compute the running sum.
		
		for ( idx=0; idx < data.length; ++idx ) {
			data[idx] = Double.parseDouble( inpStrings[idx] );
			avg+=data[idx];
		}
		avg /= data.length;
		// Remove the bias (subtract the average) and display the results
		for ( idx=0; idx < data.length; ++idx) {
			data[idx] -= avg;
			 System.out.printf( "data[%d] = %.2f \n", idx, data[idx] );
		}
		console.close();
	}
}