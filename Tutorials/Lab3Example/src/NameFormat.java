import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   NameFormat.java
Classes:     NameFormat
Description: Arranging string from console in a specific order.
*/

public class NameFormat {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		String[] formation = name.split(" ");
		
		if(formation.length==3)
			System.out.println(formation[2]+", "+formation[0]+" "+formation[1].charAt(0)+".");
		else
			System.out.println(formation[1]+", "+formation[0]);
		
	}
}
