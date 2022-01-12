package com.letscode.player;

import com.letscode.board.BoardGame;
import com.letscode.cpu.Cpu;

import java.util.Objects;

public class Player extends BoardGame {

    BoardGame boardGame = new BoardGame();
    String[][] board = boardGame.startBoard();

    public void printBoard() {
        System.out.println("   ----ENEMY BOARD----");
        System.out.println("    0   1   2   3   4 ");
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

    public void tryShot(Cpu cpu){
        int submarines = BoardGame.SIZE;

        cpu.printBoard();
        while(submarines != 0){
            int lin = readLine();
            int col = readColumn();

            String choice = board[lin][col];

            if(choice.equals("S")){
                System.out.println("You got a enemy submarine! >:)");
                board[lin][col] = "*";
                submarines--;

            } else {
                System.out.println("You miss the shot :(!");

                if(!Objects.equals(board[lin][col], "*")){
                    board[lin][col] = "-";
                }
            }

            String cpuTurn = cpu.tryShot();

            if(cpuTurn.equals("HIT")) {
                System.out.println("You has a been shooting in submarine! :,(");
            } else if(cpuTurn.equals("LOST")) {
                System.out.println("The enemy has destroyed all yours submarines!");
                cpu.printBoard();
                printBoard();
                System.out.println("YOU LOSE!");
                submarines = 0;
            } else {
                System.out.println("The enemy miss a shot!");
            }
        }
        System.out.println("You has destroyed all enemy's submarines!");
        cpu.printBoard();
        printBoard();
        System.out.println("You WIN!");
    }

}
