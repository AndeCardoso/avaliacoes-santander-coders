package com.letscode.cpu;

import com.letscode.board.BoardGame;

import java.util.Objects;

public class Cpu extends BoardGame {

    BoardGame boardGame = new BoardGame();
    String[][] board = boardGame.startBoard();

    public void printBoard() {
        System.out.println("   ----PLAYER BOARD----");
        System.out.println("     0   1   2   3   4 ");
        System.out.println("   -------------------");
        for(int l = 0 ; l < BoardGame.SIZE ; l++) {
            System.out.print(l + " ");
            for(int c = 0 ; c < BoardGame.SIZE ; c++) {
                System.out.print("| " + this.board[l][c] + " ");
            }
            System.out.println("|");
            System.out.println("   -------------------");
        }
    }

    public String tryShot() {
        int submarines = BoardGame.SIZE;

        if(submarines != 0){
            int lin = (int) (Math.random()*(SIZE));
            int col = (int) (Math.random()*(SIZE));

            String choice = board[lin][col];

            if(choice.equals("S")) {
                board[lin][col] = "*";
                submarines--;
                printBoard();

                if(submarines != 0) {
                    return "HIT";
                } else {
                    return "LOST";
                }

            } else {
                if(!Objects.equals(board[lin][col], "*")){
                    board[lin][col] = "-";
                }
                printBoard();
                return "MISS";
            }
        }
        return "LOST";
    }
}
