package com.baidu.bugbye.bca.rule.findbugs;

import javax.annotation.Nonnull;

/**
 * Created by lvzhiwang on 2019/2/21.
 */
public class NonNullReturnViolation {


   /* @Nonnull
    public String bad1() {
        String name = null;
        int a = 10;
        if (a > 12) {
            name = "asd";
        }
        return name;
    }

    @Nonnull
    public String bad2(int a) {
        String name = null;
        String str = "1232";

        if (a > 10) {
            name = "123";
        }
        if (a < 10) {
            name = str;
        }
        return name;
    }

    @Nonnull
    public String good1(int a) {
        String name = null;
        String str = "1232";

        if (a > 10) {
            name = "123";
        } else {
            name = str;
        }
        return name;
    }

    @Nonnull
    public String bad3() {
        String name = null;
        int a = 10;
        if (a > 12) {
            String name2 = null;
            name = "asd";
        }
        return name;
    }

    @Nonnull
    public String good2() {
        String name = null;
        int a = 10;
        if (a > 12) {
            String name2 = null;
            name = "asd";
            return name;
        }
        return "123";
    }

    @Nonnull
    public String good3() {
        String name = null;
        int a = 10;
        if (a > 12) {
            String name2 = null;
            name = "asd";
            return name;
        }
        name = "123";
        return name;
    }*/
}
