package de.szut;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;



public class RoverTest
{
    private Rover rover;
    private Grid grid;
    private Coordinates coordinate;
    @Before
    public void setUp() throws Exception {
        grid = mock(Grid.class);
        coordinate = mock(Coordinates.class);
        rover = mock(Rover.class);
        when(grid.isValidCoordinate(coordinate)).thenReturn(true);
        rover = new Rover(coordinate,Direction.NORTH,grid);
    }

    @Test
    public void testMoveForward() {
        Grid grid = mock(Grid.class);
        Coordinates coordinate = mock(Coordinates.class);
        when(grid.isValidCoordinate(coordinate)).thenReturn(true);
        when(coordinate.getX()).thenReturn(0);
        when(coordinate.getY()).thenReturn(0);
        when(coordinate.getZ()).thenReturn(0);


        Rover rover = new Rover(coordinate, Direction.NORTH, new Grid(5,5,10));

        rover.moveForward();
        assertEquals("(0,1,0) NORTH", rover.getPosition());

        rover.moveForward();
        assertEquals("(0,2,0) NORTH", rover.getPosition());
    }
    @Test
    public void testMoveBackward() {
        Grid grid = mock(Grid.class);
        Coordinates coordinate = mock(Coordinates.class);
        when(grid.isValidCoordinate(coordinate)).thenReturn(true);
        when(coordinate.getX()).thenReturn(0);
        when(coordinate.getY()).thenReturn(2);
        when(coordinate.getZ()).thenReturn(0);


        Rover rover = new Rover(coordinate, Direction.NORTH, new Grid(5,5,10));

        rover.moveBackward();
        assertEquals("(0,1,0) NORTH", rover.getPosition());

        rover.moveBackward();
        assertEquals("(0,0,0) NORTH", rover.getPosition());
    }
    @Test

    public void testMoveUpAndDown() {
        Grid grid = mock(Grid.class);
        Coordinates coordinate = mock(Coordinates.class);
        when(grid.isValidCoordinate(coordinate)).thenReturn(true);
        when(coordinate.getX()).thenReturn(0);
        when(coordinate.getY()).thenReturn(0);
        when(coordinate.getZ()).thenReturn(0);


        Rover rover = new Rover(coordinate, Direction.NORTH, new Grid(5,5,10));

        rover.moveUp();
        assertEquals("(0,0,1) NORTH", rover.getPosition());

        rover.moveUp();
        assertEquals("(0,0,2) NORTH", rover.getPosition());

        rover.moveDown();
        assertEquals("(0,0,1) NORTH", rover.getPosition());

        rover.moveDown();
        assertEquals("(0,0,0) NORTH", rover.getPosition());

    }




}