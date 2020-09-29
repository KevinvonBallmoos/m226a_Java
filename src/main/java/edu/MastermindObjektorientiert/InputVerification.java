package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class InputVerification {


    UserInputValidate userInputValidate = new UserInputValidate();
    private int triesLeft = 10;

    /**
     * //comparing the input with randomcode
     * if color and position is right 1 point
     * if color is right but position not 1 point
     *
     * @param output is randomCode
     * @return win true when userGuess is equals to randomCode
     */
    public boolean verificate(char[] output, String input) {

        boolean win = false;

        char [] userGuess = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            userGuess[i] = input.charAt(i);
        }

        if (Arrays.equals(userGuess, output)) {
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < output.length; i++) {
                if (userGuess[i] == output[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : userGuess)
                for (int i = 0; i < output.length; i++) {

                    if (k == output[i] && userGuess[i] != output[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + triesLeft);
        } else if (triesLeft == 0) {
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(output));
        }
        return win;
    }

    public int getTriesLeft() {
        return triesLeft;
    }
}
