package com.letscode;

import java.util.Scanner;

public class Exe5 {
    Scanner scan = new Scanner(System.in);

    private String guestList[] = new String[5];

    public void read() {
        System.out.println("--Insert 5 names to put in guest list--");
        for (int i = 0; i < guestList.length; i++) {
            System.out.printf("Insert the name of fruit number %d:", i+1);
            String guestName = scan.next();
            guestList[i] = guestName;
        }
        printLongestName();
    }

    private void printLongestName() {
        String longest = "";
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].length() > longest.length()) {
                longest = guestList[i];
            }
        }
        System.out.println("The longest name is " + longest);
    }
}
