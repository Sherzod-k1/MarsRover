package de.szut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {
    @Test
    public void testGetX() {
        Coordinates coordinate = new Coordinates(3, 4,0);
        assertEquals(3, coordinate.getX());
    }

    @Test
    public void testGetY() {
        Coordinates coordinate = new Coordinates(3, 4,0);
        assertEquals(4, coordinate.getY());
    }

    @Test
    public void testGetZ() {
        Coordinates coordinate = new Coordinates(3, 4,0);
        assertEquals(0, coordinate.getZ());
    }

    @Test
    public void testToString() {
        Coordinates coordinate = new Coordinates(3, 4,0);
        assertEquals("(3,4,0)", coordinate.toString());
    }


}
