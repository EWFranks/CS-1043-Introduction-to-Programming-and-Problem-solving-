
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/14/2020 
Assignment: Lab 4
Description: The Use of Conditional Branching
*/
public class Student {
// These are constants and do not need to be changed
	private final int EXAM_WEIGHT = 40;
	private final int QUIZ_WEIGHT = 15;
	private final int LAB_WEIGHT = 20;
	private final int PROJECT_WEIGHT = 15;
	private final int H_WORK_WEIGHT = 10;
	/*
	 * Following private variables need accessor and mutator methods and to be
	 * initialized by the constructors
	 */
	  
	private String name;
	private double exams;
	private double quizzes;
	private double labs;
	private double projects;
	private double homework;
	private String A;
	private String B;
	private String C;
	private String D;


	/*
	 * Create a default constructor that sets the name to "John Doe" and all the
	 * grade averages to 0.0
	 */
	
	public Student() {
		name = "John Doe"; 
	}
	
// Create a copy constructor
	public void student(Student s) {
		name = s.getname();
}

// Create a constructor with all parameters
	public Student(String userName, double qG, double eG, double lG, double pG, double hG) {
		name = userName;
		exams = eG;
		quizzes = qG;
		labs = lG;
		projects = pG;
		homework = hG; 
	}
	public String getname() {
	return name;
}
	
// accessor methods
	
	public String getName() {
		return name;
	}

	public double getExams() {
		return exams*.40;
	}

	public double getQuizzes() {
		return quizzes*.15;
	}

	public double getLabs() {
		return labs*.20;
	}

	public double getProjects() {
		return projects*.15;
	}

	public double getHomework() {
		return homework*.10;
	}

	public String getA() {
		return A;
	}

// Create the remaining accessor methods
// Mutator methods
	public void setName(String name) {
		this.name = name;
	}

	public void setExams(double exams) {
		this.exams = exams;
	}

	public void setQuizzes(double quizzes) {
		this.quizzes = quizzes;
	}
	
	public void setLabs(double labs) {
		this.labs = labs;
	}
	
	public void setProjects(double projects) {
		this.projects = projects;
	}
	
	public void setHomework(double homework) {
		this.homework = homework;
	}
	public void setA(String A) {
		this.A = A;
	}
	public void setB(String B) {
		this.B = B;
	}
	public void setC(String C) {
		this.C = C;
	}
	public void setD(String D) {
		this.D = D;
	}
// Create the remaining mutator methods
// Create a method to make a weighted sum of the grades
	
	public double getWeightedScore() {
		double EXAM_WEIGHT = this.getExams() + this.getQuizzes() + this.getLabs() + this.getProjects() + this.getHomework();
		return EXAM_WEIGHT;
	}

// Method to give a letter grade based on Percentage
public char getLetterGrade() {
double weightedScore = getWeightedScore();
char out = 'F';
if (weightedScore >= 90) {
		out = 'A';
} else
//finish remaining grades(b through d)

if (weightedScore >= 80) {
	out = 'B';
} else

if (weightedScore >= 70) {
	out = 'C';
} else
if (weightedScore >= 60) {
	out = 'D';
}
	return out;
}



// Method to return String with Name, Grade, and Class Percentage
public String toString() {
String art = "a";
if (this.getLetterGrade() == 'A') {
art = "an";
}
return this.getName() + " got " + art + " " + this.getLetterGrade() + " with a score of " +
this.getWeightedScore();
}
}