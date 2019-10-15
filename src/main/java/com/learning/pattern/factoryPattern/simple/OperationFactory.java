package com.learning.pattern.factoryPattern.simple;

/**
 * 简单工厂类
 */
public class OperationFactory {

    public static Operation createOperation(String opType) {
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

