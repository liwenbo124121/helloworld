package com.baidu.bugbye.bca.rule.findbugs;

/**
 * Created by lvzhiwang on 2019/2/27.
 */
public class OperatorPriorityConfusion {

    public int bad1(int i) {
        int a = i % 60 * 1000;
        return a;
    }


    public int bad2(int i) {
        int a = 60;
        int b = 1000;
        int c = i % a * b;
        return c;
    }

    public int good(int i) {
        int a = (i % 60) * 1000;
        return a;
    }
}
