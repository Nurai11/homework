package absrtact;

public class Flight {
    private int id;
    private String departureTime;
    private String arrivalTime;
    private AbstractAircraft aircraft;
    private String status;

    public Flight() {
    }

    public Flight(int id, String departureTime, String arrivalTime, AbstractAircraft aircraft, String status) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public AbstractAircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(AbstractAircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", aircraft=" + aircraft +
                ", status='" + status + '\'' +
                '}';
    }
}
