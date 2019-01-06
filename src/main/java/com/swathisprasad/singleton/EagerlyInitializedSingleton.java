package com.swathisprasad.singleton;

public class EagerlyInitializedSingleton {

    /** private constructor to prevent others from instantiating this class */
    private EagerlyInitializedSingleton() {}

    /** Create an instance of the class at the time of class loading */
    private static final EagerlyInitializedSingleton instance = new EagerlyInitializedSingleton();

    /** Provide a global point of access to the instance */
    public static EagerlyInitializedSingleton getInstance() {
        return instance;
    }

}
