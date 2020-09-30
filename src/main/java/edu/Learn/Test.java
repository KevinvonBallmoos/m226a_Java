package edu.Learn;

import java.util.Random;

public class Test {

    Random random = new Random();
    private final char[] XO = new char[10];
    private int number;
    private int count = 10;

    public static void main(String[] args) {
        Test test = new Test();
        test.printAll();

    }

    public void printAll() {
        for (int col = 0; col <= count; col++) {
            generateRandomNumber();
            fillArraywithO();
            fillArraywithX();
            System.out.println("Column :" + col + " Randomnumber: " + number + " " + String.valueOf(XO));
        }

    }

    public void generateRandomNumber() {
        number = random.nextInt(4) + 1;
    }

    public void fillArraywithO() {
        for (int o = 0; o < count; o++) {
            XO[o] = 'O';
        }
    }

    public void fillArraywithX() {
        int numberOfX = Math.floorDiv(count - 1, number);
        for (int x = 0; x < count; x += numberOfX + 1) {
            XO[x] = 'X';
        }
    }
}
