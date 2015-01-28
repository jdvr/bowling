package com.hdsp.bowling;

public class Roll {
    private final Player player;
    private final int pins;

    public Roll(Player player, int pins) {
        this.player = player;
        this.pins = pins;
    }

    public int getPins() {
        return pins;
    }

    public Player getPlayer() {
        return player;
    }
}
