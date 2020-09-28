package edu.Minesweeper;

public class ValidateUserInput {
    /**
     * validates the Input
     * is there 1 char
     * and 2 numbers
     * @param userCode takes the UserInput
     * @return true if UserInput is valid, and false if its not valid
     */

    public boolean validateUserCode(String userCode){

        char[] userGuess = new char[3];
        int validChars = 0;

        if (userCode.length() != 3) {
            System.out.println("Eingabe nicht gültig");
            return false;
        } else {
            for (int i = 0; i < userCode.length(); i++) {
                userGuess[i] = userCode.charAt(i);
            }

           validChars++;

        }
        return validChars >= 3;

    }
}
