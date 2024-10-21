import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/31/2020
Assignment: Project 1
Description: 
*/

public class Project1 {

	private static final double EXAM_WEIGHT = 0.35;
	private static final double QUIZ_WEIGHT = 0.2;
	private static final double LAB_WEIGHT = 0.2;
	private static final double PROJECT_WEIGHT = 0.2;
	private static final double H_WORK_WEIGHT = 0.05;
	private static String[] studentNames;
	private static int[][] studentGrades = new int[20][5];

	static String printToFile = "";

	public static void main(String[] args) {

		try {
			Scanner console = new Scanner(System.in);
			System.out.println("What is the file name?");
			String filename = console.nextLine();

			File myFile1 = new File(filename);
			Scanner filereader = new Scanner(myFile1);
			filereader.nextLine();
			filereader.nextLine();

			int idx = 0;
			while (filereader.hasNextLine()) {
				String b = filereader.nextLine();

				Scanner line = new Scanner(b);

				line.next();

				studentGrades[idx][0] = Integer.parseInt(line.next());
				studentGrades[idx][1] = line.nextInt();
				studentGrades[idx][2] = line.nextInt();
				studentGrades[idx][3] = line.nextInt();
				studentGrades[idx][4] = line.nextInt();
				idx++;
			}
			console.close();

			// pass the length of the studentGrades
			double[] weightedTotals = getStudentGrade(studentGrades.length);

			// changed the type to int
			double[] averageGrades = getAverageTypeScore();

			// changed to float and 1D array
			float[] medianGrades = getMedianTypeScore();

			int[] grades = getGradeCount(weightedTotals); // total num student in letter grade

			char[] Grade = getLetterGrades(weightedTotals); // grades of size n
			// Prompt for file name
			FileWriter myFile = new FileWriter("./GradeReport.out");
			// Read from file
			PrintWriter myPrintWriter = new PrintWriter(myFile);
			// Write to the file
			myPrintWriter.println();
			// System.out.printf("%18s", "|");
			// myPrintWriter.printf("%18s", "|");
			System.out.printf("%14s", " |");
			myPrintWriter.printf("%14s", " |");

			System.out.printf("%41s", " Grades ");
			myPrintWriter.printf("%41s", " Grades ");

			System.out.printf("%33s", " |");
			myPrintWriter.printf("%33s", " |");

			System.out.printf("%2s", " Weighted Total ");
			myPrintWriter.printf("%2s", " Weighted Total ");

			System.out.printf("|");
			myPrintWriter.printf("|");

			System.out.printf(" Grade");
			myPrintWriter.printf(" Grade");

			System.out.printf("%2s", "|");
			myPrintWriter.printf("%2s", "|");

			System.out.println();
			myPrintWriter.println();
			System.out.printf(
					"________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"________________________________________________________________________________________________________________");

			System.out.println();
			myPrintWriter.println();
			// System.out.println("______________________________________________________________________________");
//			myPrintWriter.println("______________________________________________________________________________");

			System.out.printf("%2s", " Student     |");
			myPrintWriter.printf("%2s", " Student     |");

			// System.out.printf("%8s", "|");
			// myPrintWriter.printf("%8s", "|");

			System.out.printf("%14s", "Exams");
			myPrintWriter.printf("%14s", "Exams");

			System.out.printf("%14s", "Quizzess");
			myPrintWriter.printf("%14s", "Quizzess");
			System.out.printf("%14s", "Labs");
			myPrintWriter.printf("%14s", "Labs");
			System.out.printf("%14s", "Projects");
			myPrintWriter.printf("%14s", "Projects");
			System.out.printf("%14s", "Homeworks");
			myPrintWriter.printf("%14s", "Homeworks");
			System.out.printf("%4s", "|");
			myPrintWriter.printf("%4s", "|");

			System.out.printf("%17s", " |");
			myPrintWriter.printf("%17s", " |");

			System.out.printf("%8s", " |");
			myPrintWriter.printf("%8s", " |");

			System.out.println();
			myPrintWriter.println();
					
			System.out.printf(
					"_________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"_________________________________________________________________________________________________________________");

			for (int i = 0; i < studentGrades.length; i++) {
				System.out.println();
				myPrintWriter.println();
				if (i <= 11)
					System.out.printf("%-11s", " Student " + (i + 1));
				myPrintWriter.printf("%-11s", " Student " + (i + 1));
				if (i > 11)
					System.out.printf("%-9s", " Student " + (i + 1));
				//myPrintWriter.printf("%-9s", " Student " + (i + 1));

				System.out.printf("%-2s", "  |");
				myPrintWriter.printf("%-2s", "  |");

				for (int j = 0; j < studentGrades[i].length; j++) {

					// System.out.printf("%8s", "|");
					// myPrintWriter.printf("%8s", "|");

					System.out.printf("%14s", studentGrades[i][j]);
					myPrintWriter.printf("%14s", studentGrades[i][j]);

					// System.out.println("_____________________________________________________________________________________________");

				}
				System.out.printf("%4s", "|");
				myPrintWriter.printf("%4s", "|");

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");

				System.out.printf("%11.5s", weightedTotals[i]);//
				myPrintWriter.printf("%11.5s", weightedTotals[i]);

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");

				// System.out.print("______________________________________________________________________________");
				// myPrintWriter.print("______________________________________________________________________________");

				System.out.printf("%6s", "|");
				myPrintWriter.printf("%6s", "|");

				System.out.printf("%4s", Grade[i]);
				myPrintWriter.printf("%4s", Grade[i]);

				System.out.printf("%4s", "|");
				myPrintWriter.printf("%4s", "|");
			}

			// System.out.printf("%8s", "|");
			// myPrintWriter.printf("%8s", "|");

			System.out.println();
			myPrintWriter.println();
					
			System.out.printf(
					"_________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"_________________________________________________________________________________________________________________");

			System.out.println();
			myPrintWriter.println();

			System.out.printf("%-13s", " Average ");
			myPrintWriter.printf("%-13s", " Average ");

			System.out.printf("%1s", "|");
			myPrintWriter.printf("%1s", "|");

			for (int j = 0; j < 5; j++) {
				System.out.printf("%14s", averageGrades[j]);//
				myPrintWriter.printf("%14s", averageGrades[j]);

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");
			}

			System.out.printf("%4s", "|");
			myPrintWriter.printf("%4s", "|");

			System.out.printf("%17s", "|");
			myPrintWriter.printf("%17s", "|");

			System.out.printf("%8s", "|");
			myPrintWriter.printf("%8s", "|");

			System.out.println();
			myPrintWriter.println();

			// System.out.printf("%8s", "|");
			// myPrintWriter.printf("%8s", "|");
				
			System.out.printf(
					"_________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"_________________________________________________________________________________________________________________");

			System.out.println();
			myPrintWriter.println();

			System.out.printf("%-13s", " Median ");
			myPrintWriter.printf("%-13s", " Median ");

			System.out.printf("%1s", "|");
			myPrintWriter.printf("%1s", "|");

			for (int i = 0; i < 5; i++) {

				System.out.printf("%14.2f", medianGrades[i]);
				myPrintWriter.printf("%14.2f", medianGrades[i]);

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");
			}
			// System.out.print("______________________________________________________________________________");
			// myPrintWriter.println("______________________________________________________________________________");
			// System.out.println("---------------------------------------------------------------");

			System.out.printf("%4s", "|");
			myPrintWriter.printf("%4s", "|");

			System.out.printf("%17s", "|");
			myPrintWriter.printf("%17s", "|");

			System.out.printf("%8s", "|");
			myPrintWriter.printf("%8s", "|");

			System.out.println();
			myPrintWriter.println();
	
			System.out.printf(
					"_________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"_________________________________________________________________________________________________________________");

			System.out.println();
			myPrintWriter.println();
			// System.out.print("______________________________________________________________________________");
			// myPrintWriter.println("______________________________________________________________________________");

			System.out.println();
			myPrintWriter.println();

			System.out.printf("%14s", " Course  |");
			myPrintWriter.printf("%14s", " Course  |");
			System.out.printf("%10s", "A's");
			myPrintWriter.printf("%10s", "A's");

			System.out.printf("%6s", "|");
			myPrintWriter.printf("%6s", "|");

			System.out.printf("%10s", "B's");
			myPrintWriter.printf("%10s", "B's");

			System.out.printf("%6s", "|");
			myPrintWriter.printf("%6s", "|");

			System.out.printf("%10s", "C's");
			myPrintWriter.printf("%1s", "C's");

			System.out.printf("%6s", "|");
			myPrintWriter.printf("%6s", "|");

			System.out.printf("%10s", "D's");
			myPrintWriter.printf("%10s", "D's");

			System.out.printf("%6s", "|");
			myPrintWriter.printf("%6s", "|");

			System.out.printf("%10s", "F's");
			myPrintWriter.printf("%10s", "F's");

			System.out.printf("%6s", "|");
			myPrintWriter.printf("%6s", "|");

			System.out.println();
			myPrintWriter.println();

			System.out.printf(
					"_________________________________________________________________________________________________________________");
			myPrintWriter.printf(
					"_________________________________________________________________________________________________________________");
					
			System.out.println();
			myPrintWriter.println();
			// System.out.println("______________________________________________________________________________");
			// myPrintWriter.println("______________________________________________________________________________");
			System.out.printf("%6s", "C");
			myPrintWriter.printf("%6s", "C");
			System.out.printf("%8s", "|");
			myPrintWriter.printf("%8s", "|");
			// System.out.println("______________________________________________________________________________");
			// myPrintWriter.println("______________________________________________________________________________");

			// System.out.println();
			// myPrintWriter.println();

			// System.out.println();
			// myPrintWriter.println();
			for (int i = 0; i < 5; i++) {

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");

				System.out.printf("%9s", grades[i]);
				myPrintWriter.printf("%9s", grades[i]);
				System.out.printf("%7s", "|");
				myPrintWriter.printf("%7s", "|");

				// System.out.printf("%8s", "|");
				// myPrintWriter.printf("%8s", "|");

			}
			System.out.println();
			myPrintWriter.println();
			// System.out.println("______________________________________________________________________________");
			// myPrintWriter.println("______________________________________________________________________________");
			myPrintWriter.close();
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

	public static double[] getStudentGrade(int student) {
		// Returns a singles student composite(weighted sum) grade

		double weightedTotals[] = new double[student];
		for (int i = 0; i < student; i++) {
			weightedTotals[i] = (EXAM_WEIGHT * studentGrades[i][0] + QUIZ_WEIGHT * studentGrades[i][1]
					+ LAB_WEIGHT * studentGrades[i][2] + PROJECT_WEIGHT * studentGrades[i][3]
					+ H_WORK_WEIGHT * studentGrades[i][4]);
		}
		return weightedTotals;
	}

	// Changing the type of the method
	public static double[] getAverageTypeScore() {

		double[] averageGrades = new double[5];

		for (int i = 0; i < studentGrades.length; i++) {
			// OR------------>
			averageGrades[0] += studentGrades[i][0];
			averageGrades[1] += studentGrades[i][1];
			averageGrades[2] += studentGrades[i][2];
			averageGrades[3] += studentGrades[i][3];
			averageGrades[4] += studentGrades[i][4];
		}

		averageGrades[0] /= (double) studentGrades.length;
		averageGrades[1] /= (double) studentGrades.length;
		averageGrades[2] /= (double) studentGrades.length;
		averageGrades[3] /= (double) studentGrades.length;
		averageGrades[4] /= (double) studentGrades.length;

		return averageGrades;
	}

	// changing the return type
	private static float[] getMedianTypeScore() {

		float[] medianGrades = new float[5];

		for (int j = 0; j < 5; j++) { // for every subject
			// this store the marks of subject i
			int criterionGrades[] = new int[studentGrades.length];

			// now copying the marks of subject1 into this array
			for (int i = 0; i < studentGrades.length; i++) {
				criterionGrades[i] = studentGrades[i][j]; // just copying grades of subject 1
			}

			// sorting this array
			Arrays.sort(criterionGrades);

			// applying the formula of median
			if (studentGrades.length % 2 == 0) {
				medianGrades[j] = (float) ((criterionGrades[(studentGrades.length - 1) / 2]
						+ criterionGrades[(studentGrades.length) / 2]) / 2.0);
			} else {
				medianGrades[j] = criterionGrades[studentGrades.length / 2];
			}
		}

		return medianGrades;

	}

	public static char[] getLetterGrades(double[] weightedTotals) {

		char[] Grade = new char[22];

		for (int a = 0; a < studentGrades.length; a++) {

			if (weightedTotals[a] >= 90) {
				Grade[a] = 'A';
			} else if (weightedTotals[a] < 90 && weightedTotals[a] >= 80) {
				Grade[a] = 'B';
			} else if (weightedTotals[a] < 80 && weightedTotals[a] >= 70) {
				Grade[a] = 'C';
			} else if (weightedTotals[a] < 70 && weightedTotals[a] >= 60) {
				Grade[a] = 'D';
			} else if (weightedTotals[a] < 60) {
				Grade[a] = 'F';
			}
		}
		return Grade;

	}

	public static int[] getGradeCount(double[] weightedTotals) {
		// Returns an 1D array the number of student who got each letter grade
		int[] grades = new int[5];

		for (int a = 0; a <= weightedTotals.length - 1; a++) {
			if (weightedTotals[a] >= 90) {
				grades[0] += 1;
			} else if (weightedTotals[a] < 90 && weightedTotals[a] >= 80) {
				grades[1] += 1;
			} else if (weightedTotals[a] < 80 && weightedTotals[a] >= 70) {
				grades[2] += 1;
			} else if (weightedTotals[a] < 70 && weightedTotals[a] >= 60) {
				grades[3] += 1;
			} else if (weightedTotals[a] < 60) {
				grades[4] += 1;
			}

		}
		return grades;
	}

	public static void writeToFile() {
		// creates out put file
	}

}
