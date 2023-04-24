package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {

        if (maybeWomanOrMan instanceof Man) {
            // casting / down casting
            // works for the references
            //instanceof gives us boolean result
            (
                    (Man) maybeWomanOrMan
            ).learnToCleanHouse();

            ((Man) maybeWomanOrMan).learnToCleanHouse();
        }

        if (maybeWomanOrMan instanceof Woman) {
            System.out.println("It's a Woman");
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }
}






