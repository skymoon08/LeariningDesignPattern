package com.learning.pattern.createPattern.singletonPattern.lazy;

/**
 * 懒汉式
 */
public class LazySingleton {

    //定义实例
    private static LazySingleton instance;

    //私有构造方法
    private LazySingleton() {
    }
    //对外提供获取实例的静态方法
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
