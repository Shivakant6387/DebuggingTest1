package com.debugging.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Debugging2 {
    private static IntStream  factorize(int value ){
        List<Integer>factors=new ArrayList<>();
        for(int i=2;i<=value;i++){
            while (value % i==0){
                factors.add(i);
                value/=i;
            }
        }
        return factors.stream()
                .mapToInt(Integer::intValue);
    }
    public static void main(String[] args) {
        int[] result = IntStream.of(10, 87, 97, 43, 121, 20)
               // .flatMap(StreamsExample::factorize)
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
