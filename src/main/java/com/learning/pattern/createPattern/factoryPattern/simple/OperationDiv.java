package com.learning.pattern.createPattern.factoryPattern.simple;


/**
 * 操作-除法
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数错误");
    }
}
