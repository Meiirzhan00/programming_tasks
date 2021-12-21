package com.petehouston.tutorial.java;
import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.String;


public class HelloWorld {

    public static void main(String[] args) throws IOException {
//        Cat p = new Cat("Meiirzhan",21);
//        System.out.println(p.getAge());
//        p.setAge(18);
//        System.out.println(p.getAge());
//        p.setAge(370);
//        System.out.println(p.getAge());

//        Person tom = new Person();
//        Person bob = new Person();
//
//        tom.displayId();
//        bob.displayId();
//        System.out.println(Person.counter);
//
//        Person.counter = 8;
//        Person sam = new Person();
//        sam.displayId();
//        double radius = 60;
//
//        System.out.printf("Radius: %f \n", radius);
//        System.out.printf("Area: %f \n", Math.PI * radius);

//        User user = new User("mylogin","mypassword");
//
//        System.out.println("Login: " + user.getLogin());
//        System.out.println("Password: " + user.getPassword());

        Employee sam = new Employee("Sam", "Meta");
        sam.display();

    }
}

class People{
    private String name;

    public String getName(){ return name; }
    public People(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name);
    }
}

class Employee extends People{
    private String company;

    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    public void display(){
        super.display();
//        System.out.println("Name: " + getName());
        System.out.printf("%s works in %s ! \n",getName(),company);
    }
}

class User{
    private String login;
    private String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password.charAt(0) + "******";
    }

    public void setPassword(String password){
        this.password = password;
    }
}
class Math{
    public static final double PI = 3.14;
}


class Person{
    private int id;
    static int counter = 1;

    Person(){
        id = counter++;
    }

    public void displayId(){
        System.out.printf("Id: %d \n",id);
    }
}


class Cat{
    private String name;
    private int age = 1;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0 && age < 110){
            this.age = age;
        }
    }
}
