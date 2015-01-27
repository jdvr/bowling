package com.hdsp.bowling;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private final List<Player> players;
    private final List<Roll> rolls;

    public Match(List<Player> players) {
        this.players = players;
        this.rolls = new ArrayList<Roll>();
    }

    public void addRoll(Roll roll){
        this.rolls.get(rolls.size() - 1).setNextRoll(roll);
        rolls.add(roll);
    }
}
