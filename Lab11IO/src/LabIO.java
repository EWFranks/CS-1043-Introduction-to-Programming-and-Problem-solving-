import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/*
Author:      Eliga Franks
Date:        11-11-20 
Course:      CS 1043
Section      1
File Name:   LabIO
Classes:     LabIO
Description: writing to file from a file with exceptions of java IO
*/

public class LabIO {
	private double[][] data;

	public static void main(String[] args) throws IOException {//ignores the error
		LabIO fileTest = new LabIO();
		fileTest.readData();//determine what file to read.
		System.out.println(fileTest.toString());
		fileTest.writeData();//determine what file to write
	}

	public void readData() throws IOException {//ignores the error
		String outMsg = "Enter the intput filename: "; //Assigning outMsg to the file name.
		boolean present = false;

		while (present == false) { //will keep on looping through until our variable present is true.
			try {
				String in = JOptionPane.showInputDialog(outMsg); //Prompting the user for the file name 
				File file = new File(in);
				Scanner token = new Scanner(file);

				int nrows = token.nextInt();
				int ncols = token.nextInt();

				data = new double[nrows][ncols]; //allocating the space for data

				for (int i = 0; i < nrows; i++) {
					for (int j = 0; j < ncols; j++) {
						data[i][j] = token.nextDouble();//reading in the value from the specified file to the array.
					}
				}
				present = true;
				token.close();//close the scanner.
				
			} catch (IOException e) {
				System.out.println(e.getMessage());//Will catch all IOExceptions that pose an errors.
			}
		}
	}

	public void writeData() 
	{
		String outMsg = "Enter the output filename: ";
		boolean present = false; //If the file was made then is will be present.

		while (present == false) {//while present is false it will continue to loop.
			try {
				String outFile = JOptionPane.showInputDialog(outMsg); //Allows the user to name the new file with the formated numbers from the first file.

				FileWriter out2 = new FileWriter(outFile);//to establish the file
				PrintWriter out = new PrintWriter(out2);//to print to the file

				int numrows = data.length;
				int numcols = data[0].length;//To find out the correct number of rows and columns.

				out.printf("Rows: %d\n", numrows);
				out.printf("Columns: %d\n", numcols);//Prints the number of rows and column to the print writer,

				for (int i = 0; i < numrows; i++) {
					for (int j = 0; j < numcols; j++) {
						out.printf(String.format("%10.2f", data[i][j]));//This will write the values stored in the array to the file.
					}
					out.print("\n");
				}	
				present = true;//The file was established so the while loop will not loop again.

				out.printf("Eliga Franks");
				out.close();//close the printwriter.

			} catch (IOException e) {
				System.out.println(e.getMessage());// Will catch all IOExceptions that got pose errors.
			}
		} // end of writeData
	}

	public String toString() {
		String str = "";
		int numRows = data.length;
		int numCols = data[0].length;//number of the columns and row

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				str += String.format("%10.2f\n", data[i][j]);//iterates over the array.
			}
		}
		return str;
	}
} // end class