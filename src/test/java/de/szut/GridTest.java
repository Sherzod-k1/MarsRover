package de.szut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;

public class GridTest {

    private Grid grid;
    @Before
    public void setUp() {
        grid = new Grid(10, 10, 3);
    }

    @Test
    public void testIsCellOccupied() {
        assertFalse(grid.isCellOccupied(0, 0, 0));
        grid.setCellOccupied(0, 0, 0, true);
        assertTrue(grid.isCellOccupied(0, 0, 0));
        assertFalse(grid.isCellOccupied(1, 1, 1));
    }
    @Test
    public void testIsValidCoordinate() {
        assertTrue(grid.isValidCoordinate(new Coordinates(0, 0, 0)));
        assertTrue(grid.isValidCoordinate(new Coordinates(2, 2, 2)));
        assertFalse(grid.isValidCoordinate(new Coordinates(-1, 0, 0)));
        assertFalse(grid.isValidCoordinate(new Coordinates(0, -1, 0)));
        assertFalse(grid.isValidCoordinate(new Coordinates(0, 0, -1)));
    }

    @Test
    public void testSetCellOccupied() {
        assertFalse(grid.isCellOccupied(0, 0, 0));
        grid.setCellOccupied(0, 0, 0, true);
        assertTrue(grid.isCellOccupied(0, 0, 0));
    }

    @Test
    public void testSetCellOccupied_InvalidCoordinate() {
        assertFalse(grid.isCellOccupied(3, 3, 3));
        grid.setCellOccupied(3, 3, 3, true);
        assertFalse(grid.isCellOccupied(3, 3, 3));
    }


}
