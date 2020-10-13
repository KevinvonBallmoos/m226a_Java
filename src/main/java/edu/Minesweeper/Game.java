package edu.Minesweeper;

import java.util.Arrays;

/**
 * starts game
 */
public class Game {
    UserInput input = new UserInput();
    ValidateUserInput validate = new ValidateUserInput();
    InputVerification verification = new InputVerification();
    GameIsStillOn gameIsStillOn = new GameIsStillOn();

    public static PlayGround playGround = new PlayGround();

    public static void main(String[] args) {

        Game game = new Game();

        playGround.generatePlayGround();
        System.out.println(Arrays.deepToString(playGround.getPlayGroundArray())
                .replace("[[", " ")
                .replace("]]", " \n")
                .replace("], [", " \n")
                .replace("]", " ")
                .replace(",", " ")
                .replace("[", " "));


        System.out.println("Type in your Commands: Target or Mark (no space):\n");

        game.gamePlay();

    }

    /**
     * gameplay while the game is still on it continues to take input from the user, till he wins or looses
     */
    public void gamePlay() {
        String[][] output = playGround.getPlayGroundArray();
        String userCode;
        while (gameIsStillOn.isStillInGame()) {
            do {
                userCode = input.userCodeInput();

            } while (!validate.validate(userCode));
            if (verification.userInputEquals(userCode, output)) {
                break;
            }
        }
    }
}