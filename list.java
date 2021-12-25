package com.petehouston.tutorial.java;

import java.util.*;

public class TempClass {

   public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(8);
       list.add(2);
       list.add(4);
       list.add(19);

       Iterator<Integer> iterator = list.iterator();

       while (iterator.hasNext()){
           int element = iterator.next();
           System.out.println(element);
       }

       for (Integer integer : list) {
           System.out.println(integer);
       }

       List<String> names = List.of("John","Sarah","Jack");
       for (Iterator<String> i = names.iterator(); i.hasNext();){
           String name = (String) i.next();
           System.out.println("Name = " + name);
       }
   }

}
