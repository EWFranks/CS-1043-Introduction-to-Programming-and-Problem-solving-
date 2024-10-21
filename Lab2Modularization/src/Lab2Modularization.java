
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/7/2020 
Assignment: Lab 2
Description: Modularization with Static Methods
*/
import java.lang.Math; // place import above the class declaration
import java.util.Scanner;

public class Lab2Modularization {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
	
		System.out.print("What is the radius: "); 
		double radius = myScanner.nextDouble(); 
		
		
		System.out.println("The area of the circle is: "+ circleArea(radius));
		
		}
		
		
		public static double circleArea(double rad) {
			
		double x = ellipseArea(rad,rad);
		return x;
		
		}
		
		//public double minorAxis;
		//public double majorAxis;   
		
		{
		
		
		//minorAxis = majorAxis;  
		
		  }
		
		public static double ellipseArea(double minorAxis,double majorAxis) {
				return (Math.PI * minorAxis * majorAxis);
		
	}
}

