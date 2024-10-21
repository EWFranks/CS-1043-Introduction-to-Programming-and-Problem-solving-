import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   Backward.java
Classes:     Backward
Description: Printing String Backwards with a loop.
*/
public class Backward {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int k = scnr.nextInt();
		int[] arr = new int[k];
		for( int i = 0; i<arr.length; ++i) {
			arr[i] = scnr.nextInt(); 
		}
		for( int i = arr.length-1; i>0; --i) {
			System.out.print(arr[i]+" ");
		}
	}
}
