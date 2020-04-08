package com.cybertek.Day14_Test_Base_Props_Driver;

public class Singleton {
    // make constructor private
    private Singleton() {
    }

    private static String string;

    public static String getInstance() {
        if (string == null) {
            string = "chrome";
        }
        return string;
    }
}
