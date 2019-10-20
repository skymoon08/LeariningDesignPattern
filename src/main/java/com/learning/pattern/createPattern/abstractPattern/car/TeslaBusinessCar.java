package com.learning.pattern.createPattern.abstractPattern.car;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;
import com.learning.pattern.createPattern.abstractPattern.TeslaCar;

/**
 * @author zhanghua
 */
public class TeslaBusinessCar implements TeslaCar {


    @Override
    public void charge() {
        System.out.println("不用给我特斯拉商务车冲满电");
    }
}
