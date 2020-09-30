package edu.Minesweeper;


import java.util.Arrays;

public class InputVerification {
    /**
     * checks the cells
     * cover = +
     * open = number of bomb nearby 0 - ...
     * bomb exploded = *
     * marked = B
     */

    //switch case T or M
    public void userInputEquals(String userCode, String[][] output) {

        /*System.out.println(Arrays.deepToString(output).replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n"));*/
        char[] userGuess = new char[userCode.length()];
        for (int i = 0; i < userCode.length(); i++) {
            userGuess[i] = userCode.charAt(i);
        }
        char[] col = new char[1];
        col[0] = userGuess[1];
        char[] row = new char[1];
        row[0] = userGuess[2];

        switch (userGuess[0]) {
            case 'T' -> userInputEqualsT(col, row, output);
            case 'M' -> userInputEqualsM(col, row, output);
        }

    }

    public void userInputEqualsT(char[] col, char[]row, String[][] output) {

        loose();
        win(false);
        win(true);
    }

    public void userInputEqualsM(char[] col, char[]row, String[][] output) {


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
