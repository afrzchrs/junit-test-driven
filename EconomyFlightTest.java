package flightapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EconomyFlightTest {

    @Test
    void testEconomyFlightRegularPassenger() {
        Flight flight = new EconomyFlight("ECO-123");
        Passenger passenger = new Passenger("Budi", false);

        assertTrue(flight.addPassenger(passenger));
        assertFalse(flight.removePassenger(passenger));
    }

    @Test
    void testEconomyFlightVipPassenger() {
        Flight flight = new EconomyFlight("ECO-123");
        Passenger passenger = new Passenger("Sita", true);

        assertTrue(flight.addPassenger(passenger));
        assertTrue(flight.removePassenger(passenger));
    }
}
