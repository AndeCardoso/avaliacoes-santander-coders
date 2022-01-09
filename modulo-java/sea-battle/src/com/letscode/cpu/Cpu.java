package com.letscode.cpu;

import com.letscode.board.BoardGame;
import com.letscode.submarine.Submarine;

public class Cpu extends BoardGame {

    private final int SIZE = 10;
    BoardGame boardGame = new BoardGame();
    Submarine submarine = new Submarine();

    public void startBoard() {
        submarine.startPositions();
        for(int l = 0; l < SIZE; l++) {
            for(int c = 0; c < SIZE; c++) {
                if(submarine.position[l][c] == "S"){
                    boardGame.board[l][c]="S";
                }else {
                    boardGame.board[l][c]=" ";
                }
            }
        }

        printBoard();
    }

    public void printBoard() {
        System.out.println("   --------------PLAYER BOARD--------------");
        System.out.println("    0   1   2   3   4   5   6   7   8   9   ");
        System.out.println("   ----------------------------------------");
        for(int l = 0 ; l < SIZE ; l++) {
            System.out.print(l + " ");
            for(int c = 0 ; c < SIZE ; c++) {
                System.out.print("| " + boardGame.board[l][c] + " ");
            }
            System.out.println("|");
            System.out.println("   ----------------------------------------");
        }
    }

    public String tryShot() {
        int submarines = 10;

        if(submarines != 0){
            int lin = (int) (Math.random()*(9));
            int col = (int) (Math.random()*(9));

            String choice = submarine.position[lin][col];

            if(choice != null) {
                boardGame.board[lin][col] = "*";
                submarines--;
                printBoard();
                if(submarines != 0) {
                    return "HIT";
                } else {
                    return "LOST";
                }

            } else {
                boardGame.board[lin][col] = "-";
                printBoard();
                return "MISS";
            }
        }
        return "LOST";
    }
}
