package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSymbolsCounterTest {

    UniqueSymbolsCounter uniqueSymbolsCounter = new UniqueSymbolsCounter();
    @Test
    public void countInArrayWithNormalArray() {
        int[] normalArray = new int[]{1, 4, 5, 1, 1, 3};

        assertEquals(4,uniqueSymbolsCounter.countInArray(normalArray));
    }
    @Test
    public void countInArrayWithAllUniqueArray() {
        int[] uniqueArray = new int[]{1, 2, 3, 4, 5, 6};

        assertEquals(6,uniqueSymbolsCounter.countInArray(uniqueArray));
    }
    @Test
    public void countInArrayWithAllIdenticalArray() {
        int[] identicalArray = new int[]{1, 1, 1};

        assertEquals(1,uniqueSymbolsCounter.countInArray(identicalArray));
    }
    @Test
    public void countInArrayWithEmptyArray() {
        int[] emptyArray = new int[]{};

        assertEquals(0,uniqueSymbolsCounter.countInArray(emptyArray));
    }
}