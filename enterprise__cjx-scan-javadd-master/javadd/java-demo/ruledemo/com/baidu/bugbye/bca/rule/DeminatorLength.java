package com.baidu.bugbye.bca.rule;

public class DeminatorLength {

    public void good1() {
        int a = 4;
        a++;
        if (a != 0) {
            int b = 100 % a;
        }
        if (getNum() != 0) {
            int c = a % getNum();
        }
    }

    public void good2() {
        int a = 4;
        int b = a / 5;
    }

    public void good3() {
        int a = 2;
        int b = 100 % a;
    }

    public void bad1() {
        int b = 100 % getNum();
    }

    private int getNum() {
        return 0;
    }

}
