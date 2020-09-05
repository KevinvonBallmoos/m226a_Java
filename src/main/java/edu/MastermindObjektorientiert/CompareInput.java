package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class CompareInput {

    Play play;
    RandomCode randomCode;
    UserInputValidate userInputValidate = new UserInputValidate();
    private int triesLeft;

    public int getTriesLeft() {
        return triesLeft = 10;
    }

    public boolean inputCompare() {

        randomCode = new RandomCode();
        play = new Play();
        boolean win = false;
        System.out.println(Arrays.toString(randomCode.getRandomColors()));
        System.out.println(Arrays.toString(userInputValidate.getUserGuess()));

        if (Arrays.equals(userInputValidate.getUserGuess(), randomCode.getRandomColors())){
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (this.triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < randomCode.getRandomColors().length; i++) {
                if (userInputValidate.getUserGuess()[i] == randomCode.getRandomColors()[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : userInputValidate.getUserGuess())
                for (int i = 0; i < randomCode.getRandomColors().length; i++) {

                    if (k == randomCode.getRandomColors()[i] && userInputValidate.getUserGuess()[i] != randomCode.getRandomColors()[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            this.triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + this.triesLeft);
        } else if (this.triesLeft == 0) {

            int triesNeeded = 10 - this.triesLeft;
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(randomCode.getRandomColors()));
            System.out.println("Anzahl Versuche gebraucht :" + triesNeeded);
        }
        return win;
    }


}
