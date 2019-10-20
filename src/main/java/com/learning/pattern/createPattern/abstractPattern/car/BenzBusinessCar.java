package com.learning.pattern.createPattern.abstractPattern.car;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;

public class BenzBusinessCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给商务奔驰加油");
    }
}
