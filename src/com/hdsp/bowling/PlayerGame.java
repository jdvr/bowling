
package com.hdsp.bowling;

import java.util.ArrayList;
import java.util.List;

public class PlayerGame {

    private final Match match;
    private final String playerName;

    public PlayerGame(Match match, String playerName) {
        this.match = match;
        this.playerName = playerName;
    }

    public PlayerFrame[] getFrames() {
        return buildFrames(match.getRolls(playerName)).toArray(new PlayerFrame[0]);
    }

    private List<PlayerFrame> buildFrames(Roll[] rolls) {
        List<PlayerFrame> frames = new ArrayList<>();
        for (int i = 0; i < rolls.length; i += 2)
            frames.add(new PlayerFrame(rolls, i));
        return frames;
    }

}
