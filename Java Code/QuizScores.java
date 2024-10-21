import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   QuizScores.java
Classes:     QuizScores
Description: Separating numbers from strings.
*/
public class QuizScores {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a score or enter 'stop' to exit:");

		String q = scnr.next();

		int i = 1;
		double sum = 0;
		int count = 0;
		String a = "exit";
		String w = "stop";

		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;

		while (!(a.equals(q) || (w.equals(q)))) {

			int x = Integer.parseInt(q);

			if (x < min) {
				min = x;
			}
			if (x > max) {
				max = x;

			}

			count++;
			sum += x;
			System.out.println("Enter a score or enter 'stop' to exit:");
			q = scnr.next();
			
		}
		if (count != 0) {
			System.out.printf("Sum of quiz scores: %.1f\n", sum);
			System.out.println("Number of quiz scores: " + count);
			System.out.println("Average quiz score: " + sum / count);
			System.out.printf("Maximum quiz score: %.1f\n", max );
			System.out.printf("Minimum quiz score: %.1f\n", min );
		}
	}
}
