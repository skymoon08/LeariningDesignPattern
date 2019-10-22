package com.learning.pattern.structuralPattern.strategyPattern.demo1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author zhanghua
 */
@Service
public class ParticularlyVipPayService implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //消费金额大于30元
        if (orderPrice.compareTo(new BigDecimal(30)) > 0) {
            return new BigDecimal(0.7);
        }
        return new BigDecimal(0);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("ParticularlyVip", this);
    }
}
