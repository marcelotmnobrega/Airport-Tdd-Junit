package com.pluralsight.tddjunit5.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testMain() {
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        assertEquals(true, economyFlight.addPassenger(john));

    }
}