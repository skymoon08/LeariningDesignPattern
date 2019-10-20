package com.learning.pattern.createPattern.abstractPattern.car;

import com.learning.pattern.createPattern.abstractPattern.BenzCar;
import com.learning.pattern.createPattern.abstractPattern.TeslaCar;

/**
 * @author zhanghua
 */
public class TeslaSportCar implements TeslaCar {


    @Override
    public void charge() {
        System.out.println("给我特斯拉跑车冲满电");
    }

}
