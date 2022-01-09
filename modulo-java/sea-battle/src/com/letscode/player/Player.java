package com.letscode.player;

import com.letscode.board.BoardGame;
import com.letscode.submarine.Submarine;
import com.letscode.cpu.Cpu;

public class Player extends BoardGame {

    private final int SIZE = 10;
    BoardGame boardGame = new BoardGame();
    Submarine submarine = new Submarine();

    public void startBoard() {
        for(int l = 0; l < SIZE; l++) {
            for(int c = 0; c < SIZE; c++) {
                boardGame.board[l][c]="~";
            }
        }
        submarine.startPositions();
    }

    public void printBoard() {
        System.out.println("    0   1   2   3   4   5   6   7   8   9   ");
        System.out.println("   ----------------------------------------");
        for(int l = 0 ; l < SIZE ; l++) {
            System.out.print(l + " ");
            for(int c = 0 ; c < SIZE ; c++) {
                System.out.print("| " + this.board[l][c] + " ");
            }
            System.out.println("|");
            System.out.println("   ----------------------------------------");
        }
    }

    public void tryShot(Cpu cpu){
        int submarines = 10;

        while(submarines != 0){
            int lin = readLine();
            int col = readColumn();

            String choice = submarine.position[lin][col];

            if(choice != null){
                System.out.println("You got a enemy submarine! >:)");
                board[lin][col] = "*";
                submarines--;

            } else {
                System.out.println("You miss the shot :(!");
                board[lin][col] = "-";
            }

            String cpuTurn = cpu.tryShot();

            if(cpuTurn.equals("HIT")) {
                System.out.println("You has a been shooting in submarine! :,(");
            } else if(cpuTurn.equals("LOST")) {
                System.out.println("The enemy has destroyed all yours submarines!");
                System.out.println("Your board:");
                cpu.printBoard();
                System.out.println("Enemy board:");
                printBoard();
                System.out.println("YOU LOSE!");
                submarines = 0;
            } else {
                System.out.println("The enemy miss a shot!");
            }
        }
        System.out.println("You WIN!");
    }

}
