package com.learning.pattern.createPattern.Singleton.lazy;


/**
 * 双重校验锁
 */
public class ScopeLazySingleton {

    private static ScopeLazySingleton instance;

    private ScopeLazySingleton(){}

    public static ScopeLazySingleton getScopeLazySingleton(){
        if (instance == null){
            synchronized (ScopeLazySingleton.class){
                if (instance == null) {
                    instance = new ScopeLazySingleton();
                }
            }
        }
        return instance;
    }
}
