package com.baidu.bugbye.bca.rule;

import java.util.Date;

public class DateCastInt2Long {
    public Date bad1(int time) {
        Date date = new Date(time * 1000);
        return date;
    }

    public Date bad2(int time) {
        Date date = new Date(time);
        return date;
    }

    public Date bad3() {
        Date date = new Date(123);
        return date;
    }

    public Date good1(int time) {
        Date date = new Date(time * 1000L);
        return date;
    }

    public Date good2() {
        Date date = new Date(123L);
        return date;
    }
}
