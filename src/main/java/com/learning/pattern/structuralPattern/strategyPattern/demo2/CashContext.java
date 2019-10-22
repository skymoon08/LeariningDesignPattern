package com.learning.pattern.structuralPattern.strategyPattern.demo2;

public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double moneny) {
        return cashSuper.acceptCash(moneny);
    }

}
