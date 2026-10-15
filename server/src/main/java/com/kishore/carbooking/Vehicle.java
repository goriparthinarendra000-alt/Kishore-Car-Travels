package com.kishore.carbooking;

public class Vehicle {
    private String name;
    private int seats;
    private double pricePerKm;

    public Vehicle(String name, int seats, double pricePerKm) {
        this.name = name;
        this.seats = seats;
        this.pricePerKm = pricePerKm;
    }

    public String getName() { return name; }
    public int getSeats() { return seats; }
    public double getPricePerKm() { return pricePerKm; }
}