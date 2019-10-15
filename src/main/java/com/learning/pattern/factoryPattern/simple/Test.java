package com.learning.pattern.factoryPattern.simple;


public class Test {

    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(1);
        operationAdd.setValue1(2);
        System.out.println(operationAdd.getResult());
    }
}
