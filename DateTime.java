package com.petehouston.tutorial.java;

import java.util.*;

public class TempClass extends Object{

   public static void main(String[] args) {

       System.out.println(getTimeMsOfInsert(fill(new ArrayList())));
       System.out.println(getTimeMsOfInsert(fill(new LinkedList())));
   }

   public static long getTimeMsOfInsert(List list){
       Date startTime = new Date();
       insert10000(list);
       Date endTime = new Date();
       return endTime.getTime() - startTime.getTime();
   }

   public static void insert10000(List list){
       for (int i=0; i<10000; i++){
           list.add(0,new Object());
       }
   }

   private static List fill(List list){
       for (int i=0; i<10000; i++){
           list.add(new Object());
       }
       return list;
   }
}

--------------------------------------------------------------------------
  
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

//        Date date = new Date();
//        Date date2 = new Date();
//        date.setYear(119);
//
//        LocalDate localDate = LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalTime localTime = LocalTime.now();
//
//        System.out.println(date);
//        System.out.println(localDate);
//        System.out.println(localDateTime);
//        System.out.println(localTime);

//        Date today = new Date();
//        System.out.println(today.getTime());
//
//        long msDay = 24 * 60 * 60 *1000;
//        System.out.println("Years from 1970: " + today.getTime()/msDay/365);

//        LocalDate locald = LocalDate.of(2007, Month.APRIL,20);
//        System.out.println(locald);
//
//        Date currentTime = new Date();
//        Thread.sleep(300);
//        Date newTime = new Date();
//
//        long msDelay = newTime.getTime() - currentTime.getTime();
//        System.out.println("Time distance is: " + msDelay + " in ms.");

        System.out.println(getTimeMsOfget(fill(new ArrayList())));
        System.out.println(getTimeMsOfget(fill(new LinkedList())));
//        System.out.println(fill(new ArrayList()));
    }

    private static List fill(List list){
        for(int i=0; i<10000; i++){
            list.add(new Object());
        }
        return list ;
    }

    public static long getTimeMsOfget(List list){
        Date startTime = new Date();
        get10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;
    }

    public static void get10000(List list){
        int x;
        if(list.isEmpty()) return;
        else x = list.size()/2;

        for (int i=0; i<10000; i++){
            list.get(x);
        }

    }

}
