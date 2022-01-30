package absrtact;

public interface Management {
    void addNewFlight(Flight flight);

    void showAllFlights();

    Flight searchFlightByType(String type);
}
