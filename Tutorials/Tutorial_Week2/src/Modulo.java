import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        9-2-20 
 Course:      CS 1043
 Section      1
 File Name:   Modulo.java
 Classes:     Modulo
 Description: Using and getting familiar with using the modulo operator
*/

public class Modulo {

	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the dividend then divisor:");
		
		int divid = scnr.nextInt();
		int divis = scnr.nextInt();
		
		int quot = divid/divis;
		int remain = divid%divis;
		
		System.out.println("Quotient = "+ quot);
		System.out.println("Remainder = "+ remain);
		
		scnr.close();
	}
}