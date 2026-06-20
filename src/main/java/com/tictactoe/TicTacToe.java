package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public TicTacToe() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.print();
            System.out.println("Current Player: " + currentPlayer.getMarker());
            System.out.print("Row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Column (0-2): ");
            int col = scanner.nextInt();

            if (!board.isCellEmpty(row, col)) {
                System.out.println("Feld besetzt!");
                continue;
            }
            board.place(row, col, currentPlayer.getMarker());

            if (hasWinner()) {
                board.print();
                System.out.println("Gewinner: " + currentPlayer.getMarker());
                break;
            }
            if (board.isFull()) {
                board.print();
                System.out.println("Unentschieden!");
                break;
            }
            switchCurrentPlayer();
        }
    }

    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean hasWinner() {
        char m = currentPlayer.getMarker();
        for (int i = 0; i < 3; i++) {
            if (board.isCellEmpty(i, 0)) continue;
            if (board.getCells()[i][0] == m && board.getCells()[i][1] == m && board.getCells()[i][2] == m) return true;
            if (board.getCells()[0][i] == m && board.getCells()[1][i] == m && board.getCells()[2][i] == m) return true;
        }
        if (board.getCells()[0][0] == m && board.getCells()[1][1] == m && board.getCells()[2][2] == m) return true;
        if (board.getCells()[0][2] == m && board.getCells()[1][1] == m && board.getCells()[2][0] == m) return true;
        return false;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Board getBoard() {
        return board;
    }
}