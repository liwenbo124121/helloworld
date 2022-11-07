package com.baidu.bugbye.bca.rule;

public class SelfComputation {

    public void bad1() {
        int i = 0;
        int j = i & i;
        j = i | i;
    }

    public void bad2() {
        int i = getInt() | getInt();
    }

    private int getInt() {
        return 1;
    }
}
