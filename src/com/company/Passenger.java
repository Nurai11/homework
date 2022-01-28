package com.company;


public class Passenger {
    private int fare;
    private String name;
    private int number;

    @Override
    public String toString() {
        return "\nPassenger{" +
                "fare=" + fare +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }


    public Passenger(Passenger passenger) {
    }

    public Passenger(int fare, String name, int number) {
        this.fare = fare;
        this.name = name;
        this.number = number;
    }



    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}