package com.baidu.bugbye.bca.rule;

public class RepeatCondition {
    public void good1() {
        int i = 0;
        int j = 0;
        if ((j == 0 && i > 0) || (j == 0 && i == 0)) {
            return;
        }
    }

    public void bad1() {
        int i = 0;
        if (i == 0 || i == 0) {
            return;
        }
    }

    public void bad2() {
        int i = 0;
        int j = 0;
        if (i == 0 || j == 0 && i == 0) {
            return;
        }
    }

    public void bad3() {
        int i = 0;
        int j = 0;
        if ((j + i) == (j + i)) {
            i = 1;
        }
        if ((i - j) != (i - j)) {
            j = 1;
        }
    }
}
