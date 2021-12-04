package com.letscode;
import com.letscode.convertion.Convertion;
import com.letscode.convertion.Input;

public class Main {

    public static void main(String[] args) {

//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em
//        Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:

        Input input = new Input();
        float c = input.getInput();

        Convertion convertion = new Convertion();
        convertion.doConvertion(c);
    }
}
