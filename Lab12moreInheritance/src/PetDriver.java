import java.util.Scanner;
/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   PetDriver.java
Classes:     PetDriver
Description: Using base and derived classes to transfer info from class to class.
*/
public class PetDriver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Dog myDog = new Dog();
      
     

      String [] tokens;
     
      
      System.out.println("Enter generic pet name and age as: name, age" );
      System.out.println("Enter generic pet name and age as: name, age, breed" );
      tokens = scnr.nextLine().split(",");
      String petName = tokens[0].strip();
      int petAge = Integer.parseInt( tokens[1].strip() );
      tokens = scnr.nextLine().split(",");
      String dogName = tokens[0].strip();
      int dogAge = Integer.parseInt( tokens[1].strip() );
      String dogBreed = tokens[2].strip();
    
      // TODO: Capture the name and and breed using the variable declared above.
      
      // TODO: Assign the generic pet (using petName, petAge) to myPet with the setters,
      //       then print from toString   
      myPet.setName(petName);
      myPet.setAge(petAge);
      myPet.toString();
      //use toString instead
      
      System.out.println(myPet.toString()); // add a new line here
     // System.out.println();
      // TODO: Assign the dog pet (using dogName, dogAge, dogBreed) to myDog with the setters,
      //       then print from toString
      myDog.setName(dogName);
      myDog.setAge(dogAge);
      myDog.toString();
      
      myDog.setBreed(dogBreed);
      
      System.out.println();
      
      System.out.println(myDog.toString());   //use toString
      // TODO: Use getBreed(), to print the breed of the dog.
      
      System.out.println("   Breed: "+ myDog.getBreed());
      
      scnr.close();
   }
}