package de.szut;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;



    // to turn the Rove
    private Direction turn(int steps) {
        int newIndex = (this.ordinal() + steps) % 4;
        if (newIndex < 0) {
            newIndex += 4;
        }
        return Direction.values()[newIndex];
    }

    // direct the Rover to Left side
    public Direction turnLeft() {
        return turn(-1);
    }

    // direct the Rover to Right side
    public Direction turnRight() {
        return turn(1);
    }
}
