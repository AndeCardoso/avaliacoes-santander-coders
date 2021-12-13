package com.letscode;

import java.util.Scanner;

public class Exe4 {
    Scanner scan = new Scanner(System.in);

    private int numbers[] = new int[5];
    private int bigest = 0;
    private int shortest = 1000;

    public void read() {
        System.out.println("Insert 5 number (for any reason again):");
        for(int i = 0; i < numbers.length; i++){
            int _number = scan.nextInt();
            numbers[i] = _number;
        }
        bigNumber();
        shortNumber();
        average();
    }

    private void bigNumber() {
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > bigest) {
                bigest = numbers[i];
            }
        }
        System.out.println("The higher number is " + bigest);
    }

    private void shortNumber() {
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < shortest) {
                shortest = numbers[i];
            }
        }
        System.out.println("The smaller number is " + shortest);
    }

    private void average () {
        int _average = (bigest + shortest) / 2;
        System.out.println("The average between them is " + _average);
    }
}
