package com.sda.she_likes_java.commonn_behavior.wrong_approach;

public class Tiger extends Animal implements Swimmable {
    @Override
    public void go() {
        super.go();
    }

    @Override
    public void swim() {
        System.out.println("Tigers are great swimmers");
    }
}
