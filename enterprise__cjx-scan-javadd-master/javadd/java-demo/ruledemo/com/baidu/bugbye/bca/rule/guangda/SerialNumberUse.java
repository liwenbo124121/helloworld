package com.baidu.bugbye.bca.rule.guangda;

import java.math.BigInteger;

public class SerialNumberUse {

    public void bad1() {
        double d = 1234567890123456.00;
    }

    public void bad2() {
        float f = 1234567890123456.3f;
    }

    public void bad3() {
        long l = 1234567890123456L;
    }

    public void bad4() {
        BigInteger sum = new BigInteger("1234567890123456");
    }

    public void bad5() {
        test(1234567890123456L);
    }

    public void bad6() {
        long l = 123456789012345678L;
    }

    public void bad7() {
        long l = 1234567890123456789L;
    }


    public void good1() {
        long l = 12345678901234567L;
    }

    public void good2() {
        String s = "12345678901234567890";
    }

    public void good3() {
        float f = 12345678901234567.3f;
    }

    public void good4() {
        float f = 12345678901234567890.3f;
    }

    public int test(long l) {
        return (int) l;
    }
}
