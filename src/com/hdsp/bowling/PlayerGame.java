package com.hdsp.bowling;

public class PlayerGame {

    private final Match match;
    private final String playerName;

    public PlayerGame(Match match, String playerName) {
        this.match = match;
        this.playerName = playerName;
    }

    public Frame[] getFrames() {
        if (match.getRolls(playerName).length > 0){
            return new Frame[]{new Frame()};
        }
        return new Frame[0];
    }
    public class Frame {

        public Scoring getScoring() {
            return null;
        }

        public class Scoring {
        }
    }
}
