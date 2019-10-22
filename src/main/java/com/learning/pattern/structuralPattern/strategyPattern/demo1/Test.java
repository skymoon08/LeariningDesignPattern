package com.learning.pattern.structuralPattern.strategyPattern.demo1;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        UserPayService strategy = new VipPayService();
        BigDecimal quote = strategy.quote(new BigDecimal(300));
        System.out.println("普通会员商品的最终价格为：" + quote.doubleValue());

        strategy = new SuperVipPayService();
        quote = strategy.quote(new BigDecimal(200));
        System.out.println("超级会员商品的最终价格为：" + quote.doubleValue());
    }
}
