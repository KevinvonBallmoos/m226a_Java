package edu.MastermindObjektorientiert;


import java.util.Arrays;
import java.util.Random;

public class RandomCode {

    private final Random rand = new Random();
    private  char[] colors = new char[]{'r', 'g', 'b', 'w', 's', 'y'};
    private  char[] randomColors = new char[4];

    /**
     * randomcode gets generated
     * @return
     */


    public char randomChars() {
        int i;
        int RAND_COLORS = 4;
        for (i = 0; i < RAND_COLORS; i++) {

           this.randomColors[i] = this.colors[this.rand.nextInt(4)];
        }
        System.out.println("Guten Tag, Es wird nun ein 4 stelliger Code zufällig erstellt aus 6 verschiedenen Farben");
        System.out.println(Arrays.toString(randomColors));

        return 0;
    }


    public char[] getColors() {
        return colors;
    }

    public char[] getRandomColors() {

        return randomColors;
    }

}
