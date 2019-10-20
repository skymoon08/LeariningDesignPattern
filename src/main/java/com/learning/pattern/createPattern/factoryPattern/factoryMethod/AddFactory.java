package com.learning.pattern.createPattern.factoryPattern.factoryMethod;

import com.learning.pattern.factoryPattern.factoryMethod.IFactory;
import com.learning.pattern.factoryPattern.simple.Operation;
import com.learning.pattern.factoryPattern.simple.OperationAdd;

public class AddFactory  implements IFactory {

    @Override
    public Operation CreateOption() {
        return new OperationAdd();
    }

}
