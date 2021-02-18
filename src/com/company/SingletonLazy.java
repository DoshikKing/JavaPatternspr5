package com.company;

public class SingletonLazy {
    private static SingletonLazy instance;
    public static synchronized SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
            return instance;
        }
        return instance;
    }
}

