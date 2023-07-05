package org.veju.algorithms.searching;

import java.util.Scanner;

public class Codewars {
    public static String accum(String s) {
        String j = s.toLowerCase().repeat(3);
        System.out.println(j);
        String[] letters = s.toUpperCase().split("");
        for(int i = 0; i < letters.length; ++i){
            letters[i] += letters[i].toLowerCase().repeat(i);
        }
        return String.join("-", letters);
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        String s = scan.nextLine();
//        // scan.close();
//        Double d = scan .nextDouble();
//        // scan.close();
//        int i = scan.nextInt();
//        scan.close();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
        String a = "Peter";
        String b= "Peter";
        String c = new String("Peter");

        System.out.println(a==b);
        System.out.println(a==c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
