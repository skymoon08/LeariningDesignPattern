package com.learning.pattern.factoryPattern.factoryMethod;

import com.learning.pattern.factoryPattern.simple.Operation;

/**
 * 工厂方法模式
 */
public interface IFactory {

    Operation CreateOption();

}
