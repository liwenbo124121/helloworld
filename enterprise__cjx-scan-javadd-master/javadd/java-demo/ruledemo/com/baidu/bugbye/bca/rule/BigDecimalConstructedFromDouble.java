package com.baidu.bugbye.bca.rule;

import java.math.BigDecimal;

public class BigDecimalConstructedFromDouble {

    public BigDecimal bad1() {
        BigDecimal result = new BigDecimal(0.1);
        return result;
    }

    public BigDecimal bad2() {
        float f = 0.1f;
        BigDecimal result = new BigDecimal(f);
        return result;
    }

    public BigDecimal bad3() {
        double d = 0.1d;
        BigDecimal result = new BigDecimal(d);
        return result;
    }

    public BigDecimal bad4() {
        Float f = Float.valueOf("0.1");
        BigDecimal result = new BigDecimal(f);
        return result;
    }

    public BigDecimal bad5() {
        Double d = Double.valueOf("0.1");
        BigDecimal result = new BigDecimal(d);
        return result;
    }

    public BigDecimal good1() {
        BigDecimal result = BigDecimal.valueOf(0.1);
        return result;
    }

    public BigDecimal good2() {
        BigDecimal result = new BigDecimal("0.1");
        return result;
    }
}
