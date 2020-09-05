package edu.ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1b_Three_Dimensions_Array {

    public static int col = 6, group = 3, element = 4;
    public static int[][][] randomNumbers = new int[col][group][element];
    public static int minValue;

    public static void main(String[] args) {
        generateRandomNumbers();
        System.out.println(Arrays.deepToString(randomNumbers)
                .replace("[[[", " ( ").replace("]]]", " )")
                .replace("]],", " )\n").replace("[[", "( ")
                .replace("[", "( ").replace("]", " )")
                .replace(',', ' '));

        System.out.println("Minimum der Zahlen ist: " + minimumValue());

        minValue = minimumValue();
        minValueInArray();
    }

    /**
     * fills the Array with random generating numbers
     */

    public static void generateRandomNumbers() {
        Random random = new Random();

        for (int col1 = 0; col1 < col; col1++) {
            for (int group1 = 0; group1 < group; group1++) {
                for (int element1 = 0; element1 < element; element1++) {
                    randomNumbers[col1][group1][element1] = random.nextInt(11) + 20;
                }
            }
        }

    }

    /**
     * @return  minimum Value of the hole Array
     */
    public static int minimumValue() {

        minValue = randomNumbers[0][0][0];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < group; j++) {
                for (int k = 0; k < element; k++) {
                    if (minValue > randomNumbers[i][j][k]) {
                        minValue = randomNumbers[i][j][k];
                    }
                }
            }
        }
        return minValue;
    }

    /**
     * Now the count of the minValue gets searched in the Array
     */
    public static void minValueInArray() {
        int col2 = 0, group2 = 0, element2 = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < group; j++) {
                for (int k = 0; k < element; k++) {
                    if (randomNumbers[i][j][k] == minValue) {
                       col2 = i;
                       group2 = j;
                       element2 = k;

                    }
                }
            }
            System.out.println("Zeile " + col2 + "  Gruppe " + group2 + "  Element " + element2);
        }
    }
}
