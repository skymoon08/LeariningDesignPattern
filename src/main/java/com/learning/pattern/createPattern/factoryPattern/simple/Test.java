package com.learning.pattern.createPattern.factoryPattern.simple;


import com.learning.pattern.factoryPattern.simple.Operation;
import com.learning.pattern.factoryPattern.simple.OperationFactory;

public class Test {

    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(1);
        operationAdd.setValue1(2);
        System.out.println(operationAdd.getResult());
    }
}
