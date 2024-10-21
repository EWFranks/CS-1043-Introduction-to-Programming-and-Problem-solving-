
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/21/2020 
Assignment: Lab 7
Description: The Use of conditional within loops
*/
public class FactorsDriver {

		public static void main(String[] args) {
				
		//Find all the factors of this number n
		int n = Integer.parseInt(args[0]);
	
		//implement a looping structure to preform the algorithm in PDF Part 1 Step 6
		for (int i = 1; i <= n; ++i) {
			if (n%i == 0) 
				System.out.println(i);
		
		}
		}
}
		

