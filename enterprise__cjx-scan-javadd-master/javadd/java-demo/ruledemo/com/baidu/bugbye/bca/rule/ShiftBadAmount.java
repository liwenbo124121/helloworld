package com.baidu.bugbye.bca.rule;

public class ShiftBadAmount {

    int bad1(int any) {
        return any >> 32;
    }

    int bad11(Integer any) {
        return any >> 32;
    }

    long bad2(long any) {
        return any >> 64;
    }

    int bad3() {
        return getInteger() >> 32;
    }

    long bad4() {
        return getLong() >> 64;
    }

    long bad5() {
        return (long) getInt() >> 64;
    }

    int bad6() {
        int i = 32;
        return getInt() >> i;
    }

    long bad7() {
        int i = 64;
        return (long) getInt() >> i;
    }

    int getInt() {
        return 1;
    }

    Integer getInteger() {
        return 1;
    }

    long getLong() {
        return 1l;
    }
}
