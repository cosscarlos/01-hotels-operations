package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if  (getRoomType() == "king"){
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
    }

    public double getPrice() {
        return price;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

}

