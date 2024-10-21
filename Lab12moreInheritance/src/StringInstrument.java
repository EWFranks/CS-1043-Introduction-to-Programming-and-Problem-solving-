/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   StringInstrument.java
Classes:     StringInstrument
Description: Using base and derived classes to transfer info from class to class.
*/
// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
	// TODO: Declare private fields: numStrings, numFrets
	private int numStrings;
	private int numFrets;

	StringInstrument(String instrumentType, String manufacturerName, int yearBuilt, double price, int numStrings,
			int numFrets) {
		super();
		this.setType(instrumentType);
		this.setManufacturer(manufacturerName);
		this.setYear(yearBuilt);
		this.setPrice(price);
		this.numStrings = numStrings;
		this.numFrets = numFrets;
	}

	public int getNumOfStrings() {
		return numStrings;
	}

	public int getNumOfFrets() {
		return numFrets;
	}

	public String toString() {
		
		return super.toString()+ String.format("   Number of Strings: %s\n", numStrings)
				+ String.format("   Number of Frets: %s\n", numFrets);

	}
}