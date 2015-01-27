package com.hdsp.bowling;

public class Roll {
    private final int pins;
    private final Player player;

    public Roll(int pins, Player player) {
        this.pins = pins;
        this.player = player;
    }

    public int getPins() {
        return pins;
    }

    public Player getPlayer() {
        return player;
    }
}
