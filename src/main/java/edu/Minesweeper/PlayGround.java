package edu.Minesweeper;

import java.util.Arrays;
import java.util.Random;


public class PlayGround {
    /**
     * generates PlayGround with 5 - 10 bombs
     */

    String bomb = "*";
    int rowX = 9, colY = 9;
    String[][] playGroundArray = new String[rowX][colY];
    int countMines = 10;
    Random random = new Random();


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
                        playGroundArray[x][y] = "+";
                    }
                }
                if (x > 0) {
                    if (y > 0) {
                        playGroundArray[x][y] = "+";
                    }
                }

            }
            if (x == 8) {
                setMines();
            }
        }

    }

    public void setMines() {



        for (int bombX = 1; bombX < countMines; bombX++) {

            for (int bombY = 1; bombY < ; bombY += isMine + 1) {

                getPlayGroundArray()[bombX][bombY] = bomb;
            }
        }
        System.out.println("The PlayGround is ready and there are " + countMines + " bombs hidden.");
        System.out.println("");

       /* int countOfX = Math.floorDiv(lengthOfArray - 1, rand);
        randomXO();
        for (int x = 0; x < lengthOfArray; x += countOfX + 1) {
            XO[x] = 'X';*/
        }
    }
}