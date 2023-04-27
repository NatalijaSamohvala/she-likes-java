package com.sda.she_likes_java.common_behavior;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
       // bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();

        Swimmable tiger2 = (Swimmable) tiger;
        Swimmable swimmableSuperman = (Swimmable) superman;
        Swimmable swimmableTiger = new Tiger ();

        Superman superSuperman = new Superman();
        Flyable superFly = superSuperman;
        superFly.fly();
        Swimmable superSwim = superSuperman;
        superSwim.swim();

        // Tiger assignment ways
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimmable swimmableTiger2 = new Tiger ();
        swimmableTiger2.swim();
        Object objectTiger = new Tiger(); // cannot cal go() or swim() here



    }
}
