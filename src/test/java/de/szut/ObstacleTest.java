package de.szut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObstacleTest {


    @Test
    public void testGetType() {
        Obstacle obstacle = new Obstacle(true);
        assertEquals(true, obstacle.getType());
    }

    @Test
    public void testGetType_Null() {
        Obstacle obstacle = new Obstacle(null);
        assertEquals(null, obstacle.getType());
    }
}
