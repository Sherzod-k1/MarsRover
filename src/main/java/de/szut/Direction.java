package de.szut;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnLeft() {
        return turn(-1);
    }

    public Direction turnRight() {
        return turn(1);
    }

    private Direction turn(int steps) {
        int newIndex = (this.ordinal() + steps) % 4;
        if (newIndex < 0) {
            newIndex += 4;
        }
        return Direction.values()[newIndex];
    }
}
