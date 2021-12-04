package com.letscode.Exe1;

import java.io.PrintStream;
import java.util.Scanner;

public class Exe1 {

    public void inputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Questão 1/ Informe 2 números inteiros para os calculos:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        allResult(num1, num2);
    }

    private int sumResult(int num1, int num2) {
        return num1 + num2;
    }

    private int minusResult(int num1, int num2) {
        return num1 - num2;
    }

    private int multiplyResult(int num1, int num2) {
        return num1 * num2;
    }

    private int divisionResult(int num1, int num2) {
        return num1 / num2;
    }

    public PrintStream allResult(int num1, int num2) {
        int sum = sumResult(num1, num2);
        int minus = minusResult(num1, num2);
        int multiply = multiplyResult(num1, num2);
        double division = (double)divisionResult(num1, num2);

        return System.out.printf("Os resultados são:%n" +
                "Soma: %d%n" +
                "Subtração: %d%n" +
                "Multiplicação: %d%n" +
                "Divisão: %.1f%n" +
                "", sum, minus, multiply, division );
    }
}
