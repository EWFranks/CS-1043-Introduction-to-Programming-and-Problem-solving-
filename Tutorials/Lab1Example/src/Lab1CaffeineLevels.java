import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        8-26-20 
 Course:      CS 1043
 Section      1
 File Name:   Lab1CaffeineLevels.java
 Classes:     Lab1CaffeineLevels
 Description: Using and getting familiar with eclipse, such as println statements and variables
*/
public class Lab1CaffeineLevels {

	public static void main( String args[] )
	   {
	  Scanner scnr = new Scanner( System.in );
	  
	  System.out.print("input");
	  double yourValue = scnr.nextInt();
	  
	 
	  System.out.printf("After 6 hours: %.2f mg\n", yourValue/2);
	  System.out.printf("After 12 hours: %.2f mg\n", yourValue/4);
	  System.out.printf("After 24 hours: %.2f mg\n", yourValue/8);
	
}
}