package com.baidu.bugbye.bca.rule;

public class SelfAssignment {
    private int x;

    public void bad1() {
        x = x;
    }

    public void bad2(int x) {
        x = x;
    }

    public void good1(int x) {
        this.x = x;
    }

    public void good2(int x) {
        x += x;
    }
}
