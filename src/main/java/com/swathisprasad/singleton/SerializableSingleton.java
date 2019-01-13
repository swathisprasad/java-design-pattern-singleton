package com.swathisprasad.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = -6265755052204900542L;

    private static SerializableSingleton instance;

    private SerializableSingleton() {}

    public static synchronized SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }
}
