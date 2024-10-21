import java.lang.Math;
import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        11-4-20 
 Course:      CS 1043
 Section      1
 File Name:   Box.java
 Classes:     Box
 Description: The Destination of classes and Data Types
*/

public class Box {

	double length;
	double depth;
	double height;
	String color;
// My variables 
	Box() {

		length = 0;
		depth = 0;
		height = 0;
		color = "none";
	}
	//my reference variables references to the current object. Current instance of the class.
	Box(double length, double depth, double height, String color) {
		this.length = length;
		this.depth = depth;
		this.height = height;
		this.color = color;
	}
	//basically a reference passed to the method to set and assign the length to equal num.
	void setLength(double num) {
		length = num;
	}

	void setDepth(double num) {
		depth = num;
	}

	void setHeight(double num) {
		height = num;
	}

	void setColor(String str) {
		color = str;
	}
	//(Now this function is retrieving the assigned value from the setter.
	double getLength() {
		return length;
	}

	double getDepth() {
		return depth;
	}

	double getHeight() {
		return height;
	}

	String getColor() {
		return color;
	}
	
	double getVolume() {
		return length * height * depth;
	}
	//My toString formats allows both my console inputs to be retrieved and formats my get___() methods when printed.
	public String toString() {
		//return "Length = $%.2f" + getLength() + "\nDepth = " + getDepth() + "\n$%.2fHeight = "
			//	+ getHeight() + "\nColor = " + getColor() + "\n$%.2fVolume = " + getVolume();
		return String.format("Length = %.2f\nDepth = %.2f\nHeight = %.2f\nColor = %s\nVolume = %.2f\n", getLength(), getDepth(), getHeight(), getColor(), getVolume());
	}
}