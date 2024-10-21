import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        9-9-20 
Course:      CS 1043
Section      1
File Name:   Season.java
Classes:     Season
Description: Computing the counting of money.
*/
public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String season = "";
		System.out.println("");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			season = "winter";
			break;
		case 4:
		case 5:
		case 6:
			season = "Spring";
			break;
		case 7:
		case 8:
		case 9:
			season = "Summer";
			break;
		case 10:
		case 11:
		case 12:
			season = "Fall";
			break;
		
		}
	if(month%3 == 0 && day >= 21) {
		if (season.equals("winter")) season = "Spring";
		else if ( season.equals("Spring")) season = "Summer";
		else if ( season.equals("Summer")) season = "fall";
		else season ="winter";
	}
				
	System.out.println(season);
	String month3 = "january" ;
	String month6 = Spring;
	String month9 = Summer;
	
	switch(month3) {
	case "January":
	case "Februray":
	case "March":
		season = "winter";
		break;
	}
	switch(month4) {
	case "April":
	case "May":
	case "June":
		season = "Spring";
		break;
	}
	switch(month9) {
	case "July":
	case "August":
	case "September":
		season = "Summer";
		break;
    }
    switch(month12) {
	case "October":
	case "November":
	case "December":
		season = "Fall";
		break;
	
	}


	if (season.equals("winter")) season = "Spring";
	else if ( season.equals("Spring")) season = "Summer";
	else if ( season.equals("Summer")) season = "fall";
	else season ="winter";
}
			
System.out.print("season");

}
}
}
}