package com.learning.pattern.createPattern.factoryPattern.factoryMethod;


import com.learning.pattern.createPattern.factoryPattern.simple.Operation;

/**
 * 工厂方法模式
 */
public interface IFactory {

    Operation CreateOption();

}
