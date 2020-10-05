package edu.Minesweeper;

import java.util.Arrays;

public class InputVerification {

    PlayGround playGround = new PlayGround();
    WinOrLoose winOrLoose = new WinOrLoose();
    private int countOfMines = 0;
    final int numberOfMines = 10;

    /**
     * checks the cells
     * cover = +
     * open = number of bomb nearby 0 - ...
     * bomb exploded = *
     * marked = B
     */

    //switch case T or M
    public boolean userInputEquals(String userCode, String[][] output) {

        char[] userGuess = new char[3];
        for (int i = 0; i < userGuess.length; i++) {
            userGuess[i] = userCode.charAt(i);
        }

        int col = Integer.parseInt(String.valueOf(userGuess[1]));
        int row = Integer.parseInt(String.valueOf(userGuess[2]));


        switch (userGuess[0]) {
            case 'T' -> {
                if (userInputEqualsT(col, row, output)) {
                    winOrLoose.setStillInGame(false);
                    return true;
                }
            }
            case 'M' -> {
                if (userInputEqualsM(col, row, output)) {
                    winOrLoose.setStillInGame(false);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean userInputEqualsT(int col, int row, String[][] output) {

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

            System.out.println("You hit a mine, you Loose!!\n" +
                    "Game Over!!");
            return true;

        } else {
            //gameplay
            for (int height = row; height < row + 3; height++) {
                for (int width = col; width < col + 3; width++) {
                    if (width < 1 || height < 1) {
                        output[height][width] = output[height][width];
                    } else if (width > 9 || height > 9) {
                        output[height][width] = output[height][width];

                    } else if (output[height][width].contains(playGround.getMines()) || output[height][width].contains("M")) {
                        countOfMines++;
                        output[row + 1][col + 1] = Integer.toString(countOfMines);
                        while (countOfMines == 0) {
                            for (int i = height - 1; i < height + 2; i++) {
                                for (int j = width - 1; j < width + 2; j++) {
                                    if (j < 1 || i < 1) {
                                        output[i][j] = output[i][j];
                                    } else if (j > 9 || i > 9) {
                                        output[i][j] = output[i][j];
                                    } else if (output[i][j].contains(playGround.getMines())) {
                                        countOfMines++;
                                    }
                                }
                            }
                        }

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

        return false;
    }

    public boolean userInputEqualsM(int col, int row, String[][] output) {

        int count = 0;
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
            for (int j = 1; j < output.length - 1; j++) {
                if (strings[j].equals("M")) {
                    count++;
                    if (count == numberOfMines) {
                        System.out.println("Gratulation, you found all mines\n" +
                                "Game complete");
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

