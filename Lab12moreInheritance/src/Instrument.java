/*
Author:      Eliga Franks
Date:        11-15-20 
Course:      CS 1043
Section      1
File Name:   Instrument.java
Classes:     Instrument 
Description: Using base and derived classes to transfer info from class to class.
*/

public class Instrument {

    private String instrumentType;
    private String instrumentManufacturer;
    private int year;
    private double price;

    public void setType(String type ) {
        instrumentType = type ;
    }

    public String getType() {
        return instrumentType;
    }

    public void setManufacturer(String userManufacturer) {
        instrumentManufacturer = userManufacturer;
    }

    public String getManufacturer(){
        return instrumentManufacturer;
    }

    public void setYear(int userYear) {
        year = userYear;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double userPrice) {
        price = userPrice;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Instrument Information: \n") +
               String.format("   Type: %s\n", instrumentType ) + 
               String.format("   Manufacturer: %s\n", instrumentManufacturer) +
               String.format("   Year built: %d\n", year) +
               String.format("   Price: $%.2f\n", price );
    }

}