import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Flight flight;
    Passenger passenger;
    FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight("EZJT123", "EDI", "GLA", "13:00");
        passenger = new Passenger("BigTendo", 2);
    }
    @Test
    public void canCalcBaggageWeightForPassenger(){
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger);
        int weight = flightManager.getBagWeight();
        assertEquals(40, weight);
}

}
