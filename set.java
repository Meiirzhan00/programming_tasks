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
        Set<String> set = new LinkedHashSet<>();
        set.add("text");
        set.add("text1");
        set.add("ab");
        set.add("ac");
        set.add("text2");

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }

        for (String s : set) {
            System.out.println(s);
        }

        Set<Person> setPerson = new LinkedHashSet<>();
        setPerson.add(new Person("Meiirzhan", 21));
        setPerson.add(new Person("Beksultan",20));
        setPerson.add(new Person("Abay",16));

        for (Person person : setPerson) {
            System.out.print(person.getName());
            System.out.println(" "+person.getAge());
        }
    }

}

class Person{
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return name;}

    public int getAge() { return age;}

}
