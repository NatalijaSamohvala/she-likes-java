package com.sda.she_likes_java.loops.while_loop;

public class WhileGrow {
    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid<18) {
            System.out.println("Can I go to disco, I am " + ageOfTheKid + " years old?");
            System.out.println("No");

            // ageOfTheKid = ageOfTheKid +1
            ageOfTheKid++; // this is the same in the line 11
        }
        System.out.println("Can I go to disco,I am " + ageOfTheKid + " years old?");
        System.out.println("Yes, go!");
    }
}
