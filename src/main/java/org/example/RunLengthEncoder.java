package org.example;

import java.util.ArrayList;
import java.util.List;

public class RunLengthEncoder {
    public static int[] encode(int[] data){
        int inputLength = data.length;
        int counter = 1;
        List<Integer> returnList = new ArrayList<>();

        for(int i = 0; i<inputLength ; i++){
            if (i+1 <inputLength)
                if (data[i]==data[i+1]){
                    counter++;

                }else{
                    returnList.add(data[i]);
                    returnList.add(counter);
                    counter = 1;
            }else{
                    returnList.add(data[i]);
                    returnList.add(counter);
            }
        }
        int[] output = returnList.stream().mapToInt(Integer::intValue).toArray();
        return output;
    }
}
