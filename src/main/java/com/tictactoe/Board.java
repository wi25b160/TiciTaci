package com.tictactoe;

public class Board {
    private char[][] cells;

    public Board() {
        cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int row, int col) {
        return cells[row][col] == ' ';
    }

    public void place(int row, int col, char marker) {
        cells[row][col] = marker;
    }

    public boolean isFull() {
        for (char[] row : cells)
            for (char c : row)
                if (c == ' ') return false;
        return true;
    }

    public void clear() {
        for (char[] row : cells)
            java.util.Arrays.fill(row, ' ');
    }

    public void print() {
        for (char[] row : cells) {
            System.out.println("|" + row[0] + "|" + row[1] + "|" + row[2] + "|");
        }
    }
    public char[][] getCells() {
        return cells;
    }


}