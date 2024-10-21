
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/23/2020 
Assignment: Lab 9
Description: Introduction of arrays
*/
public class MysteryMethod {

	public double findMedian(int[] inputArray){
		//Mystery Method (this method will only work after you have coded the mystery method)
		mysteryMethod(inputArray);
		//Our cases for selecting the middle values
		if(inputArray.length%2==0){// it is even so there is no middle element ... take average of
		//the two middle and return
		return (inputArray[inputArray.length/2] + inputArray[inputArray.length/2 - 1])/2.0;
		}else{//it is odd (so there is a true middle value)
		return 1.0* inputArray[inputArray.length/2];
		}
		}

	private void mysteryMethod(int[] inputArray) {
		// TODO Auto-generated method stub
		
	}
}