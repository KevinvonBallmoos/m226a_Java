package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class Play {



    RandomCode randomCode;
    UserInput userInput;
    UserInputValidate userInputValidate;
    CompareInput compareInput;

    private char[] sent = new char[4];

    public char[] getSent() {
        return sent;
    }

    public void play() {

        userInput = new UserInput();
        randomCode = new RandomCode();
        userInputValidate = new UserInputValidate();
        compareInput = new CompareInput();

        sent[0] = randomCode.randomChars();
        System.out.println(sent);

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
