import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-6-20 
Course:      CS 1043
Section      1
File Name:   HourGlass.java
Classes:     HourGlass
Description: Using nested loops to make and hour glass type figure
*/
public class HourGlass {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int z;

		z = scnr.nextInt();
		int q = z / 2;

		if (z % 2 == 1) {
			for (int i = 0; i < z; i++) {
				int k = i;
				if (i > q) {
					k = z - k - 1;
				}
				for (int j = 0; j < k; j++) {
					System.out.print(' ');
				}

				for (int j = z - 2 * k; j > 0; j--) {
					System.out.print('*');

				}
				System.out.println();
				;
			}
		}
	}
}
