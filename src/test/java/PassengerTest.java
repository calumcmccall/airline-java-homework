import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Amy", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Amy", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }

}
