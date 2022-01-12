package com.letscode.submarine;

import com.letscode.board.BoardGame;

import java.util.Objects;

public class Submarine {

    public String position[][] = new String[BoardGame.SIZE][BoardGame.SIZE];

    public void startPositions() {
        for(int i = 0; i < BoardGame.SIZE; i++) {
            int x = (int) (Math.random()*(BoardGame.SIZE));
            int y = (int) (Math.random()*(BoardGame.SIZE));
            if(Objects.equals(position[x][y], "S")){
                i--;
            } else {
                position[x][y] = "S";
            }
        }
    }
}
