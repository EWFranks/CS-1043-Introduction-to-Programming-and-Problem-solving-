/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   Pet.java
Classes:     Pet 
Description: Using base and derived classes to transfer info from class to class.
*/

public class Pet {

	protected String petName;
	protected int petAge;

	public void setName(String userName) {
		petName = userName;
	}

	public String getName() {
		return petName;
	}

	public void setAge(int userAge) {
		petAge = userAge;
	}

	public int getAge() {
		return petAge;
	}

	public String toString() {
		return String.format("Pet Information: ") + String.format("\n   Name: %s\n", petName)
				+ String.format("   Age: %d", petAge);
	}

}
