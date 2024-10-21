import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/28/2020
Assignment: Lab 11
Description: Demonstrating the ability to format an output
*/
//c
public class WriteToFile {
//Your main for Lab 11
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("What is the file name?");
		String filename = console.nextLine();
		int[][] gradesArray = Lab10Tools.fromFile(filename);

		
		/*
		 * Exception Handling A Try Block "runs the code" and if there is an error that
		 * causes execution of a program to catastrophically fail, e.g., a runtime error
		 * not caught by syntax checking such as a divide by zero error. then the
		 * program will not fail but will instead execute the code in the catch block if
		 * the error matches the type specified.
		 */
		try {
			FileWriter myFile = new FileWriter("./myFileName.txt");// Write Your File Writer Code here
			PrintWriter myPrintWriter = new PrintWriter(myFile);
			myPrintWriter.println();
			
		
				;
			{// Write Your Print Writer Code Here
					
	

				int[] students = calcTotalStudents(gradesArray);
				double[][] percentage = calcPCT(gradesArray, students);
				double[] average = calcAveragePercent(percentage, gradesArray);
				
				myPrintWriter.printf("%37s", " Grades ");
				myPrintWriter.printf("%34s", " # students ");

				myPrintWriter.println();

				myPrintWriter.println("_______________________________________________________________________");

				myPrintWriter.printf("%-8s", " Course");
				myPrintWriter.printf("%12s", "A");
				myPrintWriter.printf("%8s", "B");
				myPrintWriter.printf("%8s", "C");
				myPrintWriter.printf("%8s", "D");
				myPrintWriter.printf("%8s", "F");
				myPrintWriter.println();
				myPrintWriter.println("_______________________________________________________________________");
				
				for (int i = 0; i < gradesArray.length; i++) {
					myPrintWriter.println();
					if (i < 30)
						myPrintWriter.printf("%-10s", " Course " + (i + 1)); //here
						myPrintWriter.printf("%2s", "|");
					for (int j = 0; j < gradesArray[i].length; j++) {

						myPrintWriter.printf("%8s", gradesArray[i][j]);
					}
					myPrintWriter.printf("%8s", "|");
					myPrintWriter.printf("%8s", students[i]);
					
					myPrintWriter.println();
				
					if (i <= gradesArray.length-2)
					myPrintWriter.print("            _______________________________________________");
				
					if (i > gradesArray.length-2)
						myPrintWriter.println("_______________________________________________________________________");
				}
				//myPrintWriter.println("_______________________________________________________________________");
				myPrintWriter.println();
				
				myPrintWriter.printf("%-13s", " Avg %");

				for (int i = 0; i < 5; i++) {

					myPrintWriter.printf("%8.2f", average[i]);
				} // Copy your main code from Lab 10 here (note you will also need to copy any
					// methods you
			}

			myFile.close();// called in your code into this class)
//close your file here
		} catch (FileNotFoundException err) {// Catch the errors(exceptions) based on type TYPE NAME
			/*
			 * Here you can catch errors (more formally know as exceptions) from the program
			 * .... and tell it what to do based on the information about the exception
			 * which was passed as a variable
			 */
			err.printStackTrace();// lets us know what happened
		} // you can have multiple catch blocks ... but only one catch block will run
		catch (Exception err) {
			err.printStackTrace();// lets us know what happened
		} finally {
			/*
			 * A finally block is what your code does regardless of how the program runs: No
			 * errors in the Try block ==> the finally block is run after Errors Cause the
			 * first Catch block to run ==> the finally block is run after Errors Cause any
			 * Catch block to run ==> the finally block is run after
			 */
			System.out.println("You have saved the data to the file");
		}
	}

	public static int[] calcTotalStudents(int[][] gradesArray) {
		int rtotal = 0;

		int[] student = new int[gradesArray.length];
		for (int i = 0; i < gradesArray.length; i++) {
			rtotal = 0;
			for (int j = 0; j < gradesArray[i].length; j++) {
				rtotal = rtotal + gradesArray[i][j];
			}
			student[i] = rtotal;
			// System.out.println("---------------------------------------------------------------");
		}
		return student;
	}

	public static double[][] calcPCT(int[][] gradesArray, int[] N) {

		double[][] pct = new double[gradesArray.length][5];
		for (int i = 0; i < gradesArray.length; i++) {
			for (int j = 0; j < gradesArray[i].length; j++) {
				pct[i][j] = 100 * gradesArray[i][j] / N[i];
			}
			// System.out.println("---------------------------------------------------------------");
		}
		return pct;
	}

	public static double[] calcAveragePercent(double[][] pct, int[][] gradeArray) {

		double[] average = new double[5];
		double sum;
		for (int i = 0; i < 5; i++) {
			sum = 0.0;
			for (int j = 0; j < gradeArray.length; j++) {
				sum += pct[j][i];
			}
			average[i] = sum / gradeArray.length;
			// System.out.println("---------------------------------------------------------------");
		}
		return average;// COPY ANY METHODS YOU MADE IN LAB 10 HERE!!!
	}
}