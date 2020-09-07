package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class CompareInput {

    RandomCode randomColors;
    private int triesLeft = 10;
    private final char[] userGuess = new char[4];

    public char[] getUserGuess() {
        return userGuess;
    }

    public int getTriesLeft() {
        return triesLeft;
    }

    /**
     * //comparing the input with randomcode
     * if color and position is right 1 point
     * if color is right but position not 1 point
     */
    public boolean inputCompare() {
        boolean win = false;

        randomColors = new RandomCode();

        if (Arrays.equals(userGuess, randomColors.getRandomColors())) {
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < randomColors.getRandomColors().length; i++) {
                if (userGuess[i] == randomColors.getRandomColors()[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : userGuess)
                for (int i = 0; i < randomColors.getRandomColors().length; i++) {

                    if (k == randomColors.getRandomColors()[i] && userGuess[i] != randomColors.getRandomColors()[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            this.triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + this.triesLeft);
        } else if (this.triesLeft == 0) {
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(randomColors.getRandomColors()));
        }
        return win;
    }
}
