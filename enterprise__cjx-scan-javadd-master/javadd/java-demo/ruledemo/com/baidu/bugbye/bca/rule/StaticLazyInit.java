package com.baidu.bugbye.bca.rule;

import java.util.Objects;

public class StaticLazyInit {
    private static Object toInit;
    private static Object toInit2;
    private static String string;

    public static Object bad1() {
        if (toInit == null) {
            toInit = "init";
            toInit.toString();
            StaticLazyInit.toInit2 = "init2";
            StaticLazyInit.toInit2.toString();
        }
        return toInit;
    }

    public static Object bad2() {
        if (toInit == null) {
            toInit = "init";
            toInit.toString();
            StaticLazyInit.toInit2 = "init2";
            StaticLazyInit.toInit2.toString();
        }
        return toInit;
    }

    public static Object bad3() {
        if (toInit == null) {
            toInit = "init";
            toInit.toString();
            StaticLazyInit.toInit2 = "init2";
            StaticLazyInit.toInit2.toString();
        }
        return toInit;
    }

    public static Object bad4() {
        if (toInit == null) {
            toInit = "init";
            Objects.equals(toInit, toInit);
        }
        return toInit;
    }

    public static Object good1() {
        if (toInit == null) {
            toInit = "init";
        }
        return toInit;
    }

    public static synchronized Object good2() {
        if (toInit == null) {
            toInit = "init";
        }
        return toInit;
    }

    public static Object good3() {
        if (string == null) {
            string = "init";
        }
        return string;
    }

}
