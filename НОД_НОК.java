package com.petehouston.tutorial.java;
import java.util.*;
import java.lang.String;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println(lcm(39, 65));
    }

    public static int gcd(int a, int b){
        while (a != b){
            if ( a>b) a -= b;
            else b -= a;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
