package com.learning.pattern.factoryPattern.simple;

/**
 * 操作-加法
 */
public class OperationAdd extends Operation {

    @Override
    protected double getResult() {
        return getValue1() + getValue2();
    }
}
