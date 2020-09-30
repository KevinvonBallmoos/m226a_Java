package edu.ab04;

import edu.Learn.Test;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1a_Compare_Arrays {

    private final int[] randomNumbers = new int[30];
    private int[] copyOfNumbers = new int[30];
    Random random = new Random();
    private int count = 0;

    /**
     * fill Array
     * sort Array
     * copy Array
     * compare Array
     */
    public static void main(String[] args) {
        Aufgabe_1a_Compare_Arrays test = new Aufgabe_1a_Compare_Arrays();
        test.generateRandomNumbers();
        test.sortGeneratedNumbers();
        test.biggerThanBefore();
    }

    /**
     * fills Arrays with random generating numbers between 1 and 50
     */
    public void generateRandomNumbers() {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(50) +1;
        }
        System.out.println("Unsorted Numbers: " + Arrays.toString(randomNumbers)
                .replace('[', ' ')
                .replace(']', ' ')
                .replace(',', ' '));
    }

    /**
     * creates a copy and sort it
     */
    public void sortGeneratedNumbers() {
        copyOfNumbers = Arrays.copyOf(randomNumbers, randomNumbers.length);
        Arrays.sort(copyOfNumbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(copyOfNumbers)
                .replace('[', ' ')
                .replace(']', ' ')
                .replace(',', ' '));
    }

    /**
     * counts ho many numbers were bigger before counting
     */
    public void biggerThanBefore() {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > copyOfNumbers[i]) {
                count++;
            }
        }
        System.out.println("On " + count + " Positions were bigger numbers than Before");
    }


}
