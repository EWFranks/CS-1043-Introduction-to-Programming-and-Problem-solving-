
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/6/2020 
Assignment: Lab 1
Description: Learning to use Eclipse and creating a pay period calculator
*/
import java.util.Scanner;// Place this line at the very top of your file
import java.lang.Math;// This is the import line for the Math package

public class Lab1Payment {
	
	public static void main(String[] args) {
		// You can put your previous print statement you did in the eclipse setup here
		// if you wish but you are not required to
	
		// Create your scanner instance here
		//This line creates a new instance of the Scanner class and places it in a
		//variable named ’myScannersName’
		Scanner myScannersName = new Scanner(System.in);// place this line in your main method
		
		// Prompt the employee to input days months and years here
		System.out.print("Years Worked: ");//this line prompts the user with the message Days Worked:
		int years = myScannersName.nextInt();
		
		System.out.print("Months Worked: ");//this line prompts the user with the message Days Worked:
		int month = myScannersName.nextInt();
			
		System.out.print("Days Worked: ");//this line prompts the user with the message Days Worked:
		int days = myScannersName.nextInt();
		
		//Write your twoWeekPayPeriodsWorked calculation code here
		int totalWeeksWorked = 52*years+4*month+ days/7;
		int twoWeekPayPeriodWorked = totalWeeksWorked/2;
				
		//print the result of the twoWeekPayPeriodsWorked calculation here
		System.out.println("Numbers of full 2 week pay period is: " + twoWeekPayPeriodWorked);
		
		// Use formula 1 and formula 2 and make your calculation here
		double vacationDaysPotentiallyEarned = 3.0769 * twoWeekPayPeriodWorked * (5.0/40.0);
		double vacationDaysEarned = Math.round(Math.min(vacationDaysPotentiallyEarned, 5*6));
	
		//Print out the number of vacation days the employee has earned
		System.out.println("Vacation Days Earned: "+vacationDaysEarned);
		}

}
