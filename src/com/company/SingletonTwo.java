package com.company;

public enum SingletonTwo {
    INSTANCE;
    public SingletonTwo getInstance() {
        return INSTANCE;
    }
}

