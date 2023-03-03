package de.szut;

import javafx.scene.control.Cell;

public class Grid {

    private final int width;
    private final int height;
    private final Cell[][] cells;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.cells[y][x] = new Cell();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return null;
        }
        return cells[y][x];
    }

    public boolean isCellOccupied(int x, int y) {
        Cell cell = getCell(x, y);
        return cell != null  && cell.hasProperties();
    }

    public void setCellOccupied(int x, int y, boolean occupied) {
        Cell cell = getCell(x, y);
        if (cell != null) {
            cell.setEditable(occupied);
        }
    }
}
