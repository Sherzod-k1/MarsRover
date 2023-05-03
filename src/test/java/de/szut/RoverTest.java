package de.szut;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


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





}