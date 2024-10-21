
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        11-4-20 
Course:      CS 1043
Section      1
File Name:   ReadLines .java
Classes:     ReadLines 
Description: Reading in from text files.
*/
public class ReadLines<fileNotFound> {
	public static void main(String[] args) { // throws IOException {
		Scanner console = null;
		console = new Scanner(System.in);
		System.out.print("Enter the filename to read: ");
		String filename = console.next();

		File fileHandle = null;
		Scanner data = null;

		fileHandle = new File(filename);
		try {
			data = new Scanner(fileHandle);

			String record;
			int count = 0;

			while (data.hasNext()) {
				record = data.next();
				// System.out.print(record);
				count++;
			}

			System.out.printf("%s contains %d tokens.\n", filename, count);

			data.close();
			data = new Scanner(fileHandle);

			count = 0;

			while (data.hasNext()) {
				record = data.nextLine();
				count++;
			}

			// Open the file to scan the content. Determine the total number
			// of delimited tokens with hasNext() & next();
			System.out.printf("%s contains %d lines.\n", filename, count);

			data.close();
			data = new Scanner(fileHandle);

			// Reset & open the file to scan the content. Determine the total
			// number of lines using a loop, hasNext(), and nextLine();
			// System.out.printf("%s contains %d lines.\n", filename, count );

			// Reset & open the file. Display the tokens as a table of floating point data
			// The delimiter character is " +" (any number of spaces).
			// System.out.printf("%12.4f", value );

			// Add a competent exception handler, use this print in the catch-clause:
			// System.out.println("Error: " + err + " try again.");

			double value;
			String[] tokens = null;

			while (data.hasNext()) {
				record = data.nextLine().trim();
				tokens = record.split(" +");
				for (String target : tokens) {
					value = Double.parseDouble(target);
					System.out.printf("%12.4f", value);
				}
				System.out.println();
			}

			System.out.println("Done!");
		} catch (FileNotFoundException err) {
			System.out.println("Error: " + err+ " try again.");
		}
		if ( data != null) data.close();
		if (console != null) data.close();
	}
}
