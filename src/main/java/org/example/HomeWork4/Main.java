package org.example.HomeWork4;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1,"Однокомнатный",2500);
        Guest guest1 = new Guest("Max", 1);
        Booking booking1 = new Booking(room1, guest1, LocalDate.of(2024,5,17), LocalDate.of(2024,8,17));
        guest1.addBooking(booking1);
        booking1.calculateTotalAmount();
        System.out.println(booking1);

    }
}
