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

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player getPlayer(String name) {
        return players.parallelStream()
                .filter(player -> player.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Roll[] getRolls(String playerName){
        return rolls.parallelStream().filter((roll) -> roll.getPlayer().getName().equals(playerName)).toArray(Roll[]::new);
    }

    public AddRollTask addRolls(final List<Integer> pinsOfRolls) {
        return (name) ->
            pinsOfRolls.forEach((pinsOfRoll) ->  rolls.add(new Roll(getPlayer(name), pinsOfRoll)));

    }

    public interface AddRollTask {
        public void toPlayer(String name);
    }
}











