package com.learning.pattern.createPattern.factoryPattern.simple;

import com.learning.pattern.factoryPattern.simple.Operation;

/**
 * 操作-乘法
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}
