package com.sda.she_likes_java.classes;

public class PersonExample {

    public static void main(String[] args) {
        System.out.println("Let's use our newly created class Person");

        // number is primitive variable
        int number = 1;
        String name = "Natalija";

        //me is object variable
        // me is reference to object
        Person me = new Person ();
        me.name = "Natalija";
        Person you = new Person();
        you.name = "Agnese";

        System.out.println("My name currently is: " +me.name);
        System.out.println("Your name currently is: " +you.name);

    }
}
