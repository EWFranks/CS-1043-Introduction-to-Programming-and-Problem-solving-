
public class OutputWithVars {
	import java.util.Scanner; 

	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	    	      int givenYear;

	    	      givenYear = scnr.nextInt();

	    	      if (givenYear > 2100){
	    	         System.out.print("Distant future");
	    	      }
	    	      else
	    	      {
	    	      if (givenYear >=2100){
	    	      System.out.println("21st century");
	    	      }
	    	      else
	    	      {
	    	      if (givenYear >= 1901){
	    	      System.out.print("20th century");
	    	      }
	    	      else
	    	   {
	    	      if (givenYear <=1900){
	    	      System.out.print("Long ago");
	    	      }
	    	   }
	    	      }
	    	      }
	   }
	    	      
	    	   
	    	   
	    	