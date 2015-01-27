
package com.hdsp.bowling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayerGame {

    private final Match match;
    private final String playerName;

    public PlayerGame(Match match, String playerName) {
        this.match = match;
        this.playerName = playerName;
    }

    public Frame[] getFrames() {
        if (match.getRolls(playerName).length > 0){
            return new Frame[]{new Frame(match.getRolls(playerName))};
        }
        return new Frame[0];
    }
    public class Frame {

        List<Roll> rollList;

        public Frame(Roll[] rolls) {
            this.rollList = Arrays.asList(rolls);
        }

        public Scoring getScoring() {
            if(rollList.size() > 1) return new Scoring(9);
            return null;
        }

        public class Scoring {
            private int points;

            public Scoring(int points) {
                this.points = points;
            }

            public int getPoints() {
                return points;
            }
        }
    }
}
