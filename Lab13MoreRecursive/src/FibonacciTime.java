
import java.util.Scanner;

public class FibonacciTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner( System.in );
		//long startTime = 0;
		//double totalTimeI, totalTimeR;
		
		int number = scnr.nextInt();
		
		//startTime = System.currentTimeMillis();
		long resultI = fibI( number );
		long result2 = fibR( number );
		//totalTimeI = (System.currentTimeMillis() - startTime);
		//totalTimeR = (System.currentTimeMillis() - startTime);

		System.out.printf( "Iteration result: %d\n", resultI );
		System.out.printf( "Iteration result: %d\n", result2 );
		
		
		
		//System.out.printf( "Iterative result: = %d\n",  totalTimeI );

		
		scnr.close();
	}
	
	// TODO: Write the iterative and recrsive methods:
	
	public static long fibI( int number ) {
	   int a = 0;
	   int b = 1;
	   int c;
	   
      if (number ==0)
      return a;
      else
      for (int i=3; i<=number; i++){
         c=a+b;
         a=b;
         b=c;
	}
	return b;
	
	}
	
	public static long fibR( int number ) {
	 if ( number <= 2)
		 return number-1;
	 return fibR(number-1) + fibR(number-2);
}
}
