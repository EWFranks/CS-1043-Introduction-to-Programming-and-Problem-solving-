
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
		name = c.name;
		gpa = c.gpa;
		creditHours = c.creditHours;
		dormName = c.dormName;
		id = c.id;
		
		
		
	}
	
	Undergraduate(String name, double gpa, String id, int creditHours,String dormName){
	super(name, gpa, id, creditHours);
	this.dormName = dormName;
		
		
	}

	private String name;
	private double gpa;
	private int creditHours;
	private String dormName;
	private String id;
	
	final private int graduateHoursRequirement = 124;
	
	public String getname() {
		return name;
	}	
	public void setname(String name) {
		this.name = name;
		
	}
	
	public double getgpa() {
		return gpa; 
	}	
	public void setpga(double gpa) {
		this.gpa = gpa;
		
	}
	
	public int getcreditHours() {
		return creditHours; 
	}	
	public void setcreditHours(int creditHours) {
		this.creditHours = creditHours;
		
	}
	
	public String getdormName() {
		return dormName; 
	}	
	public void setdormName(String dormName) {
		this.dormName = dormName;
		
	}
	
	public String id() {
		return id;
	}	
	public void setid(String id) {
		this.id = id;
	}
	public String toString() {		
		return String.format("%4s%2s%6s%2s%8s%2s%10s%2s%12s%2s","Dorm name" + dormName, "Name:" + name, "ID:" + id, "GPA:" + gpa, "Credit Hours:" + creditHours);
}
	public static int[] credToGrad  (int[][] gradesArray) {
		int rtotal = 0;

		int[] student = new int[gradesArray.length];
		for (int i = 0; i < gradesArray.length; i++) {
			rtotal = 0;
			for (int j = 0; j < gradesArray[i].length; j++) {
				rtotal = rtotal + gradesArray[i][j];
			}
			student[i] = rtotal;
			// System.out.println("---------------------------------------------------------------");
		}
		return student;
}
}