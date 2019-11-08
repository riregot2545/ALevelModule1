package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {

    Chess chess = new Chess();
    Chess.Position horsePos = new Chess.Position(4, 'A');

    @Test
    public void checkHorseMoveDownLong() {
        Chess.Position movePos = new Chess.Position(3, 'C');
        assertTrue(chess.checkHorseMove(horsePos, movePos));
    }

    @Test
    public void checkHorseMoveDownShort() {
        Chess.Position movePos = new Chess.Position(2, 'B');
        assertTrue(chess.checkHorseMove(horsePos, movePos));
    }

    @Test
    public void checkHorseMoveUpLong() {
        Chess.Position movePos = new Chess.Position(6, 'B');
        assertTrue(chess.checkHorseMove(horsePos, movePos));
    }

    @Test
    public void checkHorseMoveUpShort() {
        Chess.Position movePos = new Chess.Position(5, 'C');
        assertTrue(chess.checkHorseMove(horsePos, movePos));
    }

    @Test
    public void checkHorseMoveForbiden() {
        Chess.Position movePos = new Chess.Position(10, 'C');
        assertFalse(chess.checkHorseMove(horsePos, movePos));
    }

    @Test
    public void checkHorseMoveNotRules() {
        Chess.Position movePos = new Chess.Position(5, 'B');
        assertFalse(chess.checkHorseMove(horsePos, movePos));
    }
}