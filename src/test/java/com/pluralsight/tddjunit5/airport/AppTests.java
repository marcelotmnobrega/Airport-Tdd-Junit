package com.pluralsight.tddjunit5.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTests {

    @Test
    public void testMain() {

        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        assertTrue(economyFlight.addPassenger(john));
        assertFalse(economyFlight.removePassenger(john));
        assertTrue(businessFlight.addPassenger(john));
        assertFalse(businessFlight.removePassenger(john));

        assertTrue(economyFlight.addPassenger(mike));
        assertTrue(economyFlight.removePassenger(mike));
        assertFalse(businessFlight.addPassenger(mike));
        assertFalse(businessFlight.removePassenger(mike));
    }
}