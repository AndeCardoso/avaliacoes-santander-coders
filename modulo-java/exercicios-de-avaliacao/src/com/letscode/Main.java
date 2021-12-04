package com.letscode;

import com.letscode.Exe1.Exe1;
import com.letscode.Exe2.Exe2;
import com.letscode.Exe3.Exe3;
import com.letscode.Exe4.Exe4;
import com.letscode.Exe5.Exe5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha qual exercício deseja testar informando o número da questão:");
        int exe = scan.nextInt();

        switch(exe){
            case 1:
                Exe1 exe1 = new Exe1();
                exe1.inputValue();
                break;
            case 2:
                Exe2 exe2 = new Exe2();
                exe2.inputValue();
                break;
            case 3:
                Exe3 exe3 = new Exe3();
                exe3.inputValue();
                break;
            case 4:
                Exe4 exe4 = new Exe4();
                exe4.inputValue();
                break;
            case 5:
                Exe5 exe5 = new Exe5();
                exe5.inputValue();
                break;
            default:
                System.out.println("Questão não existe! Informe um número de 1 à 5.");
        }











    }
}
