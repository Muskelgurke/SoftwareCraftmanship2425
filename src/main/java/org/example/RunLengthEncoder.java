package org.example;

import java.util.ArrayList;
import java.util.List;

public class RunLengthEncoder {
    public static int[] encode(int[] data) {
        List<Integer> encodedValue = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < data.length; i++) {
            boolean didntReachEnd = i +1 < data.length;
            boolean neighboursAreEqual = data[i] == data[i+1];
            if (didntReachEnd && neighboursAreEqual) {
                count++;
            } else {
                encodedValue.add(data[i]);
                encodedValue.add(count);
                count = 1;
            }
        }
        return encodedValue.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] encode2(int[] data) {
        int inputLength = data.length;
        int CountOfCurrentValue = 1;
        List<Integer> encodedValue = new ArrayList<>();

        for (int i = 0; i < inputLength; i++) {
            if (i + 1 < inputLength)
                if (data[i] == data[i + 1]) {
                    CountOfCurrentValue++;
                } else {
                    encodedValue.add(data[i]);
                    encodedValue.add(CountOfCurrentValue);
                    CountOfCurrentValue = 1;
                }
            else {
                encodedValue.add(data[i]);
                encodedValue.add(CountOfCurrentValue);
            }
        }
        int[] output = encodedValue.stream().mapToInt(Integer::intValue).toArray();
        return output;
    }
}