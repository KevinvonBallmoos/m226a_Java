package edu.MastermindObjektorientiert;

import java.util.Arrays;
import java.util.Random;

public class Game {

    RandomCode randomCode = new RandomCode();
    UserInput userInput = new UserInput();
    UserInputValidate userInputValidate = new UserInputValidate();
    InputVerification inputVerification = new InputVerification();

    public static void main(String[] args) {
        Game game = new Game();

        game.intro();
        game.inputOutput();
    }

    public void intro() {

        System.out.println("Es wird nun ein Code generiert aus der Menge: " + Arrays.toString(randomCode.getColors()).replace('[', '(').replace(']', ')'));

        randomCode.randomColorCode();
    }

    public void inputOutput() {

        char[] output = randomCode.getRandomColors();
        while (inputVerification.getTriesLeft() > 0) {
            String input;
            do {
                System.out.println("Geben Sie einem Versuchscode mit vier Buchstaben aus der oben genannten Menge");
                input = userInput.userInput();
                System.out.println("Die Eingabe wird überprüft");
            } while (!userInputValidate.validate(input));
            if (inputVerification.verificate(output, input)) {
                break;
            }
        }
    }
}
