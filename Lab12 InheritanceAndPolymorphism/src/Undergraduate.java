
	/* Name: Eliga Franks
	Lab Section: 01
	Lecture Section: 01
	Date: 7/28/2020
	Assignment: Lab 12
	Description: Developing Inheritance and Polymorphism
	*/

public class Undergraduate extends Student {

	Undergraduate(Undergraduate c) {
		super(c);
		
		dormName = c.dormName;

		
		
		
	}
	
	Undergraduate(String name, double gpa, String id, int creditHours,String dormName){
	super(name, gpa, id, creditHours);
	
	this.dormName = dormName;
		
		
	}

	
	private String dormName;
	
	
	final private int graduateHoursRequirement = 124;
	
	
	
	public String getdormName() {
		return dormName; 
	}	
	public void setdormName(String dormName) {
		this.dormName = dormName;
		
	}
	
	
	
	public String toString() {		
		return String.format("%8s%8s%8s%8s%8s"," Dorm name: " + dormName, " Name: " + this.getName(), " ID: " + this.getId(), " GPA: " + this.getGpa(), " Credit Hours: " + this.getCreditHours());
}	
}
