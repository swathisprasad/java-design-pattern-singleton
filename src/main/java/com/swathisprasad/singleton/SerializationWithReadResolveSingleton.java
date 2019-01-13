package com.swathisprasad.singleton;

import java.io.*;

public class SerializationWithReadResolveSingleton {

    public static void main(String[] args) {
        SerializableWithReadResolveSingleton instance1 = SerializableWithReadResolveSingleton.getInstance();

        try {
            // Serialize
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.serializable"));
            out.writeObject(instance1);
            out.close();

            // Deserialize
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.serializable"));
            SerializableWithReadResolveSingleton instance2 = (SerializableWithReadResolveSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode: " + instance1.hashCode());
            System.out.println("instance2 hashCode: " + instance2.hashCode());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
