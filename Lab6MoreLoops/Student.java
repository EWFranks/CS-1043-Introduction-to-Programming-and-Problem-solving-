
/* Name: Eliga Franks
	Lab Section: 01
	Lecture Section: 01
	Date: 7/28/2020
	Assignment: Lab 12
	Description: Developing Inheritance and Polymorphism
	*/

class Student {
	Student(Student b) {

	name = b.name;
	gpa = b.gpa;
	credithours = b.credithours;
	id = b.id;
}

	public Student(String name, double gpa, String id, int credithours){
		
		this.name = name;
		this.gpa = gpa;
		this.credithours = credithours;
		this.id = id;
	}
	
	private String name;
	private double gpa;
	private int credithours;
	private String id;
	
	
	public String getName() {
		return name;
	 
	}	
	public void setname(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	 
	}	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getCreditHours() {
		return credithours;
	 
	}	
	public void setCreditHours(String credithours) {
		this.name = credithours;
	}
	public int getId() {
		return credithours;
	 
	}	
	public void setId(String id) {
		this.name = id;
}	
public String toString() {		
return String.format("%6s%2s%8s%2s%10s%2s%12s%2s","Name:" + name, "ID:" + id, "GPA:" + gpa, "Credit Hours:" + credithours);
		
}

}