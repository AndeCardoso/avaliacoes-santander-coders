package com.letscode.Exe2;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Exe2 {
    int results[];

    public void inputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Questão 2/ Informe um número inteiro para o cálculo da tabuada:");
        int num = scan.nextInt();
        System.out.printf("A tabuada do %d é:%n", num);
        multiplicationTable(num);
    }

    public void multiplicationTable(int num) {
        results = new int[10];
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num * i);
        }
    }
}
