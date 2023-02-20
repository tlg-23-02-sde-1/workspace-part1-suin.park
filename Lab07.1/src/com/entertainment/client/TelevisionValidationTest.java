package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(0);                                            // should stick
        System.out.println("volume: " + tv.getVolume());            // should be 0

        tv.setVolume(100);                                          //should stick
        System.out.println("volume: " + tv.getVolume());            // should be 0

        tv.setVolume(-1);                                           // error
        tv.setVolume(101);                                          // error
        System.out.println("volume: " + tv.getVolume());            // return error message

        tv.setBrand("Samsung");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("LG");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Sony");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Toshiba");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Invalid");                               // error, brand not set
        System.out.println("brand: " + tv.getBrand());        // should still be Toshiba, from before
    }

}