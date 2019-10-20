package com.learning.pattern.createPattern.singletonPattern.serializable;

import java.io.Serializable;

/**
 * 使用双重校验锁方式实现单例
 */
public class SingletonSerializable implements Serializable {

    private volatile static SingletonSerializable singleton;

    private SingletonSerializable(){}

    public static SingletonSerializable getSingleton(){
        if (singleton == null) {
            synchronized (SingletonSerializable.class) {
                if (singleton == null) {
                    singleton = new SingletonSerializable();
                }
            }
        }
        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }

}
