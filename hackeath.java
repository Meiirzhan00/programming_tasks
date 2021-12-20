package com.petehouston.tutorial.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.String;


public class HelloWorld {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        String s = br.readLine();
//
//        if(0<=n && n<=10) System.out.println(n*2);
//        if(1<=s.length() && s.length()<=15) System.out.println(s);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] colCount = new int[n];
            int max = 0;
            for (int j = 0; j < n; j++) {
                    String colStr = sc.next();
                    int countHash = 0;
                    char hash = '#';
                    for (int k = 0; k < colStr.length(); k++) {
                        if (colStr.charAt(k) == hash) countHash++;
                    }
                    colCount[j] = countHash;
                }

            for(int l=0; l<colCount.length; l++){
                if(colCount[l]>max){
                    max = colCount[l];
                    result[i] = max;
                }
            }
        }

        for(int x=0; x<t; x++){
            System.out.println(result[x]);
        }
    }
}
