import java.io.File;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/24/2020 
Assignment: Lab 10
Description: Two Dimensional Arrays
*/

public class Lab10 {
	// C:\Users\xboxl\eclipse-workspace\Lab10TwoDimensionalArrays\src\Grades.in

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("What is the file name?");
		String filename = console.nextLine();

		int[][] gradesArray = Lab10Tools.fromFile(filename);

		console.close();

		int[] students = calcTotalStudents(gradesArray);
		double[][] percentage = calcPCT(gradesArray, students);
		double[] average = calcAveragePercent(percentage, gradesArray);

		System.out.printf("%35s", " Grades ");
		System.out.printf("%29s", " # students ");
		
		System.out.println();

		System.out.println("---------------------------------------------------------------");

		System.out.printf("%-8s", " Course");
		System.out.printf("%9s", "A");
		System.out.printf("%8s", "B");
		System.out.printf("%8s", "C");
		System.out.printf("%8s", "D");
		System.out.printf("%8s", "F");
		System.out.println();
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < gradesArray.length; i++) {
			System.out.println();
			if (i < 30)
				System.out.printf("%-10s", " Course " + (i + 1));
			for (int j = 0; j < gradesArray[i].length; j++) {

				System.out.printf("%8s", gradesArray[i][j]);
			}
			System.out.printf("%10s", students[i]);
			System.out.println();
			System.out.print("---------------------------------------------------------------");
		}
		
		System.out.println();
		System.out.printf("%-13s", " Avg %");
		
		for (int i = 0; i < 5; i++) {

			System.out.printf("%8.2f", average[i]);
		}
		//System.out.println("---------------------------------------------------------------");
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
		//	System.out.println("---------------------------------------------------------------");
		}
		return student;
	}

	public static double[][] calcPCT(int[][] gradesArray, int[] N) {

		double[][] pct = new double[gradesArray.length][5];
		for (int i = 0; i < gradesArray.length; i++) {
			for (int j = 0; j < gradesArray[i].length; j++) {
				pct[i][j] = 100 * gradesArray[i][j] / N[i];
			}
			//System.out.println("---------------------------------------------------------------");
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
		//	System.out.println("---------------------------------------------------------------");
		}
		return average;
	}
}
