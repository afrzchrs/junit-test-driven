package flightapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    @Test
    void testEconomyFlight() {
        Flight flight = new EconomyFlight("ECO-123");
        Passenger regular = new Passenger("Budi", false);
        Passenger vip = new Passenger("Sita", true);

        assertTrue(flight.addPassenger(regular));
        assertFalse(flight.removePassenger(regular));

        assertTrue(flight.addPassenger(vip));
        assertTrue(flight.removePassenger(vip));
    }

    @Test
    void testBusinessFlight() {
        Flight flight = new BusinessFlight("BUS-456");
        Passenger regular = new Passenger("Adi", false);
        Passenger vip = new Passenger("Rina", true);

        assertFalse(flight.addPassenger(regular));

        assertTrue(flight.addPassenger(vip));
        assertTrue(flight.removePassenger(vip));
    }
}
