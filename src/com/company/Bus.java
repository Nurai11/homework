package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int seatNumbers;
    private List<Passenger> passengers = new ArrayList<>();



    public void getListOfPassengers(){
        for (int i = 0; i < passengers.size(); i ++){
                System.out.println(passengers);
                break;
            }
    }



    public void addPassenger(Passenger passenger){
        if(passengers.size()<seatNumbers) {
            passengers.add(passenger);
        } else {
            System.out.println("There is no seat on the bus ");
        }
    }



    public void searchByName(String name){
        for (Passenger passenger:passengers) {
            if(passenger.getName().equals(name)){
                System.out.println(passenger);
            }else{
                System.out.println("Passenger not found. ");
                break;
            }
        }
    }


    public void countTheSalary(){
        int sum = 0;
        for (Passenger passenger:passengers) {
            sum = sum + passenger.getFare();
        }
        System.out.println(sum);
    }



    @Override
    public String toString() {
        return "Bus{" +
                "seatNumbers=" + seatNumbers +
                ", passengers=" + passengers +
                '}';
    }


    public Bus() {
    }

    public Bus(int seatNumbers, int sum) {
        this.seatNumbers = seatNumbers;
        this.passengers = passengers;
    }



    public int getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(int seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }


}

