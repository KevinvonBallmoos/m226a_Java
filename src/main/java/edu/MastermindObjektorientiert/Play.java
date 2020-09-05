package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class Play {

    public int triesLeft = 10;

    RandomCode randomCode;
    UserInput userInput;
    UserInputValidate userInputValidate;
    CompareInput compareInput;


    public Play(){

        userInput = new UserInput();
        randomCode = new RandomCode();
        userInputValidate = new UserInputValidate();
        compareInput = new CompareInput();
    }


    public void play() {

        System.out.println("Hallo");
        randomCode.randomcode();

        while (getTriesLeft() > 0) {

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

    public int getTriesLeft() {
        return triesLeft;
    }

}
