package com.letscode;

import java.util.Scanner;

public class Exe6 {
    Scanner scan = new Scanner(System.in);

    private String nickname;


    public void read() {
        System.out.println("Insert a name to generate a MSN Nickname:");
        nickname = scan.next();

        msnNicknameGenerate();
    }

    private void msnNicknameGenerate() {
        char[] newNickname = nickname.toCharArray();
        for(int i = 0; nickname.length() > i; i++ ){
            if(i % 2 == 0){
                newNickname[i] = Character.toUpperCase(nickname.charAt(i));
            }
        }
        nickname = String.valueOf(newNickname);
        System.out.println("Take your new MSN Nickname: " + nickname);
    }
}
