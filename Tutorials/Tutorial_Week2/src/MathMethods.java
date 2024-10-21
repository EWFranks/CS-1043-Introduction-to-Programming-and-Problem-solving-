import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        9-2-20 
 Course:      CS 1043
 Section      1
 File Name:   MathMethods.java
 Classes:     MathMethods
 Description: Using and assigning variable to mathematical powers
*/

public class MathMethods {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		double x = scnr.nextDouble();
		double y = scnr.nextDouble();
		double z = scnr.nextDouble();
		
		double r1 = Math.pow(x, z);
		System.out.print(r1+ " ");
		
		double r2 = Math.pow(x, Math.pow(y, z));
		System.out.print(r2+ " ");
		
		System.out.print(Math.abs(y)+ " ");
		scnr.close();
		
		double r3 = Math.sqrt(Math.pow(x*y,  z));
		System.out.print(r3);
	}
}