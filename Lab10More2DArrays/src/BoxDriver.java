import java.lang.Math;
import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        11-4-20 
 Course:      CS 1043
 Section      1
 File Name:   BallDriver.java
 Classes:     BallDriver
 Description: The Destination of classes and Data Types
*/

public class BoxDriver {

	public static void main(String[] args) {
		//allowing the values to be transfered through the methods.
		Box b = new Box();
		
		Scanner scnr = new Scanner(System.in);
		//prompting the user for the color, length, depth, height and storing them in the console.
		
		System.out.println("Enter the length = ");
		double length=scnr.nextDouble();
		System.out.println("Enter the depth = ");
		double depth=scnr.nextDouble();
		System.out.println("Enter the height = ");
		double height=scnr.nextDouble();
		System.out.println("Enter the color = ");
		String color=scnr.next();
		
		//closing the scanner class
		//scnr.close();
		//setting the values from the box class to the correct variables.
		b.setHeight(height);
		b.setDepth(depth);
		b.setLength(length);
		b.setColor(color);
		
		//Box c = new Box(7.50, 6.00, 5.00, "blue");
		//printing out the variables from .set
		System.out.print(b);
		//System.out.print(c);
	}
}
