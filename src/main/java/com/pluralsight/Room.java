package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean Occupied;
    private boolean Dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.Occupied = isOccupied;
        this.Dirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public boolean isDirty() {
        return Dirty;
    }

    public void setDirty(boolean dirty) {
        Dirty = dirty;
    }
    public boolean isAvailable () {
        return !isDirty() && !isOccupied();
    }
}
