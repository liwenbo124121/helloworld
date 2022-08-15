package com.baidu.bugbye.bca.rule;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeArgument {
    public void good1() {
        List<String> stringList = new ArrayList<String>();
        String string = "";
        stringList.remove(string);
    }

    public void good2() {
        List stringList = new ArrayList<String>();
        Integer integer = 1;
        stringList.remove(integer);
    }

    public void good3() {
        List stringList = new ArrayList<String>();
        Object object = new Object();
        stringList.remove(object);
    }

    public void good4() {
        List<Long> a = new ArrayList<Long>();
        a.add(new Long(1L));
        a.remove(1L);
        int b = 0;
    }

    public void bad1() {
        List<String> stringList = new ArrayList<String>();
        Integer integer = 1;
        stringList.remove(integer);
    }
}
