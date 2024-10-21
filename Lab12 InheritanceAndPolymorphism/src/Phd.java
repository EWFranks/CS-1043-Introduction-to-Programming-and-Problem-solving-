
/* Name: Eliga Franks
	Lab Section: 01
	Lecture Section: 01
	Date: 7/28/2020
	Assignment: Lab 12
	Description: Developing Inheritance and Polymorphism
	*/

public class Phd extends Graduate {
	
	Phd(Phd f) {
		super(f);
		candidate = f.candidate;
	}
	
	Phd(String name, double gpa, String id, int credithours, String apprenticeship, boolean candidate){
		super(name, gpa,id,credithours,apprenticeship);
		this.candidate = candidate;
	}

	
	private boolean candidate;

	
	final private int graduateHoursRequirement = 60;
	
	
	public String toString() {		
		return String.format("%10s%10s%10s"," Name: " + this.getName(), " GPA: " + this.getGpa(), " Credit Hours: " + this.getCreditHours());
}
}