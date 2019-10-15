package com.learning.pattern.createPattern.Singleton;

/**
 * 饿汉式
 */
public class Singleton {

    /**
     *  类内部实例化一个实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 私有构造函数，外部无法访问
     */
    private Singleton() {
    }

    /**
     * 对外提供获取实例对静态方法
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

}
