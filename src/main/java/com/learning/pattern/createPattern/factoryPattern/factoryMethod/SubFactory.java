package com.learning.pattern.createPattern.factoryPattern.factoryMethod;


import com.learning.pattern.createPattern.factoryPattern.simple.Operation;
import com.learning.pattern.createPattern.factoryPattern.simple.OperationSub;

public class SubFactory implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationSub();
    }

}
