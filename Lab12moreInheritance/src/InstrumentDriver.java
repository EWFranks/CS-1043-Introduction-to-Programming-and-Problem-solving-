import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   InstrumentDriver.java
Classes:     InstrumentDriver 
Description: Using base and derived classes to transfer info from class to class.
*/
public class InstrumentDriver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Instrument myInstrument = new Instrument();
		StringInstrument myInstrument1 = new StringInstrument();

		String instrumentType, manufacturerName, stringInstrumentName, stringManufacturer = "";
		int yearBuilt, stringYearBuilt = 0, stringCost = 0, nStrings, nFrets;
		double price;

		String[] tokens;
		System.out.println("Enter instrument info: type, make, year, price");
		System.out.println("Enter guitar info: type, make, year, price, strings, frets");

		tokens = scnr.nextLine().split(",");
		instrumentType = tokens[0].strip();
		manufacturerName = tokens[1].strip();
		yearBuilt = Integer.parseInt(tokens[2].strip());
		price = Double.parseDouble(tokens[3].strip());
		// TODO Assign the generic instrument information:

		myInstrument.setType(instrumentType);
		myInstrument.setManufacturer(manufacturerName);
		myInstrument.setYear(yearBuilt);
		myInstrument.setPrice(price);
		System.out.print(myInstrument.toString());

		tokens = scnr.nextLine().split(",");
		instrumentType = tokens[0].strip();
		manufacturerName = tokens[1].strip();
		yearBuilt = Integer.parseInt(tokens[2].strip());
		price = Double.parseDouble(tokens[3].strip());
		nStrings = Integer.parseInt(tokens[4].strip());
		nFrets = Integer.parseInt(tokens[5].strip());

		// TODO: Instantiate a myStringInstrument and initialize all instance fields
		// with
		// the constructor:

		// use toString

		// getter setters
		//
		myInstrument1.setType(instrumentType);
		myInstrument1.setManufacturer(manufacturerName);
		myInstrument1.setYear(yearBuilt);
		myInstrument1.setPrice(price);
		myInstrument1.setNumOfStrings(nStrings);
		myInstrument1.setNumOfFrets(nFrets);
		myInstrument1.toString();
		System.out.println();
		System.out.print(myInstrument1.toString());

		// System.out.print( myInstrument1.getNumOfStrings());
		// System.out.println();
		// System.out.print( myInstrument1.getNumOfFrets());

		scnr.close();
	}
}