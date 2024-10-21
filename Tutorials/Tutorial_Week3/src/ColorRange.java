import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        9-23-20 
Course:      CS 1043
Section      1
File Name:   ColorRange.java
Classes:     ColorRange
Description: Using a switch-control to display the wavelength range for a input color
*/
public class ColorRange {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      String color = scnr.next();
	      color = color.substring(0, Math.min(color.length(), 3) ).toLowerCase();
	      
	      switch ( color ) {
	      case "inf":
	    	  System.out.println("Infra-red: greater than 0.700 microns");
	    	  break;
	      case "red":
	    	  System.out.println("Red: 0.647-0.700 microns");
	    	  break;
	      case "ora":
	    	  System.out.println("Orange: 0.585-0.647 microns");
	    	  break;
	      case "yel":
	    	  System.out.println("Yellow: 0.575-0.585 microns");
	    	  break;
	      case "gre":
	    	  System.out.println("Green: 0.491-0.575 microns");
	    	  break;
	      case "blu":
	    	  System.out.println("Blue: 0.424-0.491 microns");
	    	  break;
	      case "vio":
	    	  System.out.println("Violet: 0.400-0.424 microns");
	    	  break;
	      case "ult":
	    	  System.out.println("Ultra-violet: at most 0.400 microns");
	    	  break;
	      default:
	    	  System.out.println("Unknown color");
	      }
	      
	      scnr.close();
}
}