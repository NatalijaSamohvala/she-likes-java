package com.sda.she_likes_java.homework.exercise_20;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        CarUtils.safeCast(new Mazda());
        CarUtils.safeCast(new Toyota());
        CarUtils.safeCast(new Ferrari());
        CarUtils.safeCast(new Car());
        BMW BMW = new BMW();
        BMW.speedUp();
        Car bmw = new BMW();
        CarUtils.safeCast(bmw);
    }
}