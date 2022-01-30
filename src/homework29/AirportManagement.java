package homework29;

import java.util.Arrays;

public class AirportManagement implements Management{
    private AbstractAircraft[] abstractAircraft;
    private Flight[] flights;


    public AirportManagement(int count) {
        flights = new Flight[count];
    }



    @Override
    public void addNewFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = flight;
                break;
            }
        }
    }

    @Override
    public void showAllFlights() {
        for (int i = 0; i < flights.length; i++) {
            if (flights != null) {
                System.out.println(flights);
            } else {
                System.out.println("Flights not found");
            }
        }
    }


    @Override
    public Flight searchFlightByType(String type) {
        for (Flight f : flights) {
            if (f != null && f.getAircraft() != null && f.getAircraft().getType().equals(type)) {
                return f;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "AirportManagement{" +
                "abstractAircraft=" + Arrays.toString(abstractAircraft) +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
