package com.baidu.bugbye.bca.rule;

import java.util.ArrayList;
import java.util.List;

public class DowncastToArray {

    public void good1() {
        List<String> list = new ArrayList<>();
        String[] array = (String[]) list.toArray(new String[0]);
    }

    public void good2() {
        String[] array = (String[]) getArray();
    }

    private Object[] getArray() {
        String[] r = new String[]{"a"};
        return r;
    }

    public void bad1() {
        List<String> list = new ArrayList<>();
        String[] array = (String[]) list.toArray();
    }


}
