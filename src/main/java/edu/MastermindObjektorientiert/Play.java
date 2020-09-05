package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class Play {



    RandomCode randomCode;
    UserInput userInput;
    UserInputValidate userInputValidate;
    CompareInput compareInput;

    public void play() {

        userInput = new UserInput();
        randomCode = new RandomCode();
        userInputValidate = new UserInputValidate();
        compareInput = new CompareInput();

        randomCode.randomChars();

        while (compareInput.getTriesLeft() > 0) {
            String input;
            do {
                System.out.println("Geben Sie einem Versuchscode mit vier Buchstaben aus der Menge " + Arrays.toString(randomCode.getColors()).replace('[', '(').replace(']', ')'));
                input = userInput.userInput();
                System.out.println("Die Eingabe wird überprüft");
            } while (!userInputValidate.userInputvalidate(input));
            if (compareInput.inputCompare()) {
                break;
            }
        }

    }


}
