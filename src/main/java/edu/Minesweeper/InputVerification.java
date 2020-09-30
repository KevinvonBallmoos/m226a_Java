package edu.Minesweeper;


public class InputVerification {
    /**
     * checks the cells
     * cover = +
     * open = number of bomb nearby 0 - ...
     * bomb exploded = *
     * marked = B
     */

    //switch case T or M
    public void userInputEquals(String userCode) {

        char[] userGuess = new char[userCode.length()];
        for (int i = 0; i < userCode.length(); i++) {
            userGuess[i] = userCode.charAt(i);
        }
        char col = userGuess[1];
        int row = Integer.valueOf(userGuess[2]);

        switch (userGuess[0]) {
            case 'T' -> userInputEqualsT(col, row);
            case 'M' -> userInputEqualsM(col, row);
        }

    }

    public void userInputEqualsT(int col, int row) {



        System.out.println("Hallo Test");
        loose();
        win(false);
        win(true);
    }

    public void userInputEqualsM(int col, int row) {


    }

    public boolean win(boolean win) {

        if (!win) {
            return false;
        }
        else{
            System.out.println("You won, you conquered the field without getting hit by a mine\n" +
                    "Congratulations");
            return true;
        }
    }

    public boolean loose() {
        System.out.println("You hit a mine, you Lost!!\n" +
                "Game Over!!");
        return true;
    }
}
