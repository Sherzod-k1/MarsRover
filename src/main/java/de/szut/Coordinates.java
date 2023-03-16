package de.szut;

public class Coordinates {
    private int x;
    private int y;
    private int z;


    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // set x as coordinate
    public void setX(int x) {
        this.x = x;
    }

    // set y as coordinate
    public void setY(int y) {
        this.y = y;
    }

    // set z as coordinate
    public void setZ(int z) {
        this.z = z;
    }

    // get x as coordinate
    public int getX() {
        return x;
    }

    // get y as coordinate
    public int getY() {
        return y;
    }

    // get z as coordinate
    public int getZ() {
        return z;
    }



    // move the Rover and set the new coordinates
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // convert the coordinates to String
    public String toString() {
        return "(" + x + "," + y +"," + z + ")";
    }
}
