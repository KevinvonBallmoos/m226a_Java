package edu.Learn;

import java.util.Arrays;
import java.util.Random;

public class Test {

    Random random = new Random();
    int column = 6, group = 3, element = 4;
    private final int[][][] randomNumbers = new int[column][group][element];
    private int minValueOfArray;

    public void fillArray() {
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    randomNumbers[col][grp][elm] = random.nextInt(11) + 20;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.fillArray();
        System.out.println(Arrays.deepToString(test.randomNumbers)
                .replace("[[[", " ( ").replace("]]]", " )")
                .replace("]],", " )\n").replace("[[", "( ")
                .replace("[", "( ").replace("]", " )")
                .replace(',', ' '));
        test.printPositionOfMinValue();

    }

    public void minValue() {
        minValueOfArray = randomNumbers[0][0][0];
        for (int col = 0; col < column; col++) {
            for (int grp = 0; grp < group; grp++) {
                for (int elm = 0; elm < element; elm++) {
                    if (randomNumbers[col][grp][elm] < minValueOfArray) {
                        minValueOfArray = randomNumbers[col][grp][elm];
                    }
                }
            }
        }
        System.out.println("Minium of the numbers is: " + minValueOfArray + " at Positions:");
    }

    public void printPositionOfMinValue() {
        minValue();
        int col, grp, elm;
        for (col = 0; col < column; col++) {
            for (grp = 0; grp < group; grp++) {
                for (elm = 0; elm < element; elm++) {
                    if (randomNumbers[col][grp][elm] == minValueOfArray) {
                        System.out.println("Column: " + col + " Group: " + grp + " Element:" + elm);
                    }
                }
            }
        }
    }
}

