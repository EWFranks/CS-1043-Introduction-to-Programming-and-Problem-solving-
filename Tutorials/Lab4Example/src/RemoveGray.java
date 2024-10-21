import java.io.Console;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-23-20 
Course:      CS 1043
Section      1
File Name:   RemoveGray.java
Classes:     RemoveGray
Description: Computing RGB and removing gray.
*/

public class RemoveGray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	
	
	
	if (a<=255 && b<=255 && c<=255 ) {
	int start = Math.min(a, Math.min(b, c));
	a-=start;
	b-=start;
	c-=start;
	System.out.println(a+", "+b+", "+c);
}else{
	System.out.println("Invalid input: color values are from 0 to 255.");
}
}
}