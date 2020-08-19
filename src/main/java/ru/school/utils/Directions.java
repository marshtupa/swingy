package ru.school.utils;

public class Directions {
    private static final Coordinates north = new Coordinates(1, 0);
    private static final Coordinates south = new Coordinates(1, 0);
    private static final Coordinates east = new Coordinates(1, 0);
    private static final Coordinates west = new Coordinates(1, 0);


    public static Coordinates getNorth() {
        return north;
    }

    public static Coordinates getSouth() {
        return south;
    }

    public static Coordinates getEast() {
        return east;
    }

    public static Coordinates getWest() {
        return west;
    }
}
