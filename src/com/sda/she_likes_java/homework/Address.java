package com.sda.she_likes_java.homework;

public class Address {
    public String country;
    public String city;
    public String street;
    public String postalCode;

   // public void City () {
    //    System.out.println("Riga");
  //  }
    //@Override
    public String toString() {
       return "Address{" +
              "country='" + country + '\'' +
              ", city='" + city + '\'' +
              ", street='" + street + '\'' +
              ", postalCode='" + postalCode + '\'' +
              '}';
  }

    public static void main(String[] args) {
        Address myFirstAddress = new Address();
        myFirstAddress.country = "Latvia";
        myFirstAddress.city = "Jelgava";

        Address mySecondAddress = new Address();
        mySecondAddress.country = "Latvia";
        mySecondAddress.city = "Riga";

        System.out.println("City from first Address: " + myFirstAddress.city);
        System.out.println("City from second Address: " + mySecondAddress.city);

        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);

    }

}
