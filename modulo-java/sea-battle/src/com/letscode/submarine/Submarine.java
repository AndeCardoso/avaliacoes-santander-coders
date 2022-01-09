package com.letscode.submarine;

public class Submarine {

    private final int SIZE = 10;
    public String position[][] = new String[SIZE][SIZE];

    public void startPositions() {
        for(int i = 0; i < SIZE; i++) {
            int x = (int) (Math.random()*(9));
            int y = (int) (Math.random()*(9));
            position[x][y] = "S";
        }
    }
}
