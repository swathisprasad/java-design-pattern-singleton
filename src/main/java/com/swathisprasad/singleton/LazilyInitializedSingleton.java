package com.swathisprasad.singleton;

public class LazilyInitializedSingleton {

    private static LazilyInitializedSingleton instance;

    /** Don't let anyone else instantiate this class */
    private LazilyInitializedSingleton() {}

    /** Create the instance lazily when it is accessed for the first time */
    public static synchronized LazilyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazilyInitializedSingleton();
        }
        return instance;
    }

}
