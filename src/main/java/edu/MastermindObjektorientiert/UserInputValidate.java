package edu.MastermindObjektorientiert;

/**
 * Mastermind validating rules are:
 * 4 chars
 * colors and position matches with randomcode
 */


public class UserInputValidate {

    private char[] userGuess = new char[4];

    Play colors = new Play();
    CompareInput compareInput = new CompareInput();

    public char[] getUserGuess() {
        return userGuess;
    }

    public boolean userInputvalidate(String input) {

        int validColors = 0;


        if (input.length() > colors.getCopyOfColorArrayLength()|| input.length() < colors.getCopyOfColorArrayLength()) {
            System.out.println("Eingabe nicht gültig");
            return false;
        } else {



            for (int i = 0; i < input.length(); i++) {

                userGuess[i] = input.charAt(i);
            }


            for (char k : userGuess) {
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
