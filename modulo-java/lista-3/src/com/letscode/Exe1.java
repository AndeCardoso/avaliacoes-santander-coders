package com.letscode;

import java.util.Scanner;

public class Exe1 {
    Scanner scan = new Scanner(System.in);

    private String fruits[] = new String[5];

    public void read() {
        System.out.println("--Insert 5 fruits to put in cart--");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Insert the name of fruit number %d:", i+1);
            String fruitName = scan.next();
            fruits[i] = fruitName;
        }
        print();
    }

    private void print() {
        System.out.println("Cart list:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
