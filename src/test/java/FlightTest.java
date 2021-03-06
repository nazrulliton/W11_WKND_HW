import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        flight = new Flight("EZJT123", "EDI", "GLA", "13:00");
        passenger = new Passenger("BigTendo", 2);
    }
//    @Test
//    public void flightShouldReturnNumberOfSeats(){
//
//    }
    @Test
    public void canAddPlanetoFlight(){
        flight.addLargePlaneToFlight();
        assertEquals(1, flight.getPlaneSize());
    }
    @Test
    public void canReturnNumSeats(){
        flight.addLargePlaneToFlight();
        assertEquals(200, flight.getPlaneCapacity());
    }
    @Test
    public void canAddPtoFlight(){
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger);
        assertEquals(1, flight.getPassengerSize());

    }
    @Test
    public void canReturnNumAvailSeats(){
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger);
        assertEquals(199, flight.getAvailSeats());
    }
    @Test
    public void canReturnNumOfBags(){
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger);
        assertEquals(2, flight.getNumOfBag());
    }
    @Test
    public void checkAllowanceForBaggageWeight() {
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger);
        assertEquals(400, flight.getPlaneBaggageWeightAllowance());
    }

}
