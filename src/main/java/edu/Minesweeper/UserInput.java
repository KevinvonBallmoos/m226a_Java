package edu.Minesweeper;

import java.util.Scanner;

/**
 * Creates a new Scanner object for taking in, the UserInput
 */
public class UserInput {

    Scanner input = new Scanner(System.in);

    public String userCodeInput() {
        return this.input.nextLine().toUpperCase();
    }

}
