package com.hdsp.bowling;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private final List<Player> players;
    private final List<Roll> rolls;

    public Match() {
        this.players = new ArrayList<>();
        this.rolls = new ArrayList<>();
    }

    public void addRoll(Roll roll) {
        rolls.add(roll);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player getPlayer(String name) {
        for (Player player : players)
            if (player.getId().equals(name)) return player;
        return null;
    }

    public Roll[] getRolls(String playerName){
        Player player = getPlayer(playerName);
        List<Roll> playerRolls = new ArrayList<>();
        for (Roll roll : rolls)
            if (roll.getPlayer() == player)
                playerRolls.add(roll);
        return rolls.toArray(new Roll[rolls.size()]);
    }
}





