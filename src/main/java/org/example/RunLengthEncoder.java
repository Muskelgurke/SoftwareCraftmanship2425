package org.example;

import java.util.ArrayList;
import java.util.List;

public class RunLengthEncoder {
    public static int[] encode(int[] data) {
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
