package com.baidu.bugbye.bca.rule;

public class ArrayIndexOutOfBounds {

    public void good1() {
        int i = 0;
        i++;
        String[] strArr = {"e1", "e2"};
        int idx = getIndex();
        if (idx >= 0 && idx < strArr.length) {
            System.out.println(strArr[idx]);
        }
    }

    public void bad() {
        String[] strArr = {"e1", "e2"};
        int idx = getIndex();
        System.out.println(strArr[idx]);
    }

    public void stage1() {
        String[] a = {"a", "b"};
        for (int i = 0; i < 2; i++) {
            String in = a[i];
        }
    }

    private int getIndex() {
        return 1;
    }
}
