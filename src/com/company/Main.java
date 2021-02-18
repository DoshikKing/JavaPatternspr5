package com.company;

public class Main {

    public static void main(String[] args) {
	SingletonThree sin1 = SingletonThree.getInstance();

	SingletonLazy sin3 = SingletonLazy.getInstance();

	SingletonTwo sin2 = SingletonTwo.INSTANCE;
	
    }
}
