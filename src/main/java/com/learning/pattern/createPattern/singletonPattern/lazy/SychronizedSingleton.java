package com.learning.pattern.createPattern.singletonPattern.lazy;

/**
 * 线程安全懒汉式
 */
public class SychronizedSingleton {

    //定义实例
    private static SychronizedSingleton instance;

    //私有构造方法
    private SychronizedSingleton() {
    }

    //对外提供获取实例的静态方法，对该方法加锁
    public static synchronized SychronizedSingleton getInstance() {
        //对象被使用的时候才初始化
        if (instance == null) {
            instance = new SychronizedSingleton();
        }
        return instance;
    }
}
