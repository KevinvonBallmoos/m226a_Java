package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class CompareInput {


    private int triesLeft = 10;


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


        Play colors = new Play();
        UserInputValidate guessOfUser = new UserInputValidate();

        if (Arrays.equals(guessOfUser.getUserGuess(), colors.getCopyOfColorArray())) {
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < colors.getCopyOfColorArrayLength(); i++) {
                if (guessOfUser.getUserGuess()[i] == colors.getCopyOfColorArray()[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : guessOfUser.getUserGuess())
                for (int i = 0; i < colors.getCopyOfColorArrayLength(); i++) {

                    if (k == colors.getCopyOfColorArray()[i] && guessOfUser.getUserGuess()[i] != colors.getCopyOfColorArray()[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            this.triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + this.triesLeft);
        } else if (this.triesLeft == 0) {
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(colors.getCopyOfColorArray()));
        }
        return win;
    }
}
