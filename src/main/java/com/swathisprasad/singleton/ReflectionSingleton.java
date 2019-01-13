package com.swathisprasad.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = null;

        try {

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