
/* Name: Eliga Franks
Lab Section: 01
Lecture Section: 01
Date: 7/10/2020 
Assignment: Lab 3
Description: The Desination of classes and Data Types
*/
import java.lang.Math;
import java.util.Scanner;
public class BallDriver{

	public static void main( String[] args ){
		Ball ball1 = new Ball();
		Ball ball2 = new Ball(5.0, "blue", false);
		Ball ball3 = new Ball();
		
		ball3.setRadius(34.354);
		ball3.setColor("purple");
		ball3.setGrade(false);
		
		Ball ball4 = new Ball(ball3);
		ball4.setColor("yellow");
		
		ball1.setRadius(42.0);
	
	System.out.println(ball1.getColor()+" ball has an area of "+ ball1.areaBall());
	System.out.println(ball2.getColor()+" ball has an area of "+ ball2.areaBall());
	System.out.println(ball3.getColor()+" ball has an area of "+ ball3.areaBall());
	System.out.println(ball4.getColor()+" ball has an area of "+ ball4.areaBall());
	
	double areatotal = ball1.areaBall() + ball2.areaBall() + ball3.areaBall() + ball4.areaBall();
	
	
	
	System.out.println("The total area of the balls is "+ areatotal);
	
	System.out.println(ball1.getColor()+ " ball has a volume of units "+ ball1.volumeBall());
	System.out.println(ball2.getColor()+ " ball has a volume of units "+ ball2.volumeBall());
	System.out.println(ball3.getColor()+ " ball has a volume of units "+ ball3.volumeBall());
	System.out.println(ball4.getColor()+ " ball has a volume of units "+ ball4.volumeBall());
	
	double volumetotal = ball1.volumeBall()+ ball2.volumeBall()+ ball3.volumeBall()+ ball4.volumeBall();
	
	
	System.out.println("The total volume of the balls is "+ volumetotal);
	
	ball1.setColor("teal ");
	ball1.setRadius(15.0);
	
	
	ball1.toString();
	ball2.toString();
	ball3.toString();
	ball4.toString();
}
}