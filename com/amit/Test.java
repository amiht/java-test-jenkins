package com.amit;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
    // input : [ -3 , 2 , -2 , 1 , -1, 3 ]
        // Ouput : [ -1, 1 , -2 ,2 -3 ,3 ]

        List<Integer> list = Arrays.asList(-3 , 2 , -2 , 1 , -1, 3);

        //Collections.sort( list, (I1, I2) -> (I1 > I2)? -1 : (I1 < I2) ?  1 : 0);
        Collections.sort(list, (a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA != absB) {
                return Integer.compare(absA, absB); // Sort by absolute values
            } else {
                return Integer.compare(a, b); // If absolute values are equal, sort by values
            }
        });

        System.out.println(list);

        // input : "aabbddccc"
        //Ouptut : "abdc"
        String str  = "aabbddccc";
        IntStream stream = str.chars().distinct();
        stream.forEach(ch -> System.out.println((char) ch));

      //  stream.forEach(System.out::println);




    }
}


