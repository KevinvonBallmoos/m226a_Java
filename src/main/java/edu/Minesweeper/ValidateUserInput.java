package edu.Minesweeper;

/**
 * validates the user input
 * @author Kevin von Ballmoos
 */
public class ValidateUserInput {

    /**
     * validates the Input
     * is there 1 char
     * and 2 numbers
     *
     * @param userCode takes the UserInput
     * @return true if UserInput is valid, and false if its not valid
     */

    public boolean validate(String userCode) {

        if (userCode.length() != 3) {
            System.out.println("Input not valid");
            return false;
        } else {
            char[] userGuess = new char[userCode.length()];
            for (int i = 0; i < userGuess.length; i++) {
                userGuess[i] = userCode.charAt(i);
            }
            if (!(userGuess[0] == 'T') && !(userGuess[0] == 'M')) {
                System.out.println("Input not valid, either M or T is allowed!");
                System.out.println("Try again!");
                return false;
            }
            try {
                Integer.parseInt(String.valueOf(userGuess[1]));
                Integer.parseInt(String.valueOf(userGuess[2]));
            } catch (NumberFormatException e) {
                return false;
            }
            if ((Integer.parseInt(String.valueOf(userGuess[1])) > 7) || Integer.parseInt(String.valueOf(userGuess[2])) > 7)
            {
                System.out.println("Input not vaild, one Char and 2 numbers allowed (numbers from 0 to 7!!");
                System.out.println("Try again!");
                return false;
            }

            return true;
        }
    }
}
