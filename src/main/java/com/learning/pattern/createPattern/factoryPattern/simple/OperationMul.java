package com.learning.pattern.createPattern.factoryPattern.simple;


/**
 * 操作-乘法
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}
