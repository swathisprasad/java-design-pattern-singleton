package com.swathisprasad.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionWithPublicFieldSingleton {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = null;

        try {

            Field instance = Singleton.class.getDeclaredField("instance");
            instance.setAccessible(true);
            instance.set(instance, null);

            Constructor[] cstr = Singleton.class.getDeclaredConstructors();

            for (Constructor constructor: cstr) {

                //Setting constructor accessible

                constructor.setAccessible(true);

                instance2 = (Singleton) constructor.newInstance();

                break;

            }

        } catch (Exception e) {

            System.out.println(e);

        }

        System.out.println(instance1.hashCode());

        System.out.println(instance2.hashCode());

    }
}
