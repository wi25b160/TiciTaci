package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board board = new Board();

    @Test
    public void testIsCellEmptyTrue() {
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    public void testIsCellEmptyFalse() {
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    public void testIsFullFalse() {
        assertFalse(board.isFull());
    }

    @Test
    public void testClearBoard() {
        board.place(0, 0, 'X');
        board.clear();
        assertTrue(board.isCellEmpty(0, 0));
    }
}