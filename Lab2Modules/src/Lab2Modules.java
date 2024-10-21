
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/7/2020 
Assignment: Lab 1
Description: Modularization with static Methods 
*/
import java.util.Scanner;
	
public class Lab2Modules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanners = new Scanner(System.in);// place this line in your main method
		
		System.out.print("Enter Height Feet: ");//this line prompts the user with the message Days Worked:
		int heightFt = myScanners.nextInt();
		
		System.out.print("Enter Height Inches: ");//this line prompts the user with the message Days Worked:
		int heightIn = myScanners.nextInt();
		
		System.out.println("Height in Meters; "+mToS(heightFt,heightIn));
	}
	
	public static double mToS(int feet,int inches) {
		
		//convert
		return 0.3048*(feet + inches*0.833);
		
	}
}