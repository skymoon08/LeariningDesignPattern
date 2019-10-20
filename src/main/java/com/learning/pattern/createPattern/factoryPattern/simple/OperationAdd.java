package com.learning.pattern.createPattern.factoryPattern.simple;

import com.learning.pattern.factoryPattern.simple.Operation;

/**
 * 操作-加法
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getValue1() + getValue2();
    }
}
