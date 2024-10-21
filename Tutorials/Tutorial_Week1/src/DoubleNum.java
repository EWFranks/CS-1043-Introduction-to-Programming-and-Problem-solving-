/*
 Author:      Eliga Franks
 Date:        8-24-20 
 Course:      CS 1043
 Section      1
 File Name:   HelloWorld.java
 Classes:     HelloWorld
 Description: Using and getting familiar with eclipse, such as println statements
*/
 
import java.util.Scanner;

public class DoubleNum {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x;
      
      System.out.println("Enter x: ");
      x = scnr.nextInt();
      
    //  System.out.println(x); // Student mistakenly is echo'ing the input to output to match example
      System.out.println("x doubled is: " + (2 * x));
   }
}

