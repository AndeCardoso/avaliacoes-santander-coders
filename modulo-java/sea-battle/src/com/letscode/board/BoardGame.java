package com.letscode.board;

import java.util.Scanner;

public class BoardGame {

    private final int SIZE = 10;
    public String board[][] = new String[SIZE][SIZE];

    public int readLine() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Insert a line ");
            int line = scan.nextInt();
            if(line >= 0 && line <= 9) {
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
            if(column >= 0 && column <= 9) {
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
