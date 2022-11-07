package com.baidu.bugbye.bca.rule;

import java.util.Random;

public class AbsoluteValue {

    public int bad1(Double accountId) {
        int index = Math.abs(accountId.hashCode());
        return index;
    }

    public int bad2(Float accountId) {
        int key = accountId.hashCode();
        int index = Math.abs(key);
        return index;
    }

    public boolean bad3() {
        Random random = new Random();

        String logid = String.valueOf(Math.abs(random.nextLong()));
        if (logid.length() > 10) {
            return true;
        }
        return false;
    }

    public boolean bad4() {
        Random random = new Random();

        String logid = String.valueOf(Math.abs(random.nextInt()));
        if (logid.length() > 10) {
            return true;
        }
        return false;
    }
}
