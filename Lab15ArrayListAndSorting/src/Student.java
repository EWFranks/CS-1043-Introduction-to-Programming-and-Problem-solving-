
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 8/5/2020
Assignment: Sorting values in an arraylist
Description: 
*/

public class Student {

	private String name;

	private double gpa;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	// Compare based on name
	public int compareTo(Student b) {
		Student a = (Student) b;
		if (this.getGPA() < (b.getGPA())) {
			return 1;
		}
		if (this.getGPA() > (b.getGPA())) {

			return -1;
		} else {

			return 0;
		}
	}

	/*
	 * if (this.getGPA() < (b.getGPA())) ; { return -1;
	 * 
	 * }
	 * 
	 * if (this.getGPA() > (b.getGPA())) ; { return 1; {
	 * 
	 * { return 0;
	 * 
	 * }
	 */

	/*
	 * public int compareTo1(Student c) {
	 * 
	 * if (this.name.equals(c.name)) { return 0; } else { return -1; } }
	 */
}
