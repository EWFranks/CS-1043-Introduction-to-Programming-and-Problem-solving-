import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-16-20 
Course:      CS 1043
Section      1
File Name:   TaxTable.java
Classes:     TaxTable
Description: Computing quadrants with specific points of x and y.
*/

public class CartesianPlane {

	public static void main(String[] args) {
		
		Scanner console = new Scanner( System.in );
		
		double xc = console.nextDouble();	
		double yc = console.nextDouble();
		if ( xc == 0 && yc == 0)
			System.out.println( "origin");
		else if ( xc ==0 && yc != 0 )
			System.out.println("y-axis");
		else if ( xc !=0 && yc == 0 )
			System.out.println("x-axis");
		else if ( xc > 0 && yc > 0 )
			System.out.println("Q1");	
		else if ( xc < 0 && yc > 0 )
			System.out.println("Q2");
		else if ( xc < 0 && yc < 0 )
			System.out.println("Q3");
		else if ( xc > 0 && yc < 0 )
			System.out.println("Q4");
	}
}