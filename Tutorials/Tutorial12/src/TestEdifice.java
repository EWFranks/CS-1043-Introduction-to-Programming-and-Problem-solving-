import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        11-11-20 
Course:      CS 1043
Section      1
File Name:   TestEdifice
Classes:     TestEdifice
Description: Driver to test the Building family of classes.
*/

/*
 *  Driver to test the Building family of classes.
 */
public class TestEdifice {
	public static void main( String [] args ) {
		
		System.out.println("Empire State Building");

		Building skySc = new Building( "Peter Malkin", 
       "20W 34th St., New York City", 27_000_000.0 );

		System.out.println( skySc.toString() );
		
		
		Commercial frenchQtr = new Commercial( "Rick Bount", 
       "713 St Louis St., New Orleans", 
				2_500.0, "Antoine's Restaurant", 41,  true  );
		System.out.println( frenchQtr.toString() );	// Overriding method

		Residential gvt = new Residential( "National Park Service", 
				       "1600 Pennsylvania Ave., Washington D.C.", 
					   54_900.0, 20, 35, true );
		// Inherited method:
		System.out.printf( "The White House address is %s\n\n", 
       gvt.getAddress() );

		System.out.println("Transamerica Pyramid");
		Building bldg;
		Commercial hold = new Commercial( "Aegon N.V.", 
       "600 Montgomery St., San Francisco",
		        702_000.0, "Transamerica Corporation", 850, false );
		bldg = hold; // The parent can hold the child.
		System.out.println( bldg.toString() ); //toString is Polymorphic.
		
		Building theKing = new Residential( "Lisa M. Presley", 
				         "Elvis Presley Blvd, Memphis", 
				         17_552.0, 8, 8, true );
		
		if ( theKing instanceof Residential )
		  if ( ((Residential)theKing).hasGarage() )
			System.out.println("Graceland has a garage.");
		
		System.out.println( theKing.toString() );

	}
}