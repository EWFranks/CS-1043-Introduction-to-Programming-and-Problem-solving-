import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        9-2-20 
 Course:      CS 1043
 Section      1
 File Name:   MusicalNotes.java
 Classes:     MusicalNotes
 Description: Using and assigning variable to mathematical powers
*/

public class MusicalNotes {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		final double RVAL = Math.pow(2,  1.0/12.0);
		
		double f0 = scnr.nextDouble();
		
		double f1 = f0*Math.pow( RVAL, 1);
		double f2 = f0*Math.pow( RVAL, 2);
		double f3 = f0*Math.pow( RVAL, 3);
		double f4 = f0*Math.pow( RVAL, 4);
		
		System.out.printf("%.2f ", f0);
		System.out.printf("%.2f ", f1);
		System.out.printf("%.2f ", f2);
		System.out.printf("%.2f ", f3);
		System.out.printf("%.2f ", f4);
		
		scnr.close();
		
	}
}
