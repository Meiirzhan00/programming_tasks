package com.petehouston.tutorial.java;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Random;


public class HelloWorld {

    public static void main(String[] args) {

        Random rand = new Random();
        int[][] nums = new int[3][3];

        for (int i=0; i< nums.length; i++){
            for (int j=0; j<nums[i].length; j++) {
                int randNumber = rand.nextInt(50);
                int mathRand = 10 +(int) (Math.random()*40);
                nums[i][j] = mathRand;
            };
        }

        for (int j=0; j<nums.length; j++){
            for (int i=0; i<nums[j].length; i++){
                System.out.printf("%d ",nums[j][i]);
            }
            System.out.println();
        }

        int[][] matrix = {
                {1,2,3},
                {7,9,0}
        };

        System.out.println(Arrays.toString(matrix[0]));

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
        hello();
        welcome();
        int a = 7, b = 8;
        int c = sum(a,b);
        System.out.println(c);

        multip("Meiirzhan",1,2,5,7);

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter hour = ");
        int h = scan.nextInt();
        String res = dateTime(h);
        System.out.println(res);


    }

    static void hello(){
        System.out.println("Hello Java");
    }

    static void welcome(){
        System.out.println("Welcome to Java 17.0.1");
    }

    static int sum(int x, int y){
        int z = x + y;
        return z;
//        System.out.printf("Sum %d + %d = %d",x,y,z);
    }

    static void multip(String s, int ...j){
        int result = 1;
        for(int i: j){
            result *= i;
        }
        System.out.printf("\n%s , result = %d",s,result);
    }

    static String dateTime(int hour){
        if (hour > 24 || hour<0) return "Invalid data";
        else if (hour > 24 || hour < 6) return "Good night";
        else if (hour >= 15) return "Good evening";
        else if (hour >= 11) return "Good afternoon";
        else return "Good morning";
    }

}
