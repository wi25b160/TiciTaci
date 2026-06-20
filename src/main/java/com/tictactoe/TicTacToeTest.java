package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    public void testSwitchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        char first = game.getCurrentPlayer().getMarker();
        game.switchCurrentPlayer();
        char second = game.getCurrentPlayer().getMarker();
        assertNotEquals(first, second);
    }

    @Test
    public void testHasWinnerFalse() {
        TicTacToe game = new TicTacToe();
        assertFalse(game.hasWinner());
    }

    @Test
    public void testHasWinnerTrue() {
        TicTacToe game = new TicTacToe();
        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(0, 1, 'X');
        game.getBoard().place(0, 2, 'X');
        assertTrue(game.hasWinner());
    }

    @Test
    public void testSwitchPlayerTwice() {
        TicTacToe game = new TicTacToe();
        char first = game.getCurrentPlayer().getMarker();
        game.switchCurrentPlayer();
        game.switchCurrentPlayer();
        assertEquals(first, game.getCurrentPlayer().getMarker());
    }
}