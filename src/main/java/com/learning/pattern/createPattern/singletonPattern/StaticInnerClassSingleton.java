package com.learning.pattern.createPattern.singletonPattern;


public class StaticInnerClassSingleton {

    /**
     * 在静态内部类中初始化实例对象
     */
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    /**
     * 私有构造方法
     */
    private StaticInnerClassSingleton() {
    }

    /**
     * 对外提供获取实例静态方法
     *
     * @return
     */
    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
