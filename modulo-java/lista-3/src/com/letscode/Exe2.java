package com.letscode;

import java.util.Scanner;

public class Exe2 {
    Scanner scan = new Scanner(System.in);

    private String word;
    private String drow;

    public void read() {
        System.out.println("Insert a word to reverser it:");
        word = scan.next();
        drow = new StringBuffer(word).reverse().toString();
        System.out.println(drow);
    }
}
