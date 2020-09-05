package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class CompareInput {
    Play play = new Play();
    RandomCode randomCode = new RandomCode();
    UserInputValidate userInputValidate = new UserInputValidate();

    public boolean inputCompare() {
        boolean win = false;

        if (Arrays.equals(userInputValidate.userGuess, randomCode.getRandomColors())) {
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (play.triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < randomCode.getRandomColors().length; i++) {
                if (userInputValidate.userGuess[i] == randomCode.getRandomColors()[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : userInputValidate.userGuess)
                for (int i = 0; i < randomCode.getRandomColors().length; i++) {

                    if (k == randomCode.getRandomColors()[i] && userInputValidate.userGuess[i] != randomCode.getRandomColors()[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            play.triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + play.triesLeft);
        } else if (play.triesLeft == 0) {
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(randomCode.getRandomColors()));
        }
        return win;
    }
}
