package com.learning.pattern.structuralPattern.strategyPattern.demo2;

public class CashRebate extends CashSuper {

    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}