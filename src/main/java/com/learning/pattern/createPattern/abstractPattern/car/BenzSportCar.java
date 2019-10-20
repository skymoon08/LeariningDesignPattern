package com.learning.pattern.createPattern.abstractPattern.car;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;

public class BenzSportCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给运动型奔驰加油！");
    }
}
