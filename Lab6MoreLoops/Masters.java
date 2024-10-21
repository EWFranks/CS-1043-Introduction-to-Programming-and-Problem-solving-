
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
		name = e.name;
		gpa = e.gpa;
		creditHours = e.creditHours;
	}	
	
		Masters(String name, double gpa, int credithours, String id, String apprenticeship){
		super(name, gpa, id, credithours, apprenticeship);
	
	
	}
		
	private String name;
	private double gpa;
	private int creditHours;
	private String apprenticeship;
	
	final private int graduateHoursRequirement = 30;
	
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