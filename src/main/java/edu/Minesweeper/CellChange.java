package edu.Minesweeper;

import java.util.Arrays;

public class CellChange {

    PlayGround playGround = new PlayGround();

    /*  1 Up and 1 left
             // 1 Up
             CellIsChange(col, row - 1, output);
             // 1 Up and 1 right
             CellIsChange(col + 1, row - 1, output);
             // 1 right
             CellIsChange(col + 1, row, output);
             // 1 right and 1 down
             CellIsChange(col + 1, row + 1, output);
             // 1 down
             CellIsChange(col, row + 1, output);
             // 1 left and 1 down
             CellIsChange(col - 1, row + 1, output);
             // 1 left
             CellIsChange(col - 1, row, output);
     */

    /**
     * loops around the targeted position and counts the mines
     * if there are no mines, the function "isCellZero" gets loaded
     *
     * @param col    takes the column from userInputEquals
     * @param row    takes the row from userInputEquals
     * @param output takes the PlayGround as String[][]output
     */
    public void CellIsChange(int col, int row, String[][] output) {
        if (col < 1) {
            col = 1;
        }
        if (row < 1) {
            row = 1;
        }

        int countOfMines = 0;
        for (int height = col; height < col + 3; height++) {
            for (int width = row; width < row + 3; width++) {
                if (width > 8 || height > 8) {
                    output[height][width] = output[height][width];
                }
                if (countOfMines == 0) {
                    output[col + 1][row + 1] = "0";
                }
                if (output[height][width].equals(playGround.getMines()) || output[height][width].equals("M")) {
                    countOfMines++;
                    output[col + 1][row + 1] = Integer.toString(countOfMines);
                }
            }
        }
        if (countOfMines == 0) {

            ifCellIsZero(col, row, output);

        } else {
            printMessage(output);
        }
    }

    /**
     * loops around the targeted Cell one more time, just to loop around each element to count the mines around them
     *
     * @param col    takes the column from userInputEquals
     * @param row    takes the row from userInputEquals
     * @param output takes the PlayGround as String[][]output
     */
    public void ifCellIsZero(int col, int row, String[][] output) {
        if (col < 1) {
            col = 1;
        }
        if (row < 1) {
            row = 1;
        }
        for (int height = col; height < col + 3; height++) {
            for (int width = row; width < row + 3; width++) {
                if (width > 8 || height > 8) {
                    output[height][width] = output[height][width];
                }
                loopIfCellIsZero(col - 1, row - 1, output);
            }
        }


        printMessage(output);
    }

    /**
     * loops around the element in which the method "ifCellIsZero" is in and count the mines
     *
     * @param col    takes the column from userInputEquals
     * @param row    takes the row from userInputEquals
     * @param output takes the PlayGround as String[][]output
     */
    public void loopIfCellIsZero(int col, int row, String[][] output) {
        if (col < 1) {
            col = 1;
        }
        if (row < 1) {
            row = 1;
        }

        int countOfMines = 0;
        for (int height = col; height < col + 3; height++) {
            for (int width = row; width < row + 3; width++) {
                if (width > 8 || height > 8) {
                    output[height][width] = output[height][width];
                }
                if (countOfMines == 0) {
                    output[height + 1][width + 1] = "0";
                }
                if (output[height][width].equals(playGround.getMines()) || output[height][width].equals("M")) {
                    countOfMines++;
                    output[col + 1][row + 1] = Integer.toString(countOfMines);
                }
            }
        }

    }

    /**
     * prints the playground for the next move
     *
     * @param output takes the PlayGround as String[][]output
     */
    public void printMessage(String[][] output) {
        System.out.println(Arrays.deepToString(output)
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n"));
        System.out.println("Type in your Commands: Target or Mark (no space):");
    }
}

