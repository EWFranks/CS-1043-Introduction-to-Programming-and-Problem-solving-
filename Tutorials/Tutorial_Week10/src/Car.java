import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        10-28-20 
 Course:      CS 1043
 Section      1
 File Name:   Car.java
 Classes:     Car
 Description: Writing and testing a user defined class.
*/
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car() {
		make = "unknown";
		model = "unknown";
		year = 0;
	}
	
	public Car (String mk, String mo, int yr) {
		make = mk;
		model = mo;
		year = yr;
	}
	
	public String getMake( ) {
		return make;
		
	}
	public void setMake(String mk) {
		make=mk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {
		model = mo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int yr) {
		year = yr;
	}
	
	public String toString() {
		String str = String.format( "Make : %s\n", make)+
				     String.format( "Model : %s\n", model)+
				     String.format( "Year : %d\n", year);
		return str;
	}
	
}
