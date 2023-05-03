package de.szut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.szut.Coordinates;
import de.szut.Grid;
import org.junit.Before;
import org.junit.Test;

public class GridTest {

    private Grid grid;

    @Test
    public void testMoveForwardCommand() {
        Grid grid = new Grid(10, 10);

        // Test valid coordinates
        assertTrue(grid.isValidCoordinate(new Coordinates(0, 0, 0)));
        assertTrue(grid.isValidCoordinate(new Coordinates(9, 9, 0)));

        // Test coordinates outside of grid
        assertFalse(grid.isValidCoordinate(new Coordinates(10, 10, 0)));
        assertFalse(grid.isValidCoordinate(new Coordinates(-1, -1, 0)));
        assertFalse(grid.isValidCoordinate(new Coordinates(5, 15, 0)));
        assertFalse(grid.isValidCoordinate(new Coordinates(15, 5, 0)));
    }
}
