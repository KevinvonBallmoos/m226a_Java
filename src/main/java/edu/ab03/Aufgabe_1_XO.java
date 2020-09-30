package edu.ab03;

import java.util.Random;

public class Aufgabe_1_XO {

    private final int count = 10;
    private int number;
    private final char[] XO = new char[10];

    public static void main(String[] args) {

        Aufgabe_1_XO aufgabe1Xo = new Aufgabe_1_XO();
        aufgabe1Xo.XO();
    }

    public void XO() {

        for (int col = 1; col <= count; col++) {
            randomNumber();
            fillArrayWithO();
            fillArrayWithX();
            System.out.println("Column " + col + " " + " Randomnumber: " + number  + " " + String.valueOf(XO));
        }
    }

    /**
     * generates random numbers between 1 and 4
     */
    public void randomNumber(){
        Random random = new Random();
        number = random.nextInt(4 )+1;
    }

    /**
     * fills the array XO with 'O'
     */
    public void fillArrayWithO(){
        for (int o = 0; o < count; o++){
            XO[o] = 'O';
        }
    }

    /**
     * fills the array XO with count of 'X'
     */
    public void fillArrayWithX(){

        int numberOfX = Math.floorDiv(count -1, number);
        for (int x = 0; x < count; x+= numberOfX ){
            XO[x] = 'X';
        }
    }
}

