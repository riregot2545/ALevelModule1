package com.nix;

import java.util.Arrays;

public class LifeGame {

    public int[][] nextState(int[][] currentPlate) {
        int[][] newPlate = new int[currentPlate.length][currentPlate[0].length];
        for (int i = 0; i < currentPlate.length; i++) {
            for (int j = 0; j < currentPlate[0].length; j++) {
                int neighborsCount = countLiveNeighbors(currentPlate,i,j);
                if(neighborsCount>3 || neighborsCount<2)
                    newPlate[i][j] = 0;
                else if(neighborsCount==3)
                    newPlate[i][j] = 1;
                else
                    newPlate[i][j] = currentPlate[i][j];
            }
        }
        return newPlate;
    }


    public int countLiveNeighbors(int[][] matrix, int centerX, int centerY) {
        int currentX;
        int currentY;
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                currentX = i + centerX;
                currentY = j + centerY;
                if (i == 0 && j == 0)
                    continue;
                if (currentX < 0 || currentX >= matrix.length)
                    continue;
                if (currentY < 0 || currentY >= matrix[0].length)
                    continue;
                if (matrix[currentX][currentY] == 1)
                    count++;
            }
        }
        return count;
    }
}
