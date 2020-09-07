package edu.MastermindObjektorientiert;

/**
 * Mastermind validating rules are:
 * 4 chars
 * colors and position matches with randomcode
 * @param input from userInput
 */

import java.util.Arrays;
import java.util.RandomAccess;

public class UserInputValidate {

    Play colors;
    RandomCode randomColors;
    CompareInput compareInput;

    public boolean userInputvalidate(String input) {

        int validColors = 0;

        randomColors = new RandomCode();
        if (input.length() > randomColors.getRandomColors().length || input.length() < randomColors.getRandomColors().length) {
            System.out.println("Eingabe nicht gültig");
            return false;
        } else {

            compareInput = new CompareInput();

            for (int i = 0; i < input.length(); i++) {
                compareInput.getUserGuess()[i] = input.charAt(i);
            }

            colors = new Play();
            for (char k : compareInput.getUserGuess()) {
                for (char color : colors.getColors()) {
                    if (k == color) {
                        validColors++;
                    }
                }
            }
        }
        return validColors >= 4;
    }
}
