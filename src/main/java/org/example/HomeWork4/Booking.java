package org.example.HomeWork4;

import java.time.LocalDate;
import java.time.Period;

public class Booking {

    private Room room;
    private Guest guest;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalAmount;

    public Booking(Room room, Guest guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Booking() {
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateTotalAmount(){
        Period period = Period.between(checkInDate, checkOutDate);
        int date = period.getDays();
        totalAmount = date * room.getPricePerNight();
        System.out.println(totalAmount);
        System.out.println(date);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room.getRoomNumber() +
                "room=" + room.getType() +
                "room=" + room.getPricePerNight() +
                ", guest=" + guest.getName() +
                ", guest=" + guest.getQuestId() +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
