package com.nix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LifeGameTest {

    LifeGame game = new LifeGame();
    @Test
    public void nextState3x3() {
        int[][] plate3x3 = new int[][]{
                {0,1,1},
                {1,1,0},
                {0,1,1}
        };
        int[][] expectedPlate3x3 = new int[][]{
                {1,1,1},
                {1,0,0},
                {1,1,1}
        };
        int [][] actualPlate =  game.nextState(plate3x3);
        assertTrue(Arrays.deepEquals(expectedPlate3x3,actualPlate));
    }

    @Test
    public void nextState4x3() {
        int[][] plate4x3 = new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0}
        };
        int[][] expectedPlate4x3 = new int[][]{
                {1,1,1,0},
                {1,0,1,0},
                {1,1,1,0}
        };
        int [][] actualPlate =  game.nextState(plate4x3);
        assertTrue(Arrays.deepEquals(expectedPlate4x3,actualPlate));
    }

    @Test
    public void countLiveNeighbors() {
        int[][] plate = new int[][]{
                {0,1,1},
                {1,1,0},
                {0,1,1}
        };

        assertEquals(2,game.countLiveNeighbors(plate,2,2));
    }
}