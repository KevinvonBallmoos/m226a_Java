package edu.MastermindObjektorientiert;

import java.util.Arrays;
import java.util.Random;

public class RandomCode {

    Random rand = new Random();
    private final char[] randomColors = new char[4];
    private final char[] colors = new char[]{'r', 'g', 'b', 'w', 's', 'y'};

    public void randomColorCode() {
        final int RAND_COLORS = 4;

        for (int i = 0; i < RAND_COLORS; i++) {
            this.randomColors[i] = this.colors[this.rand.nextInt(4)];
        }
        System.out.println(Arrays.toString(randomColors));
    }

    public char[] getColors() {
        return colors;
    }

    public char[] getRandomColors() {
        return Arrays.copyOf(randomColors, randomColors.length);
    }
}
