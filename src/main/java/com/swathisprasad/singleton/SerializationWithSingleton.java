package com.swathisprasad.singleton;

import java.io.*;

public class SerializationWithSingleton {

    public static void main(String[] args) {
        SerializableSingleton instance1 = SerializableSingleton.getInstance();

        try {
            // Serialize
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.serializable"));
            out.writeObject(instance1);
            out.close();

            // Deserialize
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.serializable"));
            SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
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
