import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/22/2020 
Assignment: Lab 8
Description: The developmental table of the future SIP
*/
public class FutureSIP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter your Regular Monthly Investment: ");//this line prompts the user with the message Days Worked:
		double rMonthlyInvestment = myScanner.nextDouble();
		System.out.printf("Table of Values for a SIP with a regular monthly investment of %5.2f", rMonthlyInvestment );
		System.out.println();
		System.out.print("Months: ");
		
			int durationMonths=30;
			while (durationMonths<= 90) {
			System.out.printf("%10d ", durationMonths);//this line prompts the user with the message Days Worked: 
			durationMonths+=20;
			}
			System.out.println();
			System.out.println("------------------------------------------------------");
			
			double i=.030;
			durationMonths=30;
			while (i <=.060) {
				System.out.printf("%.1f%-5%",i*100);	
				
				while (durationMonths<=90)	{
					
				
				System.out.printf("%10.2f ", sip(rMonthlyInvestment,i,durationMonths));
				durationMonths+=20;
				}
				durationMonths=30;
				i+=.005;
				System.out.println();
			}	
			}
	
	
	public static double sip(double r, double in,int n) {
	
		return r*((Math.pow(1+in, n)-1)/in)*(1+in);
	}
}
