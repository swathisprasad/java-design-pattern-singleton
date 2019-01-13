package com.swathisprasad.singleton;

public class ProtectionAgainstReflectionSingleton {

    /** private constructor to prevent others from instantiating this class */
    private ProtectionAgainstReflectionSingleton() {
        // protect against instantiation via reflection
        if(instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    /** Create an instance of the class at the time of class loading */
    private static final ProtectionAgainstReflectionSingleton instance = new ProtectionAgainstReflectionSingleton();

    /** Provide a global point of access to the instance */
    public static ProtectionAgainstReflectionSingleton getInstance() {
        return instance;
    }
}
