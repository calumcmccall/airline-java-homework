import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void setUp(){
        Pilot pilot = new Pilot("Tom", Rank.CAPTAIN, "A426");
        ArrayList<Pilot> pilots = new ArrayList<Pilot>();
        pilots.add(pilot);

        CabinCrewMember cabinCrewMember1 = new CabinCrewMember("Ryan", Rank.FLIGHTATTENDANT);
        CabinCrewMember cabinCrewMember2 = new CabinCrewMember("Megan", Rank.FLIGHTATTENDANT);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<CabinCrewMember>();
        cabinCrew.add(cabinCrewMember1);
        cabinCrew.add(cabinCrewMember2);

        Passenger passenger1 = new Passenger("Susan", 3);
        Passenger passenger2 = new Passenger("Angela", 2);
        Passenger passenger3 = new Passenger("Max", 4);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);

        Plane plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(pilots, cabinCrew, passengers, plane, "FR756", "GLA", "EDI", "09:42");
    }

    @Test
    public void testGetPilots() {
        assertEquals(1, flight.getPilots().size());
    }

    @Test
    public void testGetCabinCrew() {
        assertEquals(2, flight.getCabinCrew().size());
    }

    @Test
    public void testGetPassengers() {
        assertEquals(3, flight.getPassengers().size());
    }

    @Test
    public void testGetPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void testGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void testGetDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void testGetDeparture() {
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void testGetDepartureTime() {
        assertEquals("09:42", flight.getDepartureTime());
    }

    @Test
    public void testRemainingSeats(){
        assertEquals(47, flight.remainingSeats());
    }

    @Test
    public void testBookPassenger(){
        Passenger passenger4 = new Passenger("Emi", 6);
        flight.bookPassenger(passenger4);
        assertEquals(4, flight.getPassengers().size());
    }

    @Test
    public void testFlyPlane(){
        assertEquals("Tom is now flying a BOEING747", flight.getPilots().get(0).flyPlane(flight.getPlane()));
    }
}
