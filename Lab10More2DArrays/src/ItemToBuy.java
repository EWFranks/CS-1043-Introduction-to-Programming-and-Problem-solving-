import java.lang.Math;
import java.util.Scanner;

/*
 Author:      Eliga Franks
 Date:        11-4-20 
 Course:      CS 1043
 Section      1
 File Name:   ItemToBuy.java
 Classes:     ItemToBuy 
 Description: The Destination of classes and Data Types
*/

public class ItemToBuy {
	String itemName;
	double itemPrice;
	int itemQuantity;

	ItemToBuy() {

		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;

	}

	public void setName(String Name) {
		itemName = Name;

	}

	public String getName() {
		return itemName;
	}

	public void setPrice(double productPrice) {
		itemPrice = productPrice;

	}

	public double getPrice() {
		return itemPrice;
	}

	public void setQuantity(int number) {
		itemQuantity = number;

	}

	public int getQuantity() {
		return itemQuantity;
	}

	public String toString() {
		return String.format("Name: %s\nQuantity: %d\nPrice / Item: $%.2f\n", getName(), getQuantity(), getPrice());
	}
}