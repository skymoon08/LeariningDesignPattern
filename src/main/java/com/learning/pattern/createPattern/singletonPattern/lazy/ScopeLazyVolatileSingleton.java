package com.learning.pattern.createPattern.singletonPattern.lazy;

/**
 * 双重校验锁 - 使用volatile
 */
public class ScopeLazyVolatileSingleton {

    private static volatile ScopeLazyVolatileSingleton singleton;

    private ScopeLazyVolatileSingleton(){}

    public static ScopeLazyVolatileSingleton getSingleton(){
        if (singleton == null) {
            synchronized (ScopeLazyVolatileSingleton.class) {
                if (singleton == null) {
                    singleton = new ScopeLazyVolatileSingleton();
                }
            }
        }
        return singleton;
    }
}
