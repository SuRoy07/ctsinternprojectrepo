package com.hotel.service;

import com.hotel.model.Hotel;
import com.hotel.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//use appropriate annotation to make this class as service class

@Service
public class ReservationService {
    
    @Autowired
    private Hotel hotel;

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    public void bookReservation(Reservation reservation) throws ParseException {
	    
	    //Fill the code here 
	    
	    Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter the Customer Name");
        String customerName = scanner.nextLine();
        System.out.println("Enter the Phone Number");
        Long mobileNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Enter the Check-In Date <dd-MM-yyyy>");
        Date checkInDate = new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine());
        System.out.println("Enter the Check-Out Date <dd-MM-yyyy>");
        Date checkOutDate = new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine());
        System.out.println("Enter the Total Number of Guests");
        int noOfGuests = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Room Type");
        String roomType = scanner.next();
        
        reservation.setCustomerName(customerName);
        reservation.setPhoneNumber(mobileNumber);
        reservation.setCheckInDate(checkInDate);
        reservation.setCheckOutDate(checkOutDate);
        reservation.setNumOfGuests(noOfGuests);
        reservation.setRoomType(roomType);

        double bookingCost = calculateBookingCost(roomType, checkInDate, checkOutDate);
        if(bookingCost>0) {
        	System.out.println("Total Booking Cost is: $" + bookingCost);
        }
        else
        {
        	System.out.println("Invalid Details");
        }

    }

    public double calculateBookingCost(String roomType, Date checkInDate, Date checkOutDate) {
        double roomRate = -1;
            
	    //Fill the code here 
	    if(hotel.getRoomRates().get(roomType)==null)
	    {
	        System.out.println("Room type is not available");
            return -1;
	    }
	    else if (checkAvailability(checkInDate, checkOutDate)) {
            roomRate = hotel.getRoomRates().get(roomType);
            long durationInMillis = checkOutDate.getTime() - checkInDate.getTime();
            int durationInDays = (int) Math.ceil(durationInMillis / (1000 * 60 * 60 * 24));
            return roomRate * durationInDays;
        } else {
            System.out.println("Room not available for the specified dates.");
            return -1; // Indicate error
        }
        
    }

    public boolean checkAvailability(Date checkInDate, Date checkOutDate) {
        
        //Fill the code here 
        
	    return checkInDate.before(checkOutDate);
	    
    }
 
}