package edu.Learn;

import java.util.Arrays;
import java.util.Random;

public class Dreieck {

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
        System.out.println("Minimum of the numbers is : " + minValue);
    }

    public static void generateNumbers() {

        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    temperatureNumbers[col][grp][elm] = random.nextInt(11) + 20;
                }
            }
        }
    }

    public static void minimumValue() {
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                te
                }
            }
        }
    }
}