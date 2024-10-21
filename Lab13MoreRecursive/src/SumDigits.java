import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		int number = scnr.nextInt();

		

		System.out.print(sumRecursive(number));
		
		scnr.close();
	}

	// TODO: Write a static method to recursively sum the digits of an input
	// integer.
	public static int sumRecursive(int number) {
		//return single digit 
		if (number <= 9) {
			return number ;
		} else
			//if more than single digit split the righter most from the others.
			
		{
			//grab the righter most number
			int rightMost = (number % 10);
			
			//Split digits left of the right number
			int sum=sumRecursive(number / 10);
			
			return rightMost+sum;
		}
	}
	
}