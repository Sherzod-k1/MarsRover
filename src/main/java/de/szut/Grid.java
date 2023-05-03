package de.szut;


public class Grid {

    private final int width;
    private final int height;
    private final boolean[][] occupiedCells;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.occupiedCells = new boolean[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isCellOccupied(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return false;
        }
        return occupiedCells[y][x];
    }

    public boolean isValidCoordinate(Coordinates coordinate) {
        if (coordinate.getX() < 0 || coordinate.getX() >= width) {
            return false;
        }
        if (coordinate.getY() < 0 || coordinate.getY() >= height) {
            return false;
        }
        return true;
    }

    public void setCellOccupied(int x, int y, boolean occupied) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return;
        }
        occupiedCells[y][x] = occupied;
    }
}