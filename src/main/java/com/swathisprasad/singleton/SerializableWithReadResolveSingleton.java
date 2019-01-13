package com.swathisprasad.singleton;

import java.io.Serializable;

public class SerializableWithReadResolveSingleton implements Serializable {

    private static final long serialVersionUID = 1911904003687931976L;

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
