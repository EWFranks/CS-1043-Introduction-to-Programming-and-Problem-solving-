
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
		name = f.name;
		gpa = f.gpa;
		creditHours = f.creditHours;
	}
	
	Phd(String name, double gpa, String id, int credithours, String apprenticeship, boolean candidate){
		super(name, gpa,id,credithours,apprenticeship);
		this.candidate = candidate;
	}
	private String name;
	private double gpa;
	private int creditHours;
	private String apprenticeship;
	private boolean candidate;

	
	final private int graduateHoursRequirement = 60;
	
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
	public int getcreditHours() {
		return creditHours;
	 
	}	
	public void setcreditHours(int creditHours) {
		this.creditHours = creditHours;
}
	public String toString() {		
		return String.format("%8s%2s%10s%2s%12s%2s","Name:" + name, "GPA:" + gpa, "Credit Hours:" + creditHours);
}
}