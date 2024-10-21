import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        10-28-20 
 Course:      CS 1043
 Section      1
 File Name:   TestCar.java
 Classes:     TestCar
 Description: Writing and testing a user defined class.
*/

public class TestCar {
	public static void main( String [] args ){

			


		System.out.println("Enter the make, model and year as: make, model, year");
		Scanner console = new Scanner( System.in );
		String [] tokens = console.nextLine().split(",");
		
		String make = tokens[0].trim();
		String model = tokens[1].trim();
		int year = Integer.parseInt(tokens[2].trim());
	

		
		// instantiate the Car object, myCar :
	
		Car myCar = new Car( make, model, year);
		
		// Show the state of myCar with toString 
		System.out.println(myCar.toString());
		
		// Demonstrate the getters and setters work correctly with yourCar.
		// "Ford", "Mustang", 1968 
		
		Car yourCar = new Car();
		
		yourCar.setMake( "Ford");
		yourCar.setModel( "Mustang");
		yourCar.setYear( 2020);
		
		System.out.println("Make : "+ yourCar.getMake());	
		System.out.println("Model : "+ yourCar.getModel());	
		System.out.println("Year : "+ yourCar.getYear());	
		
	}
}