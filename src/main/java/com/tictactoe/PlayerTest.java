package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testGetMarkerX() {
        Player player = new Player('X');
        assertEquals('X', player.getMarker());
    }

    @Test
    public void testGetMarkerO() {
        Player player = new Player('O');
        assertEquals('O', player.getMarker());
    }

    @Test
    public void testMarkersNotEqual() {
        Player p1 = new Player('X');
        Player p2 = new Player('O');
        assertNotEquals(p1.getMarker(), p2.getMarker());
    }

    @Test
    public void testMarkerIsChar() {
        Player player = new Player('X');
        assertTrue(player.getMarker() == 'X');
    }
}