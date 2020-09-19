package edu.Minesweeper;

import java.util.Arrays;
import java.util.Random;


public class PlayGround {
    /**
     * generates PlayGround with 10 minees on random places
     */

    private final int rowX = 9;
    private final int colY = 9;
    private final String[][] playGroundArray = new String[rowX][colY];
    private final String mines = "*";
    Random random = new Random();

    public String getMines() {
        return mines;
    }

    public String[][] getPlayGroundArray() {
        return playGroundArray;
    }

    public void generatePlayGround() {

        int x;
        int y;
        for (x = 0; x < rowX; x++) {
            for (y = 0; y < colY; y++) {
                if (x == 0) {
                    playGroundArray[x][y] = String.valueOf(y - 1);
                }
                if (y == 0) {
                    playGroundArray[x][y] = String.valueOf(x - 1);
                    if (x - 1 < 0) {
                        playGroundArray[x][y] = "";
                    }
                }
                if (x > 0) {
                    if (y > 0) {
                        playGroundArray[x][y] = "";
                    }
                }
            }
            if (x == 8) {
                setMines();
            }
        }

    }

    public void setMines() {


        final int numberOfMines = 10;
        for (int mineX = 1; mineX < 9; mineX++) {
            for (int mineY = 1; mineY < 2; mineY++) {
                getPlayGroundArray()[mineX][random.nextInt(playGroundArray.length -1) + 1] = mines;
            }
        }
        System.out.println("The PlayGround is generating.");
        System.out.println("...");
        System.out.println("The PlayGround is ready and there are " + numberOfMines + " mines hidden.");
        System.out.println("");

       /* int countOfX = Math.floorDiv(lengthOfArray - 1, rand);
        randomXO();
        for (int x = 0; x < lengthOfArray; x += countOfX + 1) {
            XO[x] = 'X';*/
    }
}
