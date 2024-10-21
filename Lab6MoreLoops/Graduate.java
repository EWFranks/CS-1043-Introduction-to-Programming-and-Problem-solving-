
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
		name = d.name;
		gpa = d.gpa;
		creditHours = d.creditHours;
		
	}
	Graduate(String name, double gpa, String id, int credithours, String apprenticeship){
		super(name, gpa, id, credithours);
		this.apprenticeship = apprenticeship;
	}
	private String name;
	private double gpa;
	private String creditHours;
	private String apprenticeship;
	
	public String getapprenticeship() {
	 return apprenticeship;
	
	}
	public String getname() {
		return name;
	 
	}	
	public void setname(String name) {
		this.name = name;
	
}
	public double getgpa() {
		return gpa;
	 
	}	
	public void setgpa(double gpa) {
		this.gpa = gpa;
}
	public String creditHours() {
		return creditHours;
	 
	}	
	public void setcreditHours(String creditHours) {
		this.creditHours = creditHours;
}
	public String toString() {		
		return String.format("%8s%2s%10s%2s%12s%2s","Name:" + name, "GPA:" + gpa, "Credit Hours:" + creditHours);
}
}