package de.szut;

public class Rover {
private Coordinates coordinates;
private Direction direction;
    public Rover(Coordinates coordinates, Direction direction, Grid grid) {
        this.coordinates = coordinates;
        this.direction = direction;
        this.grid = grid;
    }
    public void moveForward() {
        Coordinates newCoordinates = getNewCoordinates(1);
        move(newCoordinates);
    }

    public void moveBackward() {
        Coordinates newCoordinates = getNewCoordinates(-1);
        move(newCoordinates);
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void moveUp() {
        Coordinates newCoordinates = new Coordinates(coordinates.getX(), coordinates.getY(), coordinates.getZ() + 1);
        move(newCoordinates);
    }

    public void moveDown() {
        Coordinates newCoordinates = new Coordinates(coordinates.getX(), coordinates.getY(), coordinates.getZ() - 1);
        move(newCoordinates);
    }

    private Coordinates getNewCoordinates(int distance) {
        int newX = coordinates.getX();
        int newY = coordinates.getY();
        int newZ = coordinates.getZ();
        switch (direction) {
            case NORTH:
                newY += distance;
                break;
            case EAST:
                newX += distance;
                break;
            case SOUTH:
                newY -= distance;
                break;
            case WEST:
                newX -= distance;
                break;
        }
        return new Coordinates(newX, newY, newZ);
    }

    private void move(Coordinates newCoordinates) {
        if (grid.isValidCoordinate(newCoordinates)) {
            coordinates = newCoordinates;
        } else {
            System.out.println("Cannot move to " + newCoordinates + " - obstacle detected!");
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Direction getDirection() {
        return direction;
    }

}
