package com.nix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueSymbolsCounter {

    public int countInArray(int [] inputArray){
        if (inputArray.length==0)
            return 0;

        int[] buffer = new int[]{inputArray[0]};

        for (int i = 1; i < inputArray.length; i++) {
            if(Arrays.binarySearch(buffer,inputArray[i])<0){
                buffer = addToBuffer(buffer,inputArray[i]);
            }
        }
        return buffer.length;
    }

    private int[] addToBuffer(int[] oldBuffer, int value){
        int[] newBuffer = new int[oldBuffer.length+1];
        for (int i = 0; i < oldBuffer.length; i++) {
            newBuffer[i] = oldBuffer[i];
        }
        newBuffer[newBuffer.length-1] = value;
        Arrays.sort(newBuffer);
        return newBuffer;
    }
}
