package com.nix;

public class Bracket {


    public boolean validate(String input) {
        int roundBracketsOpened = 0;
        int squareBracketsOpened = 0;
        int figureBracketsOpened = 0;
        char lastBracket;

        int roundOpenIndex = input.indexOf(BracketItem.BracketType.ROUND_OPEN.toString());
        int squareOpenIndex = input.indexOf(BracketItem.BracketType.SQUARE_OPEN.toString());
        int figureOpenIndex = input.indexOf(BracketItem.BracketType.FIGURE_OPEN.toString());

        int lastBracketIndex;

        for (int i = 0; ; i++) {


            if (roundOpenIndex < squareOpenIndex) {
                roundBracketsOpened++;
                lastBracket = input.charAt(roundOpenIndex);
                lastBracketIndex = roundOpenIndex;
            } else {
                if (squareBracketsOpened > figureOpenIndex) {
                    squareBracketsOpened++;
                    lastBracket = input.charAt(squareOpenIndex);
                    lastBracketIndex = squareOpenIndex;
                } else {
                    figureBracketsOpened++;
                    lastBracket = input.charAt(figureOpenIndex);
                    lastBracketIndex = figureOpenIndex;
                }
            }

            int roundCloseIndex = input.indexOf(BracketItem.BracketType.ROUND_CLOSED.toString());
            int squareCloseIndex = input.indexOf(BracketItem.BracketType.SQUARE_CLOSED.toString());
            int figureCloseIndex = input.indexOf(BracketItem.BracketType.FIGURE_CLOSED.toString());

        }

    }

    public static class BracketItem{

        BracketType type;
        public enum BracketType{
            ROUND_OPEN("("),
            SQUARE_OPEN("["),
            FIGURE_OPEN("{"),

            ROUND_CLOSED(")"),
            SQUARE_CLOSED("]"),
            FIGURE_CLOSED("}");


            private String ss;
            BracketType(String s) {
                ss  =s;
            }

            @Override
            public String toString() {
                return ss;
            }
        }

    }
}
