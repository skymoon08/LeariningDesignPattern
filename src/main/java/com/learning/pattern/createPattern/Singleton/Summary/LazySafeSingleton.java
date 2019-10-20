package com.learning.pattern.createPattern.Singleton.Summary;

/**
 * 懒汉式 - 线程安全
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 */
public class LazySafeSingleton {

    private static LazySafeSingleton instance;

    private LazySafeSingleton(){}

    public static synchronized LazySafeSingleton getInstance(){
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
