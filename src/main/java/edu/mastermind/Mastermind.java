package edu.mastermind;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {


    public static final char[] colors = new char[]{'r', 'g', 'b', 'w', 's', 'y'};
    public static char[] randomColors = new char[4];
    public static char[] userGuess = new char[4];

    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    public static final int RAND_COLORS = 4;
    public static int triesLeft = 10;

    public static void main(String[] args) {

        game();

    }

    public static void game() {
        randomcode();

        while (triesLeft > 0) {
            String input;
            do {
                System.out.println("Geben Sie einem Versuchscode mit vier Buchstaben aus der Menge " + Arrays.toString(colors).replace('[', '(').replace(']', ')'));
                input = userInput();
                System.out.println("Die Eingabe wird überprüft");
            } while (!userInputvalidate(input));
            if (inputcompare()) {
                break;
            }
        }
    }

    /**
     * randomcode gets generated
     */
    public static void randomcode() {
        for (int i = 0; i < RAND_COLORS; i++) {

            randomColors[i] = colors[rand.nextInt(4)];
        }
        System.out.println("Guten Tag, Es wird nun ein 4 stelliger Code zufällig erstellt aus 6 verschiedenen Farben");
    }

    /**
     * input from user
     */
    public static String userInput() {

        return input.nextLine();

    }

    /**
     * Mastermind validating rules are:
     * 4 chars
     * colors and position matches with randomcode
     *
     * @param input from userInput
     */
    public static boolean userInputvalidate(String input) {

        int validColors = 0;


        if (input.length() > randomColors.length || input.length() < randomColors.length) {
            System.out.println("Eingabe nicht gültig");
            return false;
        } else {
            userGuess = new char[input.length()];
            for (int i = 0; i < input.length(); i++) {
                userGuess[i] = input.charAt(i);
            }

            for (char k : userGuess) {
                for (char color : colors) {
                    if (k == color) {
                        validColors++;
                    }
                }
            }

        }
        return validColors >= 4;
    }

    /**
     * //comparing the input with randomcode
     * if color and position is right 1 point
     * if color is right but position not 1 point
     */
    public static boolean inputcompare() {
        boolean win = false;

        if (Arrays.equals(userGuess, randomColors)) {
            System.out.println("Code war richtig" + "\n" + "Herzliche Gratulation du gewinnst");
            win = true;
        } else if (triesLeft > 0) {
            int equalColorAndPosition = 0;
            int equalColorButWrongPosition = 0;


            for (int i = 0; i < randomColors.length; i++) {
                if (userGuess[i] == randomColors[i]) {
                    equalColorAndPosition++;
                }
            }

            for (char k : userGuess)
                for (int i = 0; i < randomColors.length; i++) {

                    if (k == randomColors[i] && userGuess[i] != randomColors[i]) {
                        equalColorButWrongPosition++;
                    }
                }

            System.out.println("Anzahl Stifte mit korrekter Farbe & Platz: " + equalColorAndPosition);
            System.out.println("Anzahl Stifte mit korrekter Farbe, aber an falschem Platz: " + equalColorButWrongPosition);
            triesLeft--;
            System.out.println("Neuer Versuch." + "\n" + "Ubrige Versuche: " + triesLeft);
        } else if (triesLeft == 0) {
            System.out.println("Spiel beendet. Geheimcode war " + String.valueOf(randomColors));
        }
        return win;
    }

}