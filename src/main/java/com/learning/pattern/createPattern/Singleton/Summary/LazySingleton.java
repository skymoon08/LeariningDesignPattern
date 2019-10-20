package com.learning.pattern.createPattern.Singleton.Summary;

/**
 * 懒汉式单例 - 线程不安全
 */
public class LazySingleton {

    private static LazySingleton instanace;

    private LazySingleton(){}

    public static LazySingleton getInstance(){

        if (instanace==null){
            instanace = new LazySingleton();
        }
        return instanace;
    }

}
