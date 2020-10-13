package edu.Minesweeper;

/**
 * as long the user is not winning or loosing the game continues
 */
public class GameIsStillOn {

    private boolean stillInGame = true;

    public void setStillInGame(boolean stillInGame) {
        this.stillInGame = stillInGame;
    }

    public boolean isStillInGame() {
        return stillInGame;
    }
}
