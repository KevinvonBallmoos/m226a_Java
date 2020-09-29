package edu.ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1b_Three_Dimensions_Array {

    public static int column = 6, group = 3, element = 4;
    public static int[][][] temperatureNumbers = new int[column][group][element];
    public static Random random = new Random();
    public static int minValue;

    public static void main(String[] args) {
        generateNumbers();
        System.out.println(Arrays.deepToString(temperatureNumbers)
                .replace("[[[", " ( ").replace("]]]", " )")
                .replace("]],", " )\n").replace("[[", "( ")
                .replace("[", "( ").replace("]", " )")
                .replace(',', ' '));

        minimumValue();
        System.out.println("Minimum of the numbers is : " + minValue + ", on Position :");
        minValuePosition();
    }

    /**
     * fills the Array with random generating numbers
     */
    public static void generateNumbers() {

        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    temperatureNumbers[col][grp][elm] = random.nextInt(11) + 20;
                }
            }
        }
    }

    /**
     * search the Array for the min Value
     */
    public static void minimumValue() {
        minValue = temperatureNumbers[0][0][0];
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    if (temperatureNumbers[col][grp][elm] < minValue) {
                        minValue = temperatureNumbers[col][grp][elm];
                    }
                }
            }
        }
    }

    /**
     * Find all the Positions of the minValue and print it
     */
    public static void minValuePosition() {
        minimumValue();
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    if (temperatureNumbers[col][grp][elm] == minValue) {
                        System.out.println("Column " + col + ", Group " + grp + ", Element " + elm);
                    }
                }

            }

        }
    }
}
