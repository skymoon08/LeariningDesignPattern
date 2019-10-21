package com.learning.pattern.structuralPattern.strategyPattern;

import java.math.BigDecimal;

public interface UserPayService {

    public BigDecimal quote(BigDecimal orderPrice);

}
