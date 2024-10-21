import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        11-11-20 
Course:      CS 1043
Section      1
File Name:   Residential
Classes:     Residential
Description: Residential is the parent class of commercial.
*/
public class Building {
	private String owner;
	private String address;
	private double squareFt;

	public Building(String own, String addr, double sqFt) {
		owner = own;
		address = addr;
		squareFt = sqFt;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String own) {
		owner = own;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addr) {
		address = addr;
	}

	public double getSquareFt() {
		return squareFt;
	}

	public void setSquareFt(double sqFt) {
		squareFt = sqFt;
	}

	public String toString() {
		String str = 	String.format("Owner: %s\n", owner) +
 				String.format("Address: %s\n", address) +
				String.format("Square Footage: %,.1f\n", squareFt);
		return str;
	}
}
