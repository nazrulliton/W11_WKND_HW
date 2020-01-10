import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    PlaneType planeType;
    Plane  plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEINGLARGE);
    }
    
}

