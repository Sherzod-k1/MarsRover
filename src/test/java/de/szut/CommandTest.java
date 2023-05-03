package de.szut;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    @Test
    public void testMoveForwardCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 0, 0), Direction.NORTH, grid);
       assertEquals("(0,1,0) NORTH", rover.getPosition());
    }
  @Test
    public void testMoveBackwardCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 1, 0), Direction.NORTH, grid);
        assertEquals("(0,0,0) NORTH", rover.getPosition());
    }

    @Test
    public void testTurnLeftCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 0, 0), Direction.NORTH, grid);
        assertEquals("(0,0,0) WEST", rover.getPosition());
    }

    @Test
    public void testTurnRightCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 0, 0), Direction.NORTH, grid);
        assertEquals("(0,0,0) EAST", rover.getPosition());
    }

    @Test
    public void testMoveUpCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 0, 0), Direction.NORTH, grid);
        assertEquals("(0,0,1) NORTH", rover.getPosition());
    }

    @Test
    public void testMoveDownCommand() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Coordinates(0, 0, 1), Direction.NORTH, grid);
        assertEquals("(0,0,0) NORTH", rover.getPosition());
    }
}
