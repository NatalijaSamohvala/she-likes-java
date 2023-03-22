package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {

    /*
    Exercise 13
    Create an int array with 100 elements
    Initialise each element with a value 3 times greater than the current index
    e.g.
    tab[0] = 3 * 0
    tab[10] = 3 * 10.
    */

    public static void main(String[] args) {
        int[] myGradesOnEnglishClass = new int[10000];

        Random gradeGenerator = new Random (7);
// initializing grades with some random scores
        for(int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = 1+ gradeGenerator.nextInt(6);
        }

        for(int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index number: " + index + " is " + myGradesOnEnglishClass[index]);
        }
    }
}
