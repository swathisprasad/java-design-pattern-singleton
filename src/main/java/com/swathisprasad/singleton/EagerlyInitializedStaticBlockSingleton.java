package com.swathisprasad.singleton;


public class EagerlyInitializedStaticBlockSingleton {

    private static EagerlyInitializedStaticBlockSingleton instance;

    /** Don't let anyone else instantiate this class */
    private EagerlyInitializedStaticBlockSingleton() {}

    /** Create the one-and-only instance in a static block */
    static {
        try {
            instance = new EagerlyInitializedStaticBlockSingleton();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** Provide a public method to get the instance that we created */
    public static EagerlyInitializedStaticBlockSingleton getInstance() {
        return instance;
    }
}
