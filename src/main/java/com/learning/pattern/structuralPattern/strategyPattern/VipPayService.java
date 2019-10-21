package com.learning.pattern.structuralPattern.strategyPattern;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class VipPayService implements UserPayService, InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //该用户超级会员刚过期并且尚未使用过临时折扣
        if (true) {
            System.out.println("临时折扣使用次数更新");
            new BigDecimal(0.8);
        }
        return new BigDecimal(0.9);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("Vip",this);
    }
}
