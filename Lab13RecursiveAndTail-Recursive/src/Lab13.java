
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/31/2020
Assignment: Lab 12
Description: Developing Inheritance and Polymorphism
*/


public class Lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {62, 48, 26, 62, 83, 20, 38, 48, 55, 65, 38, 77, 83, 56, 37, 83, 34, 21, 67, 33, 89, 34, 65, 54, 23, 42, 54, 75, 4, 12};
		
		
		System.out.println("Recursive " +sumRecursive(numbers, 0, numbers.length-1));
		
		System.out.println("Tail Recursive " + sumTailRecursive(numbers, 0, numbers.length-1, 0));
	
	
		/////////////////////////////////////////////
		//PRINT STATEMENT FOR OPTIONAL CODE:      //
		///////////////////////////////////////////
	
		System.out.println( "Recursive " + averageRecursive(numbers, 0, numbers.length-1));
		
		System.out.println("Tail Recursive " + averageTailRecursive(numbers, 0, numbers.length-1));
	}

	public static int sumRecursive(int[] array, int low, int high ) {
		
		if (low>high)
			return 0;
		else
			return sumRecursive(array,low+1,high)+array[low];
	}
	
	public static int sumTailRecursive(int[] array, int low, int high, int tot) {
		
		if (low>high)
			return tot; 
		else
			return sumTailRecursive(array,low+1,high,tot+array[low]);
	
	
		
	}


	/////////////////////////////////////////////      |   |                              
	// THESE ARE OPTIONAL!!                            |   |                            
	//                                                \     /              
	//  EXTRA CREDIT!!                                 \   / 
	//                                                  \ /
	////////////////////////////////////////////         '                        


	public static int averageRecursive(int[] array, int low, int high ) {
			if (low == high-1)
				return array[low];
			
			if (low == 0)
				return (array[low]+averageRecursive(array,low+1,high)/high);
			
			return (array[low]+averageRecursive(array,low+1,high));
	}

	public static int averageTailRecursive( int[] array, int low, int high) {
		if (low == high-1)
			return array[low];
		
		if (low == 0)
			return (array[low]+averageTailRecursive(array,low+1,high)/high);
		
		return (array[low]+averageTailRecursive(array,low+1,high));
	}




}
