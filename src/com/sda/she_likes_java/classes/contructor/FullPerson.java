package com.sda.she_likes_java.classes.contructor;

public class FullPerson {
    private String name;
    private String surname;
    public int age;

    private FullAddress address;

    public FullPerson() {
    }

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public FullAddress getAddress() {
        return address;
    }

    public void setAddress(FullAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void describeYourself() {
        System.out.println("Hi! I am " + name + " " + surname);
    }

    public static void genericDescription () {
        System.out.println("Generic description");
    }
    public static void main(String[] args) {
        FullAddress address = new FullAddress("Italy", "Roma", "La Romania", "007");
        FullPerson person = new FullPerson("Natalija", "Samohvala", 35, address);
        System.out.println("Person is: " + person);
        person.describeYourself();

        FullPerson personWithoutAddress = new FullPerson ("Super", "Mario", 45, null);
        personWithoutAddress.describeYourself();

        genericDescription();
    }
}