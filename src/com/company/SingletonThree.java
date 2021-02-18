package com.company;

public class SingletonThree {

    public static class SingletonHolder{
        public static final SingletonThree HOLDER = new SingletonThree();
    }

    public static SingletonThree getInstance(){
        return SingletonHolder.HOLDER;
    }
}
