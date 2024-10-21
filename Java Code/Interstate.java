import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        9-23-20 
Course:      CS 1043
Section      1
File Name:   Interstate.java
Classes:     Interstate
Description: Computing the direction of certain road types
*/

public class Interstate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		if (num >= 1 && num <= 99) {
			if (num % 2 == 1) {
				System.out.println("The " + num + " is primary, going north/south.");
			} else
				System.out.println("The" + num + " is primary, going east/west.");

		} else if (num >= 100 && num <= 999) {
			int last = num % 100;
			if (num % 2 == 1) {
				System.out.println("The" + num + " is auxiliary, serving the " +last +" , going north/south.");
			} else
				System.out.println("The " + num + " is auxiliary, serving the " + last+ " , going east/west.");
		} else {
			System.out.println(num + " is not a valid interstate highway number.");

		}
	}
}