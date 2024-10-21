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

public class NumSquared {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int userNumSquared;
      
      userNum = scnr.nextInt();
      
      userNumSquared = userNum * userNum;   // Bug here; fix it when instructed
      
      System.out.println(userNumSquared);   // Output formatting issue here; fix it when instructed
   }
}