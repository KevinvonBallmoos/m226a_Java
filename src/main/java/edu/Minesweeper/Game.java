package edu.Minesweeper;

import java.util.Arrays;

public class Game {
    /**
     * starts game
     */

    UserInput input = new UserInput();
    ValidateUserInput validate = new ValidateUserInput();
    InputVerification verification = new InputVerification();

    public static void main(String[] args) {
        PlayGround playGround = new PlayGround();
        Game game = new Game();

        playGround.generatePlayGround();
        System.out.println(Arrays.deepToString(playGround.getPlayGroundArray())
                .replace("],", " \n")
                .replace("[", " ")
                .replace(",", " ")
                .replace("[[", " ")
                .replace("]]", " "));

        game.gamePlay();
    }

    public void gamePlay() {
        //do while loop as long as no bomb is hit, otherwise game ends, needs fixes !
        String userCode;
        do {
            userCode = input.userCodeInput();
            if (validate.validateUserCode(userCode) == true) {
                verification.userInputEquals(userCode);
            }
        } while (!verification.userInputEqualsT(userCode));

    }
}
