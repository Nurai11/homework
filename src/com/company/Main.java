package com.company;


public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setSeatNumbers(15);

        Passenger passenger = new Passenger(15, "Al", 0);
        bus.addPassenger(new Passenger(15, "Mika", 1));
        bus.addPassenger(new Passenger(15, "Mikey", 2));
        bus.addPassenger(new Passenger(15, "Lisa", 3));
        bus.addPassenger(new Passenger(15, "Jennie", 4));
        bus.addPassenger(new Passenger(15, "Kim", 5));

        bus.getListOfPassengers();
        bus.addPassenger(new Passenger(20, "Nick", 6));
        bus.searchByName("Kyle");
        bus.countTheSalary();
    }
}
