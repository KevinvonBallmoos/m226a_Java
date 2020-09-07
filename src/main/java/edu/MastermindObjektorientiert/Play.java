package edu.MastermindObjektorientiert;

import java.util.Arrays;

public class Play {

    private final char[] colors = new char[]{'r', 'g', 'b', 'w', 's', 'y'};
    RandomCode randomCode;
    CompareInput compareInput;
    UserInput userInput;
    UserInputValidate userInputValidate;

    public char[] getColors() {
        return colors;
    }


    public Play(){
        randomCode = new RandomCode();
    }


    public void play() {

        randomCode.randomColorCode();
        compareInput = new CompareInput();
        System.out.println(Arrays.toString(randomCode.getRandomColors()));

        while (compareInput.getTriesLeft() > 0) {
            String input;
            do {
                System.out.println("Geben Sie einem Versuchscode mit vier Buchstaben aus der Menge " + Arrays.toString(this.colors).replace('[', '(').replace(']', ')'));
                userInput = new UserInput();
                input = (userInput.userInput());
                System.out.println("Die Eingabe wird überprüft");
                userInputValidate = new UserInputValidate();
            } while (!userInputValidate.userInputvalidate(input));
            if (compareInput.inputCompare()) {
                break;
            }
        }
    }

}
