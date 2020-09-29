package edu.MastermindObjektorientiert;

/**
 * Mastermind validating rules are:
 * 4 chars
 * colors and position matches with randomcode
 */

public class UserInputValidate {

    private char[] userGuess = new char[4];
    private final char[] colors = new char[]{'r', 'g', 'b', 'w', 's', 'y'};

    public boolean validate(String input) {

        int validColors = 0;

        if (input.length() > userGuess.length || input.length() < userGuess.length) {
            System.out.println("Eingabe ungültig");
            return false;
        } else {
            userGuess = new char[input.length()];
            for (int i = 0; i < input.length(); i++) {
                userGuess[i] = input.charAt(i);
            }

            for (char k : userGuess) {
                for (char color : colors) {
                    if (k == color) {
                        validColors++;
                    }
                }
            }

        }
        return validColors >= 4;
    }
}
