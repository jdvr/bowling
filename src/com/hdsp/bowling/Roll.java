package com.hdsp.bowling;

public class Roll {
    private final int pins;
    private Roll nextRoll;
    private final Player player;

    public Roll(int pins, Player player) {
        this.pins = pins;
        this.player = player;
    }

    public int getPins() {
        return pins;
    }

    public Roll getNextRoll() {
        return nextRoll;
    }

    public void setNextRoll(Roll nextRoll) {
        this.nextRoll = nextRoll;
    }

    public Player getPlayer() {
        return player;
    }
}
