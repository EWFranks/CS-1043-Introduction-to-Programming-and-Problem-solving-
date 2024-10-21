/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   Dog.java
Classes:     Dog 
Description: Using base and derived classes to transfer info from class to class.
*/
public class Dog extends Pet {
	private String dogBreed;

	public void setBreed(String userBreed) {
		dogBreed = userBreed;
	}

	public String getBreed() {
		return dogBreed;
	}
}