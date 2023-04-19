package com.sda.she_likes_java.visibility.private_modifier.cars;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        // brand is private so not visible outside the class
        funnyCar.setBrand("toyota");
        funnyCar.model = "corolla";

        // cannot see colour from outside its class package
        // funnyCar.colour = "pink";
    }
}
