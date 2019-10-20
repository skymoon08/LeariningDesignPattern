package com.learning.pattern.createPattern.abstractPattern.factory;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;
import com.learning.pattern.createPattern.abstractPattern.TeslaCar;
import com.learning.pattern.createPattern.abstractPattern.car.BenzSportCar;
import com.learning.pattern.createPattern.abstractPattern.car.TeslaSportCar;

public class SportCarFactory implements CarFactory {

    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
