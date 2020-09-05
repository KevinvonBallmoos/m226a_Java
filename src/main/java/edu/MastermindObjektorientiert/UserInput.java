package edu.MastermindObjektorientiert;

import java.util.Scanner;

public class UserInput {

    public Scanner input;

    public Scanner getInput() {
        return input;
    }

    public UserInput(){

        this.input = new Scanner(System.in);

    }

    public String userInput() {

        return this.input.nextLine();

    }

}
