package edu.Minesweeper;

import java.util.Scanner;

public class UserInput {
    /**
     * Creates a new Scanner object for takin in, the UserInput
     */

    Scanner input = new Scanner(System.in);

    public String userCodeInput() {
        return this.input.nextLine().toUpperCase();
    }

}
