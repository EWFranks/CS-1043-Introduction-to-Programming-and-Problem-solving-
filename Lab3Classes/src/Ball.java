
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/10/2020 
Assignment: Lab 3
Description: The Desination of classes and Data Types
*/
import java.lang.Math;
public class Ball {

	private double radius;
	private String color;
	private boolean grade;
	
	public Ball() {
		color = "white";
		radius = 4.2;
	}
	
	public Ball(double rad, String col, boolean profg) {
		radius = rad;
		color = col;
		grade = profg;		
	}
	
	Ball (Ball b) {
		radius = b.radius;
		color = b.color;
		grade = b.grade;
	}
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getGrade() {
		return grade;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	public void setColor(String col) {
		color = col;
	}
	
	public void setGrade(boolean profg) {
		grade = profg;
	}
	
	public double areaBall() {
		return 4*Math.PI*Math.pow(radius, 2.0);
	}
	
	public double volumeBall() {
		return (4.0/3)*Math.PI*Math.pow(radius, 3.0);
	}
	
	
	
	public String toString() {
	String str = "The ball radius is " + this.getRadius();
	return str; }
	{
	String str = "The ball color is " + this.getColor(); }
	{
	String str = "The ball professional grade is " + this.getGrade();
	 }
	
}