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
 
public class HelloWorld { // The class name begins with an upper case letter

   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );

  System.out.println("Hello world!");
  System.out.println("What's your name?");
 
  String name = scnr.next();
  
  System.out.println("Hello, " + name + ".");

}
}