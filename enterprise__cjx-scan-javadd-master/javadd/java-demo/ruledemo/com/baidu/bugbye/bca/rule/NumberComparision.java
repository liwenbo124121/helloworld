package com.baidu.bugbye.bca.rule;

import java.util.ArrayList;
import java.util.List;

public class NumberComparision {

    public void good1() {
        List list = new ArrayList();
        if (list.size() > 1) {
            int a;
            // do something
        }
    }

    public void good2() {
        List list = new ArrayList();
        if (0 < list.size()) {
            int a;
            // do something
        }
    }

    public void bad1() {
        List list = new ArrayList();
        if (list.size() >= 0) {
            int a;
            // do something
        }
    }

    public void bad2() {
        List list = new ArrayList();
        if (0 <= list.size()) {
            int a;
            // do something
        }
    }

    class Num {

        int val = 1;

        public long getSizes() {
            List list = new ArrayList();
            return list.size();
        }

        public long getLengths() {
            return val;
        }
    }

    public void good3(Num num) {
        if (num.getLengths() < 0 || num.getSizes() < 0) {
            System.out.println("=======");
        }
    }

}
