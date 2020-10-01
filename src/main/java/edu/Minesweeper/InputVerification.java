package edu.Minesweeper;


import edu.MastermindObjektorientiert.RandomCode;

import java.util.Arrays;

public class InputVerification {

    PlayGround playGround = new PlayGround();
    /**
     * checks the cells
     * cover = +
     * open = number of bomb nearby 0 - ...
     * bomb exploded = *
     * marked = B
     */

    //switch case T or M
    public void userInputEquals(String userCode, String[][] output) {

        char[] userGuess = new char[3];
        for (int i = 0; i < userGuess.length; i++) {
            userGuess[i] = userCode.charAt(i);
        }

        int col = Integer.parseInt(String.valueOf(userGuess[1]));
        int row = Integer.parseInt(String.valueOf(userGuess[2]));


        switch (userGuess[0]) {
            case 'T' -> userInputEqualsT(col, row, output);
            case 'M' -> userInputEqualsM(col, row, output);
        }

    }

    public void userInputEqualsT(int col, int row, String[][] output) {

        if (output[row + 1][col + 1].equals(playGround.getMines())){
            output[row + 1][col + 1] = playGround.getMines();
            System.out.println(Arrays.deepToString(output)
                    .replace("],", " \n")
                    .replace("[", " ")
                    .replace(",", " ")
                    .replace("[[", " ")
                    .replace("]]", " \n"));
            loose(true);
        }


        win(false);
        win(true);
    }

    public void userInputEqualsM(int col, int row, String[][] output) {

        if (output[row + 1][col + 1].equals("+") || output[row + 1][col + 1].equals("*")) {
            output[row + 1][col + 1] = "M";
        }
        else if ((output[row + 1][col + 1].equals("M"))){
            output[row + 1][col + 1] = "+";
        }

        System.out.println(Arrays.deepToString(output)
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n" +
                        "\n"));

        System.out.println("Type in your Commands: Target or Mark (no space):");

    }

    public boolean win(boolean win) {

        if (!win) {
            return false;
        } else {
            System.out.println("You won, you conquered the field without getting hit by a mine\n" +
                    "Congratulations");
            return true;
        }

    }

    public boolean loose(boolean loose) {
        if (!loose) {
            return false;
        } else {
            System.out.println("You hit a mine, you Loose!!\n" +
                    "Game Over!!");
            return true;
        }
    }
}
