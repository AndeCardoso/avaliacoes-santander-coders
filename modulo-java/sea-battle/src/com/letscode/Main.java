package com.letscode;

import com.letscode.cpu.Cpu;
import com.letscode.player.Player;

public class Main {

    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Player player = new Player();

        player.startBoard();
        cpu.startBoard();

        player.tryShot(cpu);

    }
}
