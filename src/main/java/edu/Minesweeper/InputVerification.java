package edu.Minesweeper;


public class InputVerification {
    /**
     * checks the cells
     * cover = +
     * open = number of bomb nearby 0 - ...
     * bomb exploded = *
     * marked = B
     */

    //switch case T or M
    public void userInputEquals(String userCode) {


        switch (userCode) {
            case "T" -> userInputEqualsT(userCode);
            case "M" -> userInputEqualsM(userCode);
        }

    }

    public boolean userInputEqualsT(String userCode) {

        boolean win = false;
        return win = true;
    }

    public void userInputEqualsM(String userCode) {

    }

}

