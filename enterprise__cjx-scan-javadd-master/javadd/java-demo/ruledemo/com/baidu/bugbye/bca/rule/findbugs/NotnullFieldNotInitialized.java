package com.baidu.bugbye.bca.rule.findbugs;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzhiwang on 2019/2/15.
 */
public class NotnullFieldNotInitialized {

    @Nonnull
    static Object a;

    @Nonnull
    static Object b;

    @Nonnull
    Object x;

    @Nonnull
    Object y;

    @Nonnull
    List list = new ArrayList();

    String str;

    //    bad
    static {
        a = "a1";
    }

    //    //    good
    NotnullFieldNotInitialized() {
        x = "a2";
        y = "a";
    }

    //    bad
    NotnullFieldNotInitialized(String c) {
        a = "b";
        x = null;
    }


    NotnullFieldNotInitialized(String c, String a) {
        this.a = "a";
        this.b = "b";
        this.x = null;
        this.y = "11";
    }


    //    good
    NotnullFieldNotInitialized(int z) {
        this();
    }

    //        bad
    NotnullFieldNotInitialized(double z) {
        this("11111");
    }

    NotnullFieldNotInitialized(float z) {
        test();
        testA();
    }

    void test() {
        this.a = "a";
        this.b = "b";
        this.x = "X";
    }

    void testA() {
        this.y = "11";
    }
}
