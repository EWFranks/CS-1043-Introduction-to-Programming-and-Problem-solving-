import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        10-14-20 
Course:      CS 1043
Section      1
File Name:   FormatedTable.java
Classes:     FormatedTable
Description: Formating tables.
*/

public class FormatTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		
		double rLoan = myScanner.nextDouble();
		System.out.printf("Table of monthly payments for a dollar loan amount of $%,.2f", rLoan );
		System.out.println();
		System.out.println();
		System.out.print("Years:");
		
		System.out.printf("%12d%15d%15d%15d", 15, 20, 25, 30);
		
			int durationYears=15;
			while (durationYears<= 30) {
			//System.out.printf("%12d", durationYears);//this line prompts the user with the message Days Worked: 
			durationYears+=5;
			}
			System.out.println();
			System.out.println("_________________________________________________________________");
			
			double i=.040;
			durationYears=15;
			while (i <=.070) {
				System.out.printf("%.1f%% ",i*100);	
				
				while (durationYears<=30)	{
					
				
				System.out.printf("%15.2f", Payment(rLoan,i/12, durationYears));
				durationYears+=5;
				}
				durationYears=15;
				i+=.005;
				System.out.println();
			}	
			}
	
	
	public static double Payment(double r, double in,double n) {
		double tmp = Math.pow( (1 + in), 12*n );
		return r*in*tmp/(tmp-1);
	}
}