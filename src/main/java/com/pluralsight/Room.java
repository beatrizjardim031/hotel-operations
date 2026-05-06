package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
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
    public boolean isAvailable () {
        return !isDirty() && !isOccupied();
    }
    // other methods
    public void checkIn() {
        if (isDirty()) {
            System.out.println("We got to clean this mess! Come back later");
        }
        else if (isOccupied()) {
            System.out.println("Shhh, someone is here.");
        } else {
            setOccupied(true);
            setDirty(true);
        }
    }

    public void checkOut(){
       setOccupied(false);
    }

    public void cleanRoom() {
        setDirty(false);
    }
}
