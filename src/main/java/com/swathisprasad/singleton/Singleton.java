package com.swathisprasad.singleton;

public class Singleton {

    /** private constructor to prevent others from instantiating this class */
    private Singleton() {}

    /** Create an instance of the class at the time of class loading */
    private static Singleton instance = new Singleton();

    /** Provide a global point of access to the instance */
    public static Singleton getInstance() {
        return instance;
    }
}
