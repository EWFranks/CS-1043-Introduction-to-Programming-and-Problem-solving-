import java.io.File;
import java.util.Scanner;

/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/24/2020 
Assignment: Lab 10
Description: Two Dimensional Arrays
*/

public class Lab10Tools {

	protected static int[][] fromFile(String filename) {
		try {

			Scanner counter = new Scanner(new File(filename));

			int lines = 0;

			while (counter.hasNextLine()) {
				lines++;
				counter.nextLine();
			}

			counter.close();

			int[][] out = new int[lines][5];

			Scanner file = new Scanner(new File(filename));
			for (int i = 0; i < lines; i++) {
				Scanner line = new Scanner(file.nextLine());

				for (int j = 0; j < 5; j++) {
					out[i][j] = line.nextInt();
				}
				line.close();
			}

			file.close();
			return out;

		} // END TRY
		catch (Exception ex) {
			System.out.println("file could not be opened: " + ex);
			return null;
		}

	}// END FROMFILE

}