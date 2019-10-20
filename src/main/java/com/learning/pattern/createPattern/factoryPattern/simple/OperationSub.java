package com.learning.pattern.createPattern.factoryPattern.simple;

import com.learning.pattern.factoryPattern.simple.Operation;

/**
 * 操作-减法
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getValue1() - getValue2();
    }
}
