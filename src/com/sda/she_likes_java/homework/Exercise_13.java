package com.sda.she_likes_java.homework;

public class Exercise_13 {
    public static void main(String[] args) {
int[] element = new int [100];
for(int index = 0; index < element.length; index++) { //???
    element[index] = 3 * index;
}
        for(int index = 0; index < element.length; index++) {
            System.out.println("3 * " + index + " = " + element[index]);
        }
    }
}
