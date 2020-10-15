package edu.Minesweeper;

import java.util.Arrays;

/**
 * verficicates the input, if its an input with M or T
 * @author Kevin von Ballmoos
 */
public class InputVerification {

    PlayGround playGround = new PlayGround();
    GameIsStillOn gameIsStillOn = new GameIsStillOn();
    CellChange cellChange = new CellChange();
    final int numberOfMines = 10;


    /**
     * checks the input M or T
     *
     * @param userCode takes the input from the user
     *                 fills the userCode in an Char Array to read out the numbers and the Char M or T
     * @param output   takes the PlayGround Array String[][]
     * @return true if switch T or M is true, default is false
     */
    public boolean userInputEquals(String userCode, String[][] output) {

        char[] userGuess = new char[3];
        for (int i = 0; i < userGuess.length; i++) {
            userGuess[i] = userCode.charAt(i);
        }

        int row = Integer.parseInt(String.valueOf(userGuess[1]));
        int col = Integer.parseInt(String.valueOf(userGuess[2]));

        switch (userGuess[0]) {
            case 'T' -> {
                if (userInputEqualsT(col, row, output)) {
                    gameIsStillOn.setStillInGame(false);
                    return true;
                }
            }
            case 'M' -> {
                if (userInputEqualsM(col, row, output)) {
                    gameIsStillOn.setStillInGame(false);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * T checks if a mine is hit
     *
     * @param col    takes the column from userInputEquals
     * @param row    takes the row from userInputEquals
     * @param output takes the PlayGround as String[][]output
     * @return true if a mine is hit, so you loose
     */
    public boolean userInputEqualsT(int col, int row, String[][] output) {

        if (output[col + 1][row + 1].equals(playGround.getMines())) {
            output[col + 1][row + 1] = "X";
            System.out.println("..");
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
            cellChange.CellIsChange(col, row, output);
        }
        return false;
    }

    /**
     * M marks all mines
     *
     * @param col    takes the column from userInputEquals
     * @param row    takes the row from userInputEquals
     * @param output takes the PlayGround as String[][]output
     * @return true if all mines are found, so you win
     * if that is not the case, it opens a function in CellChange who loops trough the field
     */
    public boolean userInputEqualsM(int col, int row, String[][] output) {


        int count = 0;
/*        if (output[col + 1][row + 1].equals(playGround.getMines())) {
            playGround.setMines("!");
            output[col + 1][row + 1] = playGround.getMines();
        } else if ((output[col + 1][row + 1].equals("!"))) {
            output[col + 1][row + 1] = "+";
        }*/

        System.out.println(Arrays.deepToString(output)
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n"));


        for (String[] strings : output) {
            for (int j = 1; j < output.length - 1; j++) {
                if (strings[j].equals("!")) {
                    count++;

                    if (count == numberOfMines) {
                        System.out.println("Gratulation, you found all mines\n" +
                                "Game complete");
                        return true;
                    }
                }
            }
        }
        System.out.println(" You found " + count + " mine.");
        System.out.println("Type in your Commands: Target or Mark (no space):");
        return false;
    }
}

