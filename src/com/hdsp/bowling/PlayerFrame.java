package com.hdsp.bowling;

import java.util.Arrays;
import java.util.List;

public class PlayerFrame {

    private final List<Roll> rolls;
    private final int index;

    public PlayerFrame(Roll[] rolls, int index) {
        this.rolls = Arrays.asList(rolls);
        this.index = index;
    }

    public Scoring getScoring() {
        if (!isComplete()) return null;
        return new Scoring(getPinsOfRoll(index) + getPinsOfRoll(index+1));
    }

    private boolean isComplete() {
        return index + 1 < rolls.size();
    }

    private int getPinsOfRoll(int index) {
        if (index >= rolls.size()) return 0;
        return rolls.get(index).getPins();
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
