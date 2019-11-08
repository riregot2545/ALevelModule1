package com.nix;

public class Chess {

    public boolean checkHorseMove(Position inputPosition, Position movedPosition) {
        if (movedPosition.isCorrect() && inputPosition.isCorrect()) {

            if (Math.abs(movedPosition.number - inputPosition.number) == 1) {
                if (Math.abs(movedPosition.symbol - inputPosition.symbol) == 2)
                    return true;
            } else if (Math.abs(movedPosition.number - inputPosition.number) == 2) {
                if (Math.abs(movedPosition.symbol - inputPosition.symbol) == 1)
                    return true;
            }
        }
        return false;
    }


    static class Position {
        int number;
        char symbol;

        boolean isCorrect() {
            return number < 9 && number > 0 && symbol < 73 && symbol > 64;
        }

        Position(int num, char cr) {
            number = num;
            symbol = cr;
        }
    }
}
