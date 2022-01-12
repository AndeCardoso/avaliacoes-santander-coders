package com.letscode.board;

import com.letscode.submarine.Submarine;

import java.util.Objects;
import java.util.Scanner;

public class BoardGame {

    public static final int SIZE = 5;
    public String board[][] = new String[SIZE][SIZE];
    Submarine submarine = new Submarine();

    public String[][] startBoard() {
        submarine.startPositions();
        for(int l = 0; l < SIZE; l++) {
            for(int c = 0; c < SIZE; c++) {
                if(Objects.equals(submarine.position[l][c], "S")){
                    board[l][c]="S";
                }else {
                    board[l][c]=" ";
                }
            }
        }
        return board;
    }

    public int readLine() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Insert a line ");
            int line = scan.nextInt();
            if(line >= 0 && line <= SIZE-1) {
                return(line);
            } else {
                System.out.println("Invalid line!");
                return(readLine());
            }
        } catch(Exception e){
            System.out.println("Invalid line!");
            return(readLine());
        }
    }

    public int readColumn(){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Insert a column ");
            int column = scan.nextInt();
            if(column >= 0 && column <= SIZE-1) {
                return(column);
            } else {
                System.out.println("Invalid column!");
                return(readColumn());
            }
        } catch(Exception e) {
            System.out.println("Invalid column!");
            return(readColumn());
        }
    }
}
