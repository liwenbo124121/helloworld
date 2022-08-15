package com.baidu.bugbye.bca.rule.customization;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by lvzhiwang on 2019/3/13.
 */
public class GenericsCastToBoolean<K> {
    public <T, S> S getObject(T a, S s) {
        return null;
    }


    public boolean bad() {
        boolean re = getObject("111", null);
        return re;
    }


    public boolean good1() {
        boolean s = false;
        if (getObject("222", null) instanceof Boolean) {
            System.out.println("12323");
            boolean s1 = getObject("222", null);
        }

        return s;
    }

    public boolean good2() {
        boolean s = false;
        if (getObject("222", null) instanceof Boolean) {
            System.out.println("12323");
            s = getObject("222", null);
        }

        return s;
    }


    public Integer good3() {
        Integer s = getObject("111", null);
        return s;
    }

    public boolean good4() {
        Object s = getObject("111", null);
        System.out.println(s);
        return false;
    }

    public void good5(Map map) {
        Iterator<Boolean> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            boolean isSys = iterator.next();
            System.out.println(isSys);

        }
    }

    public boolean bad3() {
        boolean b = getObject(null, true);
        return b;
    }

}
