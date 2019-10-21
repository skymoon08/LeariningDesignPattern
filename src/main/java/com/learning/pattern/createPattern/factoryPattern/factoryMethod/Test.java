package com.learning.pattern.createPattern.factoryPattern.factoryMethod;


import com.learning.pattern.createPattern.factoryPattern.simple.Operation;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operationAdd = factory.CreateOption();
        operationAdd.setValue1(10);
        operationAdd.setValue2(20);

        System.out.println(operationAdd.getResult());
    }
}
