package com.swathisprasad.singleton;

public class LazilyInitializedDoubleCheckedLockingSingleton {

    private static volatile LazilyInitializedDoubleCheckedLockingSingleton instance;

    /** private constructor to prevent others from instantiating this class */
    private LazilyInitializedDoubleCheckedLockingSingleton() {}

    /** Initialize the singleton lazily in a synchronized block */
    public static LazilyInitializedDoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (LazilyInitializedDoubleCheckedLockingSingleton.class) {
                // double-check
                if(instance == null) {
                    instance = new LazilyInitializedDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
