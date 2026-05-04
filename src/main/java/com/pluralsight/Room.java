package com.pluralsight;

public class Room {
    private String numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;



    public Room(String numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;


    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() { // derived method
        return (!this.occupied && !this.dirty);
    }


}





