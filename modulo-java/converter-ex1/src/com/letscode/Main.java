package com.letscode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em
//        Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius para conversão:");
        int c = scan.nextInt();

        final float F = (c * 1.8f) + 32;
        final float K = c + 273.15f;
        final float Re = c * 0.8f;
        final float Ra = (c * 1.8f) + 459.67f;

        System.out.println("As temperaturas convertidas são:");
        System.out.printf("Fahrenheit (F): %.2f%n", F);
        System.out.printf("Kelvin (K): %.2f%n", K);
        System.out.printf("Réaumur (Re): %.2f%n", Re);
        System.out.printf("Rankine (Ra): %.2f", Ra);
    }
}
