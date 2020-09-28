package edu.ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_1a_Compare_Arrays {

    public static int[] randomNumbers = new int[30];
    public static int[] CopyOfArray;
    public static Random random = new Random();
    public static int count;
    /**
     * fill Array
     * sort Array
     * copy Array
     * compare Array
     */

    public static void main(String[] args) {

        generateRandomInts();
        System.out.println( "Unsorted Numbers: " + Arrays.toString(randomNumbers)
                .replace('[', ' ')
                .replace(']', ' ')
                .replace(',', ' '));

        CopyOfArray = Arrays.copyOf(randomNumbers, randomNumbers.length);

        Arrays.sort(CopyOfArray);
        System.out.println("Sorted Numbers:   "+ Arrays.toString(CopyOfArray)
                .replace('[', ' ')
                .replace(']', ' ')
                .replace(',', ' '));

        System.out.println("At " + countNumbers() + " positons were higher numbers in the unsorted Array");
    }

    /**
     * fills Arrays with random generating numbers between 1 and 50
     */
    public static void generateRandomInts() {

        for (int i = 0; i < 30; i++) {
            randomNumbers[i] = random.nextInt(50) + 1;
        }
    }

    public static int countNumbers(){
        count = 0;

        for (int c = 0; c < randomNumbers.length; c++){
            if (randomNumbers[c] > CopyOfArray[c]){
                count++;
            }
        }
        return count;
    }

}
