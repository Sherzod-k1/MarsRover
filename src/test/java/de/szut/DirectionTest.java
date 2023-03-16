package de.szut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void testToString() {
        Direction north = Direction.NORTH;
        Direction east = Direction.EAST;
        Direction south = Direction.SOUTH;
        Direction west = Direction.WEST;

        assertEquals("NORTH", north.toString());
        assertEquals("EAST", east.toString());
        assertEquals("SOUTH", south.toString());
        assertEquals("WEST", west.toString());
    }

    @Test
    public void testTurnLeft() {
        Direction north = Direction.NORTH;
        Direction east = Direction.EAST;
        Direction south = Direction.SOUTH;
        Direction west = Direction.WEST;

        assertEquals(west, north.turnLeft());
        assertEquals(north, east.turnLeft());
        assertEquals(east, south.turnLeft());
        assertEquals(south, west.turnLeft());
    }

    @Test
    public void testTurnRight() {
        Direction north = Direction.NORTH;
        Direction east = Direction.EAST;
        Direction south = Direction.SOUTH;
        Direction west = Direction.WEST;

        assertEquals(east, north.turnRight());
        assertEquals(south, east.turnRight());
        assertEquals(west, south.turnRight());
        assertEquals(north, west.turnRight());
    }

}
