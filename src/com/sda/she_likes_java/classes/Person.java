package com.sda.she_likes_java.classes;

public class Person {
    String name;
    String surname;
    int age;
    String address;

    //public void myFirstChild() {
       // Person myFirstChild = new Person();
        //myFirstChild.name = "Laila";
       // myFirstChild.surname = "Milule";
       // System.out.println(myFirstChild.name + " " + myFirstChild.surname);
   // }
   // public void mySecondChild(){
    //    Person mySecondChild = new Person ();
     //   mySecondChild.name = "Mila";
    //    mySecondChild.surname = "Milule";
      //  System.out.println(mySecondChild.name + " " + mySecondChild.surname);
    //}

    public static void main(String[] args) {
        Person myFirstChild = new Person();
        myFirstChild.name = "Laila";
        myFirstChild.surname = "Milule";

        Person mySecondChild = new Person();
        mySecondChild.name = "Mila";
        mySecondChild.surname = "Milule";

        System.out.println(myFirstChild.name + " " + myFirstChild.surname);
        System.out.println(mySecondChild.name + " " + mySecondChild.surname);
    }
}