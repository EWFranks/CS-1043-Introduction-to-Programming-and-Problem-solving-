
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/14/2020 
Assignment: Lab 4
Description: The Use of Conditional Branching
*/

import java.util.Scanner;

public class gradeDriver {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	
	
	//Prompt for student’s name
	System.out.println("student's name");
	String studentName = console.nextLine();
	//Prompt for average exam grade
	System.out.println("average exam grade");
	double examGrade = console.nextDouble(); 
	//Prompt for average quiz grade
	System.out.println("average quiz grade");
	double quizGrade = console.nextDouble(); 
	//Prompt for average lab grade
	System.out.println("average lab grade");
	double labGrade = console.nextDouble(); 
	//Prompt for average project grade
	System.out.println("average project grade");
	double projectGrade = console.nextDouble(); 
	//Prompt for average homework grade
	System.out.println("average homework grade");
	double homeworkGrade = console.nextDouble();  
	
	//create new object of type student
	 Student name = new Student(studentName, quizGrade, examGrade, labGrade, projectGrade, homeworkGrade);
	 	name.getWeightedScore();
	// Compute the weighted score and letter grade of the student
	//Student name = Student(studentName, examGrade, labGrade, projectGrade, homeworkGrade);
	 	//name.getWeightedScore();
	//System.out.print(name.getWeightedScore());	
	//print out the toString from the object just created
	System.out.print(name.toString());
	
	}
}