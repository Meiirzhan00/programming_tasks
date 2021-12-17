package com.petehouston.tutorial.java;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        Person p = new Person();
        p.displayInfo();

        p.name = "Meiirzhan";
        p.age = 21;

        p.displayInfo();

        Person b = new Person("Tomas");
        b.displayInfo();

        Person d = new Person("Bob", 22);
        d.displayInfo();
    }
}


class Person{
    String name;
    int age;

    Person(){
        this("Gennady", 27);
    }

    Person(String name){
        this(name, 18);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.printf("Name: %s \t Age: %d\n", name, age);
    }
}
