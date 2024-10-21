import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        11-11-20 
Course:      CS 1043
Section      1
File Name:   Commercial
Classes:     Commercial
Description: Commercial is a derived child-class of Building
*/
public class Commercial extends Building { // extends Building {
	private String BusinessName;
	private int numEMployees;
	private boolean foodSerivce;

	// Class instance fields go here:
	public Commercial(String own, String addr, double sqFt, String bName, int numEmp, Boolean foodS) {
		super(own, addr, sqFt);
		BusinessName = bName;
		numEMployees = numEmp;
		foodSerivce = foodS;
	}
	
	// Write the argument constructor
	
	// Accessor and Mutator methods go here:
	
	public String getBusinessName() {
		return BusinessName;
	}

	public void setBusinessName(String bName) {
		BusinessName = bName;
	}

	public int getNumEMployees() {
		return numEMployees;
	}

	public void setNumEMployees(int nEmp) {
		numEMployees = nEmp;
	}

	public boolean isFoodSerivce() {
		return foodSerivce;
	}

	public void setFoodSerivce(boolean fS) {
		foodSerivce = fS;
	}
	
	// Write the toString method using String.format()
	public String toString() {
		String str = super.toString() + 
					String.format("Business Name: %s\n", BusinessName)+
					String.format("Employees: %d\n", numEMployees)+
					String.format("Food: %b\n", foodSerivce);
		return str;
	}
}