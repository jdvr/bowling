package com.hdsp.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerGameTest {

    @Test
    public void withNoRolls() throws Exception {
        Match match = new Match();
        match.addPlayer(new Player("one"));
        match.addPlayer(new Player("two"));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(0, playerGame.getFrames().length);
    }

    @Test
    public void withOneRoll() throws Exception {
        Match match = new Match();
        match.addPlayer(new Player("one"));
        match.addPlayer(new Player("two"));
        match.addRoll(new Roll(4,match.getPlayer("one")));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(1,playerGame.getFrames().length);
        assertEquals(null,playerGame.getFrames()[0].getScoring());
    }

    @Test
    public void withTwoRolls() throws Exception {
        Match match = new Match();
        match.addPlayer(new Player("one"));
        match.addPlayer(new Player("two"));
        match.addRoll(new Roll(4, match.getPlayer("one")));
        match.addRoll(new Roll(5, match.getPlayer("one")));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(1,playerGame.getFrames().length);
        assertEquals(9,playerGame.getFrames()[0].getScoring());
    }
}









