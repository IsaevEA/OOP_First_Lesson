package org.example.HomeWork4;

public class Hotel {

    private Room [] rooms = new Room[100];
    private Guest [] guests = new Guest[100];
    private Booking[] bookings = new Booking[100];
    public Hotel() {
    }

    public Hotel(Room[] rooms, Guest[] guests, Booking[] bookings) {
        this.rooms = rooms;
        this.guests = guests;
        this.bookings = bookings;
    }

    
}
