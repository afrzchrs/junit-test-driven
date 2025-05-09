package flightapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessFlightTest {

    @Test
    void testBusinessFlightRegularPassenger() {
        Flight flight = new BusinessFlight("BUS-456");
        Passenger passenger = new Passenger("Adi", false);

        assertFalse(flight.addPassenger(passenger));
    }

    @Test
    void testBusinessFlightVipPassenger() {
        Flight flight = new BusinessFlight("BUS-456");
        Passenger passenger = new Passenger("Rina", true);

        assertTrue(flight.addPassenger(passenger));
        assertTrue(flight.removePassenger(passenger));
    }
}
