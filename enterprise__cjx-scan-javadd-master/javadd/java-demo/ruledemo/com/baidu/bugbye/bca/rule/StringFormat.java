package com.baidu.bugbye.bca.rule;

import java.util.Locale;

public class StringFormat {
    public void bad1() {
        String.format("%s%s", "str");
        String.format(Locale.CHINA, "%s%s", "str");
    }

    public void bad2() {
        String[] array = new String[1];
        Object obj = new Object();
        String.format("%s%d", "str", array);
        String.format("%s%d", "str", "1");
        String.format("%s%d", "str", obj);
        String.format("%.1f%% (%tc/%d)", 1f, 1, 1);
        String.format("Progress %d from %d (%2.0f%%)", 1, 1, 1);
    }

    public void bad3() {
        String[] array = new String[0];
        String.format("%s", array);
    }

    public void good1() {
        String[] s = new String[2];
        String.format("%s%d", s);
        String.format("%s%d", new String[2]);
        String.format("%f", new Float(1.1));
        String.format("%.1f%% (%d/%d)", 1f, 1, 1);
    }
}
