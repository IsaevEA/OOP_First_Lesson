package org.example.HomeWork4;

import java.util.Arrays;

public class Guest {
    private String name;
    private int questId;
    private final Booking [] bookings = new Booking[10];
    private int index = 0;

    public Guest(String name, int questId) {
        this.name = name;
        this.questId = questId;
    }

    public Guest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }
    public void addBooking(Booking booking){
        if (index< bookings.length){
            bookings[index] = booking;
            index++;
        }
    }


    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", questId=" + questId +
                ", bookings=" + Arrays.toString(bookings) +
                ", index=" + index +
                '}';
    }
}
