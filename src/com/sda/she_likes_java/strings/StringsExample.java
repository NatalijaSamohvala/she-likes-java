package com.sda.she_likes_java.strings;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Natalija";
        String surname = "Samohvala";
        int age = 35;
        System.out.println("Hi, I'm " + name + " " + surname + ". I am " + age + " years old.");
        //String.format(" Hi, I'm %s %s. I am %s years old.",name, surname, age);
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.".formatted(name, surname, age)));
    }
}
