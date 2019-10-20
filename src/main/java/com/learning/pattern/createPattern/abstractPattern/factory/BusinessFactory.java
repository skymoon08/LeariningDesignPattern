package com.learning.pattern.createPattern.abstractPattern.factory;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;
import com.learning.pattern.createPattern.abstractPattern.TeslaCar;
import com.learning.pattern.createPattern.abstractPattern.car.BenzBusinessCar;
import com.learning.pattern.createPattern.abstractPattern.car.TeslaBusinessCar;

public class BusinessFactory implements Carfactory {

    @Override
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaBusinessCar();
    }
}
