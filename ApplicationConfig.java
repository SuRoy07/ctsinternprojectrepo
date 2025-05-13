package com.hotel;

import java.text.ParseException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hotel.model.Reservation;
import com.hotel.service.ReservationService;

//Use appropriate annotations 

@Configuration
@ComponentScan("com.hotel")
@PropertySource("classpath:details.properties")
public class ApplicationConfig {
    public static void main(String[] args) throws ParseException {
        // Fill the Code Here
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ReservationService reservationService = context.getBean(ReservationService.class);
        Reservation reservation = context.getBean(Reservation.class);

        reservationService.bookReservation(reservation);
        
    }
}
