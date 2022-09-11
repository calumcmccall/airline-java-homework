import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(1000, plane.getPlaneType().getTotalWeight());
    }

}
