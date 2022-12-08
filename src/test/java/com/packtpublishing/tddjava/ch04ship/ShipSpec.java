package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {

    Location startingLocation;
    Ship ship;

    @BeforeMethod
    public void beforeTest() {
        Point startingPoint = new Point(0, 0);
        Direction startingDirection = Direction.NORTH;
        startingLocation = new Location(startingPoint, startingDirection);
        ship = new Ship(startingLocation);
    }

    public void whenInstantiatedThenLocationIsSet() {
        //Point startingPoint = new Point(0, 0);
        // Direction startingDirection = Direction.NORTH;
        // Location startingLocation = new Location(startingPoint, startingDirection);
        // Ship ship = new Ship(startingLocation);
        assertEquals(ship.getLocation(), startingLocation);
    }

}
