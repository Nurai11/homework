package homework29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractAircraft tu154 = new Tu154();
        AbstractAircraft boeing = new Boeing();
        AirportManagement airportManagement = new AirportManagement(3);


        int point;
        do {
            System.out.println("\n1. Add new flight");
            System.out.println("2. Show all flights");
            System.out.println("3. Search by type of aircraft ");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Flight newFlight = new Flight();
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    newFlight.setId(id);

                    System.out.println("Enter departure time: ");
                    String departureTime  = scanner.next();
                    newFlight.setDepartureTime(departureTime);

                    System.out.println("Enter arrival time: ");
                    String arrivalTime = scanner.next();
                    newFlight.setArrivalTime(arrivalTime);

                    newFlight.setAircraft(boeing);
                    airportManagement.addNewFlight(new Flight());

                    break;

                case 2: airportManagement.showAllFlights(); break;
                case 3:
                    System.out.println("Enter type: ");
                    String type = scanner.nextLine();
                    airportManagement.searchFlightByType(type);
                    break;

            }
        } while (point != 0);
    }
}
