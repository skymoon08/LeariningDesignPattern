package com.learning.pattern.structuralPattern.strategyPattern.demo2;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return super.acceptCash(money);
    }
}
