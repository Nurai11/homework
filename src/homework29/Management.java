package homework29;


public interface Management {
    void addNewFlight(Flight flight);

    void showAllFlights();

    Flight searchFlightByType(String type);
}
