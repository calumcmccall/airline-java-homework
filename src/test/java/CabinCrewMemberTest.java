import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Tom", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Tom", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

}
