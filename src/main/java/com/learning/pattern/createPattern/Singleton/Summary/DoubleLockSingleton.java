package com.learning.pattern.createPattern.Singleton.Summary;

/**
 * 双重校验锁
 */
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton instance;

    private DoubleLockSingleton(){}

    public static DoubleLockSingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
