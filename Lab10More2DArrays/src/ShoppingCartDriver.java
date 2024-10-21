import java.util.Scanner;

import java.util.Scanner;

public class ShoppingCartDriver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String productName;
		double productPrice = 0.0;
		int productQuantity = 0;

		// Instantiate two ItemToBuy objects: item1 and item2
		ItemToBuy item1 = new ItemToBuy();
		ItemToBuy item2 = new ItemToBuy();

		String[] tokens = null;
		

		// Get item 1 details from user, create itemToPurchase object
		System.out.println("Item 1");
		System.out.println("Enter comma separated list: name, price, quantity:");

		tokens = scnr.nextLine().split(",");

		productName = tokens[0].trim();
		productPrice = Double.parseDouble(tokens[1].trim());
		productQuantity = Integer.parseInt(tokens[2].trim());
		item1.setName(productName);
		item1.setPrice(productPrice);
		item1.setQuantity(productQuantity);

		System.out.println("Item 2");
		System.out.println("Enter comma separated list: name, price, quantity:");

		tokens = scnr.nextLine().split(",");
		System.out.println("");

		productName = tokens[0].trim();
		productPrice = Double.parseDouble(tokens[1].trim());
		productQuantity = Integer.parseInt(tokens[2].trim());
		item2.setName(productName);
		item2.setPrice(productPrice);
		item2.setQuantity(productQuantity);
		System.out.println("");
		// set the instance fields for item1 using the setter methods.

		// Add costs of two items and print total. Use the getPrice and getQuantity
		// methods.

		System.out.println("List"); // use the to String method for both items here:

		System.out.print(item1.toString());
		
		System.out.print(item2.toString());
		

		// System.out.println( item1.getName()+" " +item1.getQuantity()+" "+ " @ "+
		// item1.getPrice()+" = $"+(item1.getPrice()*item1.getQuantity()) );
		// System.out.println( item2.getName()+" " +item2.getQuantity()+" "+ " @ "+
		// item2.getPrice()+" = $"+(item2.getPrice()*item2.getQuantity()) );

		System.out.println("\nItems Receipt:"); // print detailed receipt for both items:
		System.out.printf("%s %d @ $%.2f = $%.2f\n", item1.getName(), item1.getQuantity(), item1.getPrice(),
				(item1.getPrice() * item1.getQuantity()));
		System.out.printf("%s %d @ $%.2f = $%.2f\n", item2.getName(), item2.getQuantity(), item2.getPrice(),
				(item2.getPrice() * item2.getQuantity()));

		double cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

		System.out.println("");
		System.out.printf("Total: $%.2f\n", cartTotal);

	}
}
