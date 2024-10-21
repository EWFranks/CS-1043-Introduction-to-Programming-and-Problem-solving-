import java.util.Scanner;
import java.text.NumberFormat;
/*
Author:      Eliga Franks
Date:        9-23-20 
Course:      CS 1043
Section      1
File Name:   Commission.java
Classes:     Commission
Description: Computing the pay based off commissions and percent of sales.
*/

public class Commission {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	System.out.println("");
	int current = scnr.nextInt();
	int return1 = scnr.nextInt();
	
	NumberFormat myFormat = NumberFormat.getInstance();
	myFormat.setGroupingUsed(true);
	
	double net = (double) current - return1;
	
	if (net > 0 && net <= 1000) {
	double net2= (net*.01+2500);
	System.out.printf("Total monthly pay = $%,.2f",(net2));
	System.out.printf(" based on net sales of $%,.2f", net);
	}else {
	if ( net>1000) {
		double new1 = ((1000*.01)+ (net-1000)*.03)+(2500);
		System.out.printf("Total monthly pay = $%,.2f", new1);
		System.out.printf(" based on net sales of $%,.2f", net);	
	}
	else {
	if (net<=0) {
	System.out.printf("Total monthly pay = $2,500.00 based on net sales of $0.00");
	}
	}
}
}
}