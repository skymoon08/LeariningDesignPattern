package com.learning.pattern.createPattern.factoryPattern.factoryMethod;


import com.learning.pattern.createPattern.factoryPattern.simple.Operation;
import com.learning.pattern.createPattern.factoryPattern.simple.OperationDiv;

public class DivFactory implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationDiv();
    }

}
