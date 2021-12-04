package com.letscode.Exe3;

import java.util.Scanner;

public class Exe3 {

    public void inputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Questão 3/ Informe a temperatura em celsius para converter em fahrenheit:");
        float celsiusTemperature = scan.nextFloat();
        System.out.printf("%.2fCº equivalem à:%n", celsiusTemperature);
        System.out.printf("%.2fºF", convertionToFahrenheit(celsiusTemperature));
    }

    private float convertionToFahrenheit(float celsiusTemperature){
        return (celsiusTemperature * 1.8f) + 32;
    }
}
