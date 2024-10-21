import java.util.Collections;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/23/2020 
Assignment: Lab 9
Description: Introduction of arrays
*/
public class ArrayDriver {
	public static void main(String[] args) {
// This List stores the grades for which you must make the calculation
		int[] gradesDataArray = { 90, 80, 77, 99, 89, 97, 92, 100, 42, 85, 87 };
	

	double median = findMedian(gradesDataArray);
	
	
	
	
//Calculate the Minimum VALUE and print here
int index = findminindex(gradesDataArray);
	System.out.printf("The minimum value is: %3d",gradesDataArray[index]);
double average = calcAverage(gradesDataArray);
System.out.println();
	//Calculate the Average of the array and print here
	System.out.printf("The average of the array is: %5.2f",average);
System.out.println();
//Calculate the median of the array and print here
	System.out.printf("The median of the array is: %5.2f",median);
	}

public static int findminindex(int[] gradesDataArray) {
	int index = 0; 
	int min = gradesDataArray[0];
//Write your code for findMinIndex here
for  (int a=1; (a<gradesDataArray.length);
		a++) {
if (gradesDataArray[a] < min) {
	min = gradesDataArray[a];
		index=a;}
}
return index;

}

//Write your code for calcAverage here
public static double calcAverage(int[] gradesDataArray) {
	
	double total = 0;
	
	for (int i=0; i<gradesDataArray.length; i++)
	total = total + gradesDataArray[i]; 
	double average = total / gradesDataArray.length;
return average;	
}


//Write your code for mysteryMethod here



public static double findMedian(int[] inputArray){
//Mystery Method
	// It is sorting the set of numbers
	
	
mysteryMethod(inputArray);
//for (int idx=0; idx<inputArray.length; idx++)
//System.out.println(inputArray[idx]);
//Our cases for selecting the middle values
if(inputArray.length%2==0){// it is even so there is no middle element ... take average of
//the two middle and return
return (inputArray[inputArray.length/2] + inputArray[inputArray.length/2 - 1])/2.0;
}else{//it is odd (so there is a true middle value)
return 1.0* inputArray[inputArray.length/2];


}
}

private static void mysteryMethod(int[] inputArray) {
	// TODO Auto-generated method stub
	boolean wasChanged = true;
			do { wasChanged=false;
			 for (int i=0; i<inputArray.length-1; i++) {
			 
			 if (inputArray[i]>inputArray[i+1]) 
				 
			 { int temp = inputArray[i];// keep a copy of the item in the ith position
				inputArray[i] = inputArray[i+1];
				inputArray[i+1] = temp;
				wasChanged= true;
			 } }
			// use the copy of the ith in the (i+1)th position
			}while (wasChanged);
			
			
	
	
}
}
