
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/15/2020 
Assignment: Lab 5
Description: The Use of Switch Statements
*/
import java.util.Date;
import java.util.Scanner;

public class RegistrationDriver {

	final private static String GRAD_DATE = "Thursday 3/28/19";
	final private static String SENIOR_DATE = "Monday 4/1/19";
	final private static String JUNIOR_DATE = "Wednesday 4/3/19";
	final private static String SOPHOMORE_DATE = "Monday 4/8/19";
	final private static String FRESHMAN_DATE = "Wednesday 4/10/19";
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		//Prompt the user for the students year (PhD, Masters, Senior, Junior, Sophomore, or Freshman)
		System.out.print("What is the students year: "); 
		String standing = console.next();
		
	
			System.out.println(studentDate(standing));
			
		//make sure that unrecognized inputs are correctly handled and produce meaningful outputs
		
		console.close(); }
	

	//Write a static method that uses a switch statement to choose a registration date based on in put given by the user
 		public static String studentDate(String input) {
 			String dateString;
 			
 		switch (input.toLowerCase()) {
 		case "phd":
 		case "masters":
 			dateString = GRAD_DATE;
 		break;
		case "senior": 
			dateString = SENIOR_DATE;
		break;
		case "junior":
			dateString = JUNIOR_DATE; 
 		break;
		case "sophomore":
			dateString = SOPHOMORE_DATE;
 		break;
		case "freshman":
			dateString = FRESHMAN_DATE;
		break;
		default: 
			dateString = "default case";
		break;
 		}
		return dateString;	
 		}	
	}