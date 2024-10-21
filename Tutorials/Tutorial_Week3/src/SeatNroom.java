import java.util.Scanner;

/*
Author:      Eliga Franks
Date:        9-23-20 
Course:      CS 1043
Section      1
File Name:   SeatNroom.java
Classes:     SeatNroom
Description: Using a switch-control to display the number of seating in a requested room.
*/
public class SeatNroom {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int room = scnr.nextInt();
		int seats = 0;

		if (room < 101 || room > 116)
			System.out.println("Invalid room number, zero seats");
		else {

			switch (room) {
			case 110:
			case 101:
			case 116:
				seats = 50;
				break;
			case 111:
			case 113:
				seats = 50;
				break;
			case 112:
			case 114:
				seats = 35;
				break;
			default:
				seats = 40;
			}

			System.out.printf("Room number %d has %d seats.\n", room, seats);
		}
		scnr.close();
	}
}