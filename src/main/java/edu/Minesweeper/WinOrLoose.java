package edu.Minesweeper;

public class WinOrLoose {

    private boolean stillInGame = true;
    private boolean win = false;

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isWin() {
        return win;
    }

    public void setStillInGame(boolean stillInGame) {
        this.stillInGame = stillInGame;
    }

    public boolean isStillInGame() {
        return stillInGame;
    }

    public void win() {
        setWin(true);
    }

    public void loose() {
        setStillInGame(false);
    }
}
