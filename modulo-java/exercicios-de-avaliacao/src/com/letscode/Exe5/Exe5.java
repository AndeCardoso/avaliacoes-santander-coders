package com.letscode.Exe5;

import java.util.Scanner;

public class Exe5 {

    public void inputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Questão 5/ Informe um tamanho em polegadas para converter em centímetros:");
        int inches = scan.nextInt();

        System.out.printf("%d'' equivalem à %.2fCm", convertInchesToCentimeters(inches));
    }

    private float convertInchesToCentimeters(int inches){
        return inches * 2.54f;
    }
}
