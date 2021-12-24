package com.petehouston.tutorial.java;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.Date;
import java.lang.String;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i=0; i<3; i++){
            String myStr = input.next();
            list.add(myStr);
        }

        System.out.println(list);

        // task 1
//        for (int j=0; j<3; j++){
//            String lastElement = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            list.add(0,lastElement);
//        }
//
//        System.out.println(list);

//        // task 2
//        list.remove(2);
//
//        System.out.println(list);
//
//        for (int j=list.size()-1; j>=0; j--){
//            System.out.println(list.get(j));
//        }

        // task 3

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static List<String> fix(List<String> list){
        for (int i=0; i<list.size(); i++){
            String s = list.get(i);
            String b = "р";

            if (list.get(i).contains("р") && list.get(i).contains("л")) continue;
            else {
                if (list.get(i).contains("л")){
                    list.add(i+1,list.get(i));
                    i++;
                }

                if (s.charAt(0) == b.charAt(0)){
                    list.remove(i);
                }
            }
        }

        return list;
    }
}
