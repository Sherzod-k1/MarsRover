package de.szut;

public class Grid {

    private final int width;
    private final int height;
    private final int depth;
    private final boolean[][][] occupiedCells;
    private final Obstacle[][][] obstacles;

    public Grid(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.occupiedCells = new boolean[depth][height][width];
        this.obstacles = new Obstacle[depth][height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isCellOccupied(int x, int y, int z) {
        if (x < 0 || x >= width || y < 0 || y >= height || z < 0 || z >= depth) {
            return false;
        }
        return occupiedCells[z][y][x];
    }

    public boolean isValidCoordinate(Coordinates coordinate) {
        if (coordinate.getX() < 0 || coordinate.getX() >= width) {
            return false;
        }
        if (coordinate.getY() < 0 || coordinate.getY() >= height) {
            return false;
        }
        if (coordinate.getZ() < 0 || coordinate.getZ() >= depth) {
            return false;
        }
        return obstacles[coordinate.getZ()][coordinate.getY()][coordinate.getX()] == null;

    }

    public void setCellOccupied(int x, int y, int z, boolean occupied) {
        if (x < 0 || x >= width || y < 0 || y >= height || z < 0 || z >= depth) {
            return;
        }
        occupiedCells[z][y][x] = occupied;
    }
    public Obstacle getObstacle(int x, int y, int z) {
        if (x < 0 || x >= width || y < 0 || y >= height || z < 0 || z >= depth) {
            return null;
        }
        return obstacles[z][y][x];
    }
}
