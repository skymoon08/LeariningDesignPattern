package com.learning.pattern.structuralPattern.strategyPattern.demo1;

import java.math.BigDecimal;

public interface UserPayService {

    public BigDecimal quote(BigDecimal orderPrice);

}
