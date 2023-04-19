package com.sda.she_likes_java.name_clash;
import java.util.Date; // I am able to refer to the class with short name
//import java.sql.Date;



public class NamesClashes {

    public static void main(String[] args) {
       // using java.util.Date
       Date myDate = new Date();

      // using java.sql.Date
       java.sql.Date sqlDate = new java.sql.Date (100);

       // using Date class
        com.sda.she_likes_java.name_clash.Date myDate2 = new com.sda.she_likes_java.name_clash.Date();


    }
}
