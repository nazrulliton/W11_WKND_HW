import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private ArrayList<PlaneType> plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNum, String destination, String departureAirport, String departureTime){
        passengers = new ArrayList<Passenger>();
        plane = new ArrayList<PlaneType>();
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    public void addLargePlaneToFlight(){
        plane.add(PlaneType.BOEINGLARGE);
    }
    public void addSmallPlaneToFlight(){
        plane.add(PlaneType.BOEINGSMALL);
    }
    public int getPlaneSize(){
        return this.plane.size();
    }
    public int getPlaneCapacity() {
        return this.plane.get(0).getCapacity();
    }
}
