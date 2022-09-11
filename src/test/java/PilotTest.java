import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Martin", Rank.CAPTAIN, "A594");
    }

    @Test
    public void hasName(){
        assertEquals("Martin", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotLicence(){
        assertEquals("A594", pilot.getPilotLicence());
    }

}
