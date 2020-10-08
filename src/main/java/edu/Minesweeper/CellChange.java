package edu.Minesweeper;

import java.util.Arrays;

public class CellChange {

    PlayGround playGround = new PlayGround();


    public void CellIsChange(int col, int row, String[][] output) {
        int countOfMines = 0;
        for (int height = row; height < row + 3; height++) {

            for (int width = col; width < col + 3; width++) {
                if (width < 1 || height < 1) {
                    output[height][width] = output[height][width];
                } else if (width > 9 || height > 9) {
                    output[height][width] = output[height][width];
                }
                if (countOfMines == 0) {
                    output[col + 1][row + 1] = "0";
                }
                if (output[height][width].contains(playGround.getMines()) || output[height][width].contains("M")) {
                    countOfMines++;
                    output[col + 1][row + 1] = Integer.toString(countOfMines);
                }
            }
        }

        if (countOfMines == 0) {
//calculating 0
            // 1 Up and 1 left
            CellIsChange(col - 1, row - 1, output);
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
        }

        System.out.println(Arrays.deepToString(output)
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n"));

    }
}
