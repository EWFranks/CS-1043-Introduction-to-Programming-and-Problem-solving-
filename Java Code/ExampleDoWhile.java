import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   ArrowHead.java
Classes:     ArrowHead
Description: Writing a nested for-loop to generate an arrowhead
*/
public class ExampleDoWhile {
	public static void main(String[] args) {

		int total = 0;
		int value;
		String input = "0";
		Scanner scnr = new Scanner(System.in);

		do {
				
			value = Integer.parseInt(input);
			total += value;
			System.out.print("Enter an integer or stop to exit: ");
			input = scnr.next();
			
			
		} while ( ! input.equalsIgnoreCase("stop"));
		
		System.out.printf("Sum Total = %d\n", total);
		scnr.close();

	}
}
