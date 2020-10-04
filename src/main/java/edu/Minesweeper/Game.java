package edu.Minesweeper;

import java.util.Arrays;

public class Game {
    /**
     * starts game
     */

    UserInput input = new UserInput();
    ValidateUserInput validate = new ValidateUserInput();
    InputVerification verification = new InputVerification();
    WinOrLoose winOrLoose = new WinOrLoose();

    public static PlayGround playGround = new PlayGround();

    public static void main(String[] args) {

        Game game = new Game();

        playGround.generatePlayGround();
        System.out.println(Arrays.deepToString(playGround.getPlayGroundArray())
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " \n" +
                        "\n"));

        System.out.println("Type in your Commands: Target or Mark (no space):\n");
               /* "\n" +
                " Target: T11  \n" +
                "  +  0  1  2  3  4  5  6  7 \n" +
                "  0  1  1  0  +  +  +  +  + \n" +
                "  1  *  1  0  +  +  +  +  + \n" +
                "\n" +
                "or\n" +
                "  Mark: M11\n" +
                "  +  0  1  2  3  4  5  6  7 \n" +
                "  0  +  +  +  +  +  +  +  + \n" +
                "  1  +  M  +  +  +  +  +  + ");*/

        game.gamePlay();

    }

    public void gamePlay() {
        //do while loop as long as no bomb is hit, otherwise game ends, needs fixes !
        String[][] output = playGround.getPlayGroundArray();
        String userCode;
        while (winOrLoose.isStillInGame()) {
            do {
                userCode = input.userCodeInput();

            } while (!validate.validate(userCode));
            verification.userInputEquals(userCode, output);
            if (winOrLoose.isStillInGame()) {
                System.out.println("You hit a mine, you Loose!!\n" +
                        "Game Over!!");
                break;
            }

        }

    }
}