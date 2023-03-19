package com.sda.she_likes_java.loops.while_loop;

import java.util.Scanner;

public class ManyTimesWhileLoop {
    public static void main(String[] args) {
        System.out.println("Hey, how many times should I repeat the loop?");

        Scanner inputReader = new Scanner(System.in);

        int numberOfTimes = inputReader.nextInt ();

        while (numberOfTimes > 0) {
            System.out.println("repeating...");
            System.out.println("current value of number of trials is: " + numberOfTimes);

            numberOfTimes--; // is the same as: numberOfTimes = numberOfTimes -1


        }
    }
}
