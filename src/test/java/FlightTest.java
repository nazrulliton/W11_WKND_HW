import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;

    @Before
    public void before(){
        flight = new Flight("EZJT123", "EDI", "GLA", "13:00");
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


}
