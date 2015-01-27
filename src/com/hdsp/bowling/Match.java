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
        rolls.add(roll);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Roll> getRolls() {
        return rolls;
    }
}
