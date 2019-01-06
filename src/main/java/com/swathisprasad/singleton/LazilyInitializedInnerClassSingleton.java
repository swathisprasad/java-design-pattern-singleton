package com.swathisprasad.singleton;

public class LazilyInitializedInnerClassSingleton {

    /** private constructor to prevent others from instantiating this class */
    private LazilyInitializedInnerClassSingleton() {}

    /** This inner class is loaded only after getInstance() is called for the first time. */
    private static class InnerSingletonInitializer {
        private static final LazilyInitializedInnerClassSingleton INSTANCE = new LazilyInitializedInnerClassSingleton();
    }

    public static LazilyInitializedInnerClassSingleton getInstance() {
        return InnerSingletonInitializer.INSTANCE;
    }
}
