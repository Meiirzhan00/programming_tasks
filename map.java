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

        Map<Integer, String> map = new HashMap<>();
        map.put(17,"text1");
        map.put(19,"text2");
        map.put(4,"text3");
        map.put(19,"text4");
        map.put(16,"text");
        map.put(null,"text5");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }


//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry);
//        }

//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println(entry);
//        }
    }

}
