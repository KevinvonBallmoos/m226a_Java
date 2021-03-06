package edu.Minesweeper;

import java.util.Arrays;
import java.util.Random;

/**
 * creates playground and fills the mines into it
 * @author Kevin von Ballmoos
 */
public class PlayGround {

    private final int rowX = 10;
    private final int colY = 10;
    private final String[][] playGroundArray = new String[rowX][colY];
    private String mines = "*";

    Random random = new Random();



    public String getMines() {
        return mines;
    }

    public String[][] getPlayGroundArray() {
        return Arrays.copyOf(playGroundArray, playGroundArray.length);
    }

    /**
     * generates PlayGround
     */
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
                    if (x > 8) {
                        playGroundArray[x][y] = "";
                    } else if (x - 1 < 0) {
                        playGroundArray[x][y] = "+"; //+
                    }
                }

                if (x > 0) {
                    if (y > 0) {
                        playGroundArray[x][y] = "+"; //+
                    }
                }
                if (x > 8) {
                    if (y > 0) {
                        playGroundArray[x][y] = "";
                    }
                }
                if (y > 8) {
                    playGroundArray[x][y] = "";
                }
            }
            if (x == 8) {
                playGroundArray[0][0] = "";
                setMinesInPlayGround();
            }

        }

    }

    /**
     * Fills 10 mines random into the PlayGround
     */
    public void setMinesInPlayGround() {

//        mines = "+";
        final int numberOfMines = 10;
        for (int i = 0; i < numberOfMines; i++) {
            getPlayGroundArray()[random.nextInt(playGroundArray.length - 2) + 1][random.nextInt(playGroundArray.length - 2) + 1] = getMines();
        }
        System.out.println("The PlayGround is generating.");
        System.out.println("...");
        System.out.println("The PlayGround is ready and there are " + numberOfMines + " mines hidden.");
        System.out.println("..");

    }
}
