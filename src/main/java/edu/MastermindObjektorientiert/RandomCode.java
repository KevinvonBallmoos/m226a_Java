package edu.MastermindObjektorientiert;

import java.util.Arrays;
import java.util.Random;

public class RandomCode {

    Play colors;
    Random rand = new Random();
    private final char[] randomColors = new char[4];
    private final int RAND_COLORS = 4;

    public void randomColorCode() {
        colors = new Play();
        for (int i = 0; i < this.RAND_COLORS; i++) {

            this.randomColors[i] = colors.getColors()[this.rand.nextInt(4)];
        }
        System.out.println("Guten Tag, Es wird nun ein 4 stelliger Code zufällig erstellt aus 6 verschiedenen Farben");
    }

    public char[] getRandomColors() {
        return Arrays.copyOf(randomColors, randomColors.length);
    }
}
