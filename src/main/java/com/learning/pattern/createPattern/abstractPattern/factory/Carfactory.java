package com.learning.pattern.createPattern.abstractPattern.factory;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;
import com.learning.pattern.createPattern.abstractPattern.TeslaCar;

public interface Carfactory {

    public BenzCar getBenzCar();

    public TeslaCar getTeslaCar();

}
