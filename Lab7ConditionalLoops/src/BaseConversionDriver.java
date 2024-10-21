
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/21/2020 
Assignment: Lab 7
Description: The Use of conditional within loops
*/
public class BaseConversionDriver {

		public static void main(String[] args) {
		//Gets the Command Line arguments
		String result = "";
		int n = Integer.parseInt(args[0]);//This is the Number
		int b = Integer.parseInt(args[1]);//This is the Base
		//Code the looping structures in PDF Part 2 step 5
		int i=1;
		int r=1;
		do { 
		r=n%b;
		n=n/b;
		result=r+result;
		i++;
		} while (n!=0); 
		
		System.out.println(result);
		
	}
}
 