package com.baidu.bugbye.bca.rule.findbugs;

import javax.annotation.Nonnull;

/**
 * Created by lvzhiwang on 2019/2/22.
 */
public class NonNullParamViolation {

    public void bad() {
        Object two = null;
        for (int i = 0; i < 5; i++) {
            if (i != 2) {
                two = "12";
//                good
                getTwo(two);
            } else {
//                bad
                getTwo(two);
            }
        }

//        bad
        getTwo(two);
    }

    public void getTwo(@Nonnull Object x) {
    }

}
