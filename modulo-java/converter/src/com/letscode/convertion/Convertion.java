package com.letscode.convertion;

import java.io.PrintStream;

public class Convertion {
    public PrintStream doConvertion(float c){
        final float F = (c * 1.8f) + 32;
        final float K = c + 273.15f;
        final float Re = c * 0.8f;
        final float Ra = (c * 1.8f) + 459.67f;

        return System.out.printf("As temperaturas convertidas são: %nFahrenheit (F): %.2f%n" +
                "Kelvin (K): %.2f%nRéaumur (Re): %.2f%nRankine (Ra): %.2f", F, K, Re, Ra);
    }
}
