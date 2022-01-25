package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNunber = input.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(input.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(input.next());
		
		if (!checkOut.after(checkin)) {
			System.out.print("Error in reservatio: Check-out date must be after check-in date. ");
			
		} else {
			Reservation reservation = new Reservation(roomNunber, checkin, checkOut);
			System.out.print("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter date to update the reservation: ");

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(input.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
		    checkOut = sdf.parse(input.next());
		    
		    reservation.updateDates(checkin, checkOut);
			System.out.print("Reservation: " + reservation);
		    
		}
		
		input.close();

	}

}
