package com.hdsp.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerGameTest {

    @Test
    public void withNoRolls() throws Exception {
        Match match = createMatch();
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(0, playerGame.getFrames().length);
    }

    @Test
    public void withOneRoll() throws Exception {
        Match match = createMatch();
        match.addRoll(new Roll(match.getPlayer("one"), 4));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(1,playerGame.getFrames().length);
        assertNull(playerGame.getFrames()[0].getScoring());
    }

    @Test
    public void withTwoRolls() throws Exception {
        Match match = createMatch();
        match.addRoll(new Roll(match.getPlayer("one"), 4));
        match.addRoll(new Roll(match.getPlayer("one"), 5));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(1,playerGame.getFrames().length);
        assertEquals(9,playerGame.getFrames()[0].getScoring().getPoints());
    }
    @Test
    public void withOtherTwoRolls() {
        Match match = createMatch();
        match.addRoll(new Roll(match.getPlayer("one"), 1));
        match.addRoll(new Roll(match.getPlayer("one"), 4));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(1,playerGame.getFrames().length);
        assertEquals(5, playerGame.getFrames()[0].getScoring().getPoints());
    }

    @Test
    public void withThreeRolls() {
        Match match = createMatch().addRolls(1, 4, 3).toPlayer("one");
        match.addRoll(new Roll(match.getPlayer("one"), 1));
        match.addRoll(new Roll(match.getPlayer("one"), 4));
        match.addRoll(new Roll(match.getPlayer("one"), 3));
        PlayerGame playerGame = new PlayerGame(match, "one");
        assertEquals(2,playerGame.getFrames().length);
        assertEquals(5,playerGame.getFrames()[0].getScoring().getPoints());
        assertNull(playerGame.getFrames()[1].getScoring());
    }

    private void createPlayerGame(String playerName, int... pins) {

    }

    private Match createMatch() {
        Match match = new Match();
        match.addPlayer(new Player("one"));
        match.addPlayer(new Player("two"));
        return match;
    }
}









