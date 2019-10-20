package com.learning.pattern.createPattern.factoryPattern.simple;

import com.learning.pattern.factoryPattern.simple.Operation;
import com.learning.pattern.factoryPattern.simple.OperationAdd;
import com.learning.pattern.factoryPattern.simple.OperationDiv;
import com.learning.pattern.factoryPattern.simple.OperationMul;
import com.learning.pattern.factoryPattern.simple.OperationSub;

/**
 * 简单工厂类
 */
public class OperationFactory {

    public static com.learning.pattern.factoryPattern.simple.Operation createOperation(String opType) {
        Operation oper = null;
        switch (opType) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
            case "/":
                oper = new OperationDiv();
            default:
                throw new UnsupportedOperationException("无法运算");
        }
        return oper;
    }
}

