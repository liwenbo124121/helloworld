package com.baidu.bugbye.bca.rule.customization;

import android.text.TextUtils;

public class UtilStaticMethodArgCheckNull {

    public static void bad1(Object o) {
        o.toString();
    }

    public static void good1(Object o) {
        if (o != null) {
            o.toString();
        }
    }

    public static void good2(String str) {
        if (TextUtils.isEmpty(str)) {
            str.toLowerCase();
        }
    }

    public static void good3(Object o) {
        bad1(o);
    }
}
