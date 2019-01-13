package com.swathisprasad.singleton;

import java.io.Serializable;

public class SerializableWithReadResolveSingleton implements Serializable {

    public static SerializableWithReadResolveSingleton instance = new SerializableWithReadResolveSingleton();

    private SerializableWithReadResolveSingleton() {}

    protected Object readResolve() {
        return instance;
    }

    public static synchronized SerializableWithReadResolveSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableWithReadResolveSingleton();
        }
        return instance;
    }

}
