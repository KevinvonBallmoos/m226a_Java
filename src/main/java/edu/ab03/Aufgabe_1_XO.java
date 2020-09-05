package edu.ab03;

import java.util.Random;

public class Aufgabe_1_XO {

    public static char[] XO = new char[10];
    public static int lengthOfArray = 10;

    /**
     * Creates random number
     * Calculate where the position of the x is
     * calls randomXO
     * loop all 10 times
     * print
     */

    public static void main(String[] args) {

        Random random = new Random();

        for (int row = 1; row <= lengthOfArray; row++) {
            int rand = random.nextInt(4) + 1;
            int countOfX = Math.floorDiv(lengthOfArray - 1, rand);
            randomXO();
            for (int x = 0; x < lengthOfArray; x += countOfX + 1) {
                XO[x] = 'X';
            }

            System.out.println("Zeile: " + row + " " + " Zufallszahl: " + rand + " " + " " + String.valueOf(XO));
        }

    }

    /**
     * fills the array XO with 'O'
     */
    public static void randomXO() {

        for (int o = 0; o < lengthOfArray; o++) {

            XO[o] = 'O';
        }

    }


}

