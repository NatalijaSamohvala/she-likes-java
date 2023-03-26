package com.sda.she_likes_java.homework;

public class address {
    String country;
    String city;
    String street;
    String postalCode;

    public void City () {
        System.out.println("Riga");
    }
    @Override
    public String toString() {
        return "address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        address myFirstAddress = new address();
        myFirstAddress.country = "Latvia";
        myFirstAddress.city = "Jelgava";

        address mySecondAddress = new address();
        mySecondAddress.country = "Latvia";
        mySecondAddress.city = "Riga";

        System.out.println("City from first address: " + myFirstAddress.city);
        System.out.println("City from second address: " + mySecondAddress.city);

        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);

    }

}
