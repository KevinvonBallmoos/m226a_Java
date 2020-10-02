package edu.Minesweeper;

import java.util.Arrays;

public class InputVerification {

    PlayGround playGround = new PlayGround();
    private int count = 0;
    private int countOfMines = 0;

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

        //loose-condition
        if (output[row + 1][col + 1].equals(playGround.getMines())) {
            output[row + 1][col + 1] = "X";
            System.out.println("");
            System.out.println(Arrays.deepToString(output)
                    .replace("],", " \n")
                    .replace("[", " ")
                    .replace(",", " ")
                    .replace("[[", " ")
                    .replace("]]", " \n"));
            loose(true);
        }

        //gameplay
        for (int height = row; height < row + 3; height++) {
            for (int width = col; width < col + 3; width++) {
                if (width < 1 || height < 1) {
                    output[height][width] = output[height][width];
                } else if (width > 9 || height > 9) {
                    output[height][width] = output[height][width];

                } else if (output[height][width].contains(playGround.getMines())) {
                    countOfMines++;
                    while (countOfMines == 0)
                    {
                        for (height = row; height < row + 3; height++) {
                            for (width = col; width < col + 3; width++) {
                                if (width < 1 || height < 1) {
                                    output[height][width] = output[height][width];
                                } else if (width > 9 || height > 9) {
                                    output[height][width] = output[height][width];
                                } else if (output[height][width].contains(playGround.getMines())) {
                                    countOfMines++;
                                }
                            }
                        }
                    }
                    output[row + 1][col + 1] = Integer.toString(countOfMines);
                }

                //for every 0 it finds, do while and 2 for loops
            }
        }
        System.out.println(Arrays.deepToString(output)
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n"));

    }

    public void userInputEqualsM(int col, int row, String[][] output) {

        if (output[row + 1][col + 1].equals("+") || output[row + 1][col + 1].equals("*")) {
            output[row + 1][col + 1] = "M";
        } else if ((output[row + 1][col + 1].equals("M"))) {
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

        //win-condition
        for (String[] strings : output) {
            for (int j = 0; j < output.length; j++) {
                if (strings[j].contains(playGround.getMines())) {
                    count++;
                    if (count == 0) {
                        win(true);
                    }
                }
            }
        }
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
        if (loose) {
            System.out.println("You hit a mine, you Loose!!\n" +
                    "Game Over!!");
        }
        return true;
    }
}

