package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class UserInputValidate {

    private  char[] userGuess = new char[4];
    RandomCode randomCode = new RandomCode();



    /**
     * Mastermind validating rules are:
     * 4 chars
     * colors and position matches with randomcode
     *
     * @param input from userInput
     */
    public boolean userInputvalidate(String input) {

        int validColors = 0;


        if (input.length() > randomCode.getRandomColors().length || input.length() < randomCode.getRandomColors().length) {
            System.out.println("Eingabe nicht gültig");
            return false;
        } else {
            this.userGuess = new char[input.length()];
            for (int i = 0; i < input.length(); i++) {
                this.userGuess[i] = input.charAt(i);
            }

            for (char k : userGuess) {
                for (char color : randomCode.getColors()) {
                    if (k == color) {
                        validColors++;
                    }
                }
            }

        }
        return validColors >= 4;

    }
    public char[] getUserGuess() {
        return userGuess;
    }

}
