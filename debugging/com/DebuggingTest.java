package com.debugging.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DebuggingTest {
    public static void main(String[] args) {
    callMethod();
    }
    public static void callMethod(){
        Object[]res= Stream.of(1,2,3,4,5,6,7,8).filter(i->i%2==0).filter(i->i>3).toArray();
        System.out.println(Arrays.toString(res));
    }
}
