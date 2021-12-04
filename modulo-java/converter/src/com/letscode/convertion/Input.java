package com.letscode.convertion;

import java.util.Scanner;

public class Input {

    public float getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius para conversão:");
        int c = scan.nextInt();
        return c;
    }
}
