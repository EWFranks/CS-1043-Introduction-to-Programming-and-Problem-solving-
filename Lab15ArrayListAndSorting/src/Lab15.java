import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 8/5/2020
Assignment: Sorting values in an arraylist
Description: 
*/

public class Lab15 {

	public static void main(String[] args) {
	
		ArrayList<Student> list = new ArrayList<Student>();

		try {
			Scanner file = new Scanner(new File("names_grades.txt"));
		
			while (file.hasNextLine()) {
				Student s = new Student(file.next(), file.nextDouble());

	public static void indexAlgor(ArrayList<Student>list) {

		for (int j = 1; j < list.size(); j++) {
			Student current = list.get(j);
			int i = j - 1;
			while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
				list.set(i + 1, list.get(i));
				i--;
			
			list.set(i + 1, current);
		
		}
		
		
			
	//list.iterator();
						// Insert into array
		
			
			file.close();
		
	} // end try block
	catch(

	Exception ex)
	{
			System.out.println(ex);
		
	for(
	int i = 0;i<list.size(); i++) {
	System.out.println(list.get(i));

	}
	}
	}

	public static int[] LOCATEINDEX(int target,int A,int low,int high) {
		 if ( high <= low) {
		 if (target >= A(low)) {
			return low+1;
		 			} else {
		 	return low;
		 }
		 int mid = (high-low)/2;
		 if (target == A.get(mid)) {
			 return (mid + 1);
		 }
		 if (target > A.get(mid)); {
		 
			 return LOCATEINDEX(target,A,mid+1,high);
		 			}else{ 
			 int mid;
			return LOCATEINDEX(target,A, low, mid-1);
		 	}
		 }
