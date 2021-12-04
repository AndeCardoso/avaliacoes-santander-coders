package com.letscode.Exe4;

import java.util.Scanner;

public class Exe4 {


    public void inputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Questão 4/ Informe a cotação do Dólar hoje:");
        float todayDollarPrice = scan.nextFloat();
        System.out.println("Informe o valor em Reais para conversão:");
        float reaisToConvert = scan.nextFloat();

        System.out.printf("R$%.2f equivalem à US$%.2f",reaisToConvert, convertionToDollar(todayDollarPrice, reaisToConvert));
    }

    private float convertionToDollar(float dollarPrice, float reaisToConvert){
        return reaisToConvert / dollarPrice;
    }
}
