package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choice what exercise you want test(may contain comedy in the code):");
        int exe = scan.nextInt();

        switch(exe){
            case 1:
                Exe1 exe1 = new Exe1();
                exe1.read();
                break;
            case 2:
                Exe2 exe2 = new Exe2();
                exe2.read();
                break;
            case 3:
                Exe3 exe3 = new Exe3();
                exe3.read();
                break;
            case 4:
                Exe4 exe4 = new Exe4();
                exe4.read();
                break;
            case 5:
                Exe5 exe5 = new Exe5();
                exe5.read();
                break;
            case 6:
                Exe6 exe6 = new Exe6();
                exe6.read();
                break;
            case 7:
                Exe7 exe7 = new Exe7();
                exe7.read();
                break;
            case 8:
                Exe8 exe8 = new Exe8();
                exe8.read();
                break;
            default:
                System.out.println("Wrong question! Insert a number between 1 and 8.");
        }
    }
}
