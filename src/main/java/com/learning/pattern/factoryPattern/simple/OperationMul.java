package com.learning.pattern.factoryPattern.simple;

/**
 * 操作-乘法
 */
public class OperationMul extends Operation {
    @Override
    protected double getResult() {
        return getValue1() * getValue2();
    }
}
