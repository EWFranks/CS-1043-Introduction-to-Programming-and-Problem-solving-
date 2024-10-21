import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/28/2020
Assignment: Lab 12
Description: Developing Inheritance and Polymorphism
*/

public class StudentDriver {

	public static void main(String[] args) {
		
		//Create the ArrayList allStudents here
		Student[] allStudents = new Student[21];
		//Filename 
		final String filename = "studentsData.in";
		
		//Open File
		File myFile = new File(filename);
		
		//Because file opening can have errors ... use a try catch
		try {
			//Create a way to read the file
			Scanner myFileScanner = new Scanner(myFile);
			//Create a way to get the lines in the file:
			while(myFileScanner.hasNextLine()) {
				//Get the current line of the file... a line contains all the data needed to construct an object
				String currentLine = myFileScanner.nextLine();
				//Create a scanner for parsing the line data
				Scanner lineScanner = new Scanner(currentLine);
				
				//The first character of each line determines which class to build the objects...
				char firstChar = lineScanner.next().charAt(0);
				
				//Use this character in the switch statement to determine how to build the object
				switch(firstChar) {
				case 'u':// Undergraduate
					//Write code here that uses the line scanner to read the rest of the inputs then
					lineScanner.next();
					//adds the object to the new arraylist allStudents that you created above the try
					String firstname = lineScanner.next();
					String lastname = lineScanner.next();
					//in the main
					double gpa = Double.parseDouble(lineScanner.next());
					int creditHours = Integer.parseInt(lineScanner.next());
					String id = lineScanner.next();
					String dormName = lineScanner.next();
					
					//Create a student object of type Undergraduate (a subclass)
					Student myStudent = new Undergraduate(firstname+lastname,gpa,id,creditHours,dormName);
					
					// Store a reference to that object in the array named allStudents
					allStudents[0]=myStudent;//put an idx here] = myStudent;
					break;
					//name, gpa,id,credithours,apprenticeship,candidate
				case 'p'://Phd //P Genia Littlepage 3.92 3710 26 N/A true 
					lineScanner.next();
					String firstname1 = lineScanner.next();
					String lastname1 = lineScanner.next();
					double gpa1 = Double.parseDouble(lineScanner.next());
					String id1 = lineScanner.next();
					int creditHours1 = Integer.parseInt(lineScanner.next());
					String apprenticeship = lineScanner.next();
					boolean candiadate = Boolean.parseBoolean(lineScanner.next());
					
					Student myStudent1 = new Phd(firstname1+lastname1,gpa1,id1,creditHours1,apprenticeship,candiadate);
					//etc... fill in the code here (remember to check if apprenticeship is NA and assign null if NA is passed)
					allStudents[1]=myStudent1;
					break;
				case 'm'://masters //name, gpa, id, credithours, apprenticeship
					//Delcie Screen 3.26 6458 14 fellowship false 
					lineScanner.next();
					String firstname2 = lineScanner.next();
					String lastname2 = lineScanner.next();
					double gpa2 = Double.parseDouble(lineScanner.next());
					String id2 = lineScanner.next();
					int creditHours2 = Integer.parseInt(lineScanner.next());
					String apprenticeship2 = lineScanner.next();
					boolean candiadate2 = Boolean.parseBoolean(lineScanner.next());
					
					Student myStudent2 = new Phd(firstname2+lastname2,gpa2,id2,creditHours2,apprenticeship2,candiadate2);
					//etc... fill in the code here  (remember to check if apprenticeship is NA and assign null if NA is passed)
					allStudents[2]=myStudent2;
					break;
					
				default:
					System.out.println("Student Type not Recognized: "+ firstChar);				
				}//end switch
				//close the line scanner
				lineScanner.close();
			}//end while
			//close the file scanner
			myFileScanner.close();
			
			// IMPORTANT!!!!!!!!!
			//Now go through and make changes and do the calculations as described in the pdf being sure to print out etc... 
			
			
			
			
		} catch (FileNotFoundException e) {//Catch if the file was not found....
			// TODO Auto-generated catch block
			System.out.println("Unable to find the file: "+filename);
			e.printStackTrace();
		}//end catch
	}//end main
}//End Class StudentDriver.java