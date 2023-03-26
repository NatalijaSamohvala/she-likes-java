package com.sda.she_likes_java.homework;

import com.sda.she_likes_java.classes.Person;

public class Parent {
    String name;
    String surname;

    com.sda.she_likes_java.homework.address address;

    public static void main(String[] args) {

        Parent mother = new Parent();
        mother.name = "Esmeralda";
        mother.surname = "Milule";

        System.out.println(mother.name + " " + mother.surname);
        address addressObject = new address ();
        addressObject.City();

        Person personObject1 = new Person ();
        personObject1.myFirstChild();

        Person personObject2 = new Person();
        personObject2.mySecondChild();

    }
}