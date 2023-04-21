package com.sda.she_likes_java.strings;

public class ImmutableString {


    public static void main(String[] args) {
        String name = "natalija";
        name.concat("samohvala"); //+ is shortcut for concat method call
        name = name.concat(" she is 35");
        System.out.println(name);

        StringBuilder nameWithBuilder = new StringBuilder("natalija");
        nameWithBuilder.append("samohvala");
        System.out.println("Name with builder:" + nameWithBuilder);
    }
}