package org.veju.algorithms.searching;

import java.util.function.Function;

public class Demo {

    static int m1(int i){
      int q= i+10;
        return  q;
    }



    public static void main(String[] args) {
    Function<Integer, String> intToString = num -> "The number is: " + num;
        String result = intToString.apply(10);

        System.out.println(result);
        int k = 10;
        System.out.println(k);
         m1(k);
//        System.out.println(q+ " This is Q");
        System.out.println(m1(k));
    }
}
