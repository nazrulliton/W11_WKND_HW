import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight("EZJT123", "EDI", "GLA", "13:00");
        passenger1 = new Passenger("BigTendo", 2);
        passenger2 = new Passenger("BigKendo", 1);
        flight.addLargePlaneToFlight();
        flight.bookPassengerToFlight(passenger1);
        flight.bookPassengerToFlight(passenger2);
        flightManager = new FlightManager(flight);
    }
    @Test
    public void canCountTotalBagWeightOfPassenger(){
        assertEquals(40, flightManager.weightToReserveForPassenger());
    }
    @Test
    public void CanCountTotalBagWeightOfAllPassengers(){

        assertEquals(60, flightManager.weightToReserveForAllPassengers() );
    }

}
