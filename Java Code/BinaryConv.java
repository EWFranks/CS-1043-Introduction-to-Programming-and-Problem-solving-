import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-30-20 
Course:      CS 1043
Section      1
File Name:   BinaryConv.java
Classes:     BinaryConv
Description: Convert a positive number to binary.
*/
public class BinaryConv {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String Str ="";
		int x = scnr.nextInt();
		while (x == 0) {
			System.out.print(x);
			break;
		}
		while (x > 0) {
			if(x%2==1)
				Str+='1';
			else
				Str+='0';
			x=x/2;
		}
			StringBuffer end = new StringBuffer(Str);
			end.reverse();
			
			
			System.out.print(end);
			
		

	}

}
