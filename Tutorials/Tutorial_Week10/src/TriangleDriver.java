import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        10-28-20 
 Course:      CS 1043
 Section      1
 File Name:   TriangleDriver.java
 Classes:     TriangleDriver
 Description: Writing and testing a user defined class.
*/

public class TriangleDriver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Instantiate two triangle objects: triangle1 and triangle2
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      double base = scnr.nextDouble();
      double height = scnr.nextDouble();
      
      triangle1.setBase(base);
      triangle1.setHeight(height);
      
      
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      base = scnr.nextDouble();
      height = scnr.nextDouble();
      
      System.out.println("Triangle with larger area:");
      
      triangle2.setBase(base);
      triangle2.setHeight(height);
      // TODO: Determine larger triangle (use getArea())
      if (triangle1.getArea() > triangle2.getArea() )
    	  System.out.println(triangle1.toString() );
      else
    	  System.out.println(triangle2.toString() );
      
      
      
      // TODO: Output larger triangle's info (use printInfo())
      
   }
}
