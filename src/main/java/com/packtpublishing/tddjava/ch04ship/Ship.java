package com.packtpublishing.tddjava.ch04ship;

public class Ship {

    private final Location location;

    public Ship(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }
}
