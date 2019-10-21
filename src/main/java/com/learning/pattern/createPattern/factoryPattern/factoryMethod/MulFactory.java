package com.learning.pattern.createPattern.factoryPattern.factoryMethod;


import com.learning.pattern.createPattern.factoryPattern.simple.Operation;
import com.learning.pattern.createPattern.factoryPattern.simple.OperationMul;

public class MulFactory implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationMul();
    }

}
