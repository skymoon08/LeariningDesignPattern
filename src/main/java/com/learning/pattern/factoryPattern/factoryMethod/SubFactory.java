package com.learning.pattern.factoryPattern.factoryMethod;

import com.learning.pattern.factoryPattern.simple.Operation;
import com.learning.pattern.factoryPattern.simple.OperationDiv;
import com.learning.pattern.factoryPattern.simple.OperationSub;

public class SubFactory implements IFactory{

    @Override
    public Operation CreateOption() {
        return new OperationSub();
    }

}
