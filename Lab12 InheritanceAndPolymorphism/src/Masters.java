
/* Name: Eliga Franks
	Lab Section: 01
	Lecture Section: 01
	Date: 7/28/2020
	Assignment: Lab 12
	Description: Developing Inheritance and Polymorphism
	*/

public class Masters extends Graduate {
	Masters(Masters e) {
		super(e);
	
	}	
	
		Masters(String name, double gpa, int credithours, String id, String apprenticeship){
		super(name, gpa, id, credithours, apprenticeship);
	
	
	}
		
	
	
	final private int graduateHoursRequirement = 30;
	
	

	public String toString() {		
		return String.format("%8s%8s%8s"," Name: " + this.getName(), " GPA: " + this.getGpa(), " Credit Hours: " + this.getCreditHours());
}
}