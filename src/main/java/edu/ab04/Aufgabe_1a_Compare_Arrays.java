package edu.ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1a_Compare_Arrays {

    public static int[] randomNumbers = new int[30];
    public static int count = 0;

    /**
     * fill Array
     * sort Array
     * copy Array
     * compare Array
     */

    public static void main(String[] args) {

        generateRandomNumbers();
        System.out.println("Unsortierte Zahlen: " + Arrays.toString(randomNumbers).replace('[', ' ').replace(']', ' ').replace(',', ' '));

        int[] randomNumbersCopy = Arrays.copyOf(randomNumbers, 30);
        Arrays.sort(randomNumbersCopy);

        System.out.println("Sortierte Zahlen: " + "  " + Arrays.toString(randomNumbersCopy).replace('[', ' ').replace(']', ' ').replace(',', ' '));

        for (int num = 0; num < randomNumbers.length; num++) {
            if (randomNumbersCopy[num] < randomNumbers[num]) {
                count++;
            }
        }

        System.out.println("An " + count + " Positionen waten im unsortierten Array grössere Zahlen");

    }

    /**
     * fills Arrays with random generating numbers between 1 and 50
     */
    public static void generateRandomNumbers() {
        Random random = new Random();

        for (int num = 0; num < randomNumbers.length; num++) {
            randomNumbers[num] = random.nextInt(50) + 1;
        }
    }
}
