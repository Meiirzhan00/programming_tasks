package com.petehouston.tutorial.java;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Random;
import static java.lang.System.*;

public class HelloWorld {

    public static void main(String[] args) {

        Person meiirzhan = new Person("Meiirzhan", 21, "O.Utmakhanbet №20","+77021856931");

        meiirzhan.displayName();
        meiirzhan.displayAge();
        meiirzhan.displayPhone();
//        meiirzhan.displayAddress();

        out.println(meiirzhan.name);
        out.println(meiirzhan.age);
        out.println(meiirzhan.address);
//        out.println(meiirzhan.phone);
    }
}

class Person{
    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName(){
        
        out.printf("Name: %s \n", name);
    }

    void displayAge(){
        
        out.printf("Age: %d \n", age);
    }

    private void displayAddress(){
        
        out.printf("Address: %s \n", address);
    }

    protected  void displayPhone(){
        
        out.printf("Phone: %s \n", phone);
    }
}
