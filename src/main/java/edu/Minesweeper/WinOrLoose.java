package edu.Minesweeper;

public class WinOrLoose {

    private boolean stillInGame = true;
    private boolean win = false;

    public void setStillInGame(boolean stillInGame) {
        this.stillInGame = stillInGame;
    }

    public boolean isStillInGame() {
        return stillInGame;
    }
}
