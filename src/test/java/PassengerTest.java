import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("BigDave", 2)
    }
    @Test
    public void pHasName(){
        assertEquals("BigDave", passenger.getName());
    }
    


}
