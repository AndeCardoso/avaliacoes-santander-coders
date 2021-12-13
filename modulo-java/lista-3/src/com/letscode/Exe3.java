package com.letscode;

import java.util.Scanner;

public class Exe3 {
    Scanner scan = new Scanner(System.in);

    private int numbers[] = new int[5];

    public void read() {
        System.out.println("Insert 5 number (for any reason):");
        for(int i = 0; i < numbers.length; i++){
            int _number = scan.nextInt();
            numbers[i] = _number;
        }
        System.out.println("Odd numbers:");
        odd();
        System.out.println("Pair numbers:");
        pair();
    }

    private void odd() {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    private void pair() {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
