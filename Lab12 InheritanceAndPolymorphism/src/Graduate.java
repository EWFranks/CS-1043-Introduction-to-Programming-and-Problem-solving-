
/* Name: Eliga Franks
	Lab Section: 01
	Lecture Section: 01
	Date: 7/28/2020
	Assignment: Lab 12
	Description: Developing Inheritance and Polymorphism
	*/

public class Graduate extends Student  {

	Graduate(Graduate d) {
		super(d);
		apprenticeship=d.apprenticeship;
		
	}
	Graduate(String name, double gpa, String id, int credithours, String apprenticeship){
		super(name, gpa, id, credithours);
		this.apprenticeship = apprenticeship;
	}
	
	private String apprenticeship;
	
	public String getapprenticeship() {
	 return apprenticeship;
	
	}
	
	public String toString() {		
		return String.format("%8s%8s%8s"," Name: " + this.getName(), " GPA: " + this.getGpa(), " Credit Hours: " + this.getCreditHours());
}
}