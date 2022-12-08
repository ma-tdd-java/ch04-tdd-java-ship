package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {
    public void whenInstantiatedThenLocationIsSet() {
        Point startingPoint = new Point(0, 0);
        Direction startingDirection = Direction.NORTH;
        Location startingLocation = new Location(startingPoint, startingDirection);
        Ship ship = new Ship(startingLocation);
        assertEquals(ship.getLocation(), startingLocation);
    }

}
