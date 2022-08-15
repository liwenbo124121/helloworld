package com.baidu.bugbye.bca.rule;

public class SubStringLength {

    private String str = "string";


    private void good11() {
        if (str.contains("1")) {
            str.substring(str.lastIndexOf('1'));
        }
    }

    private void bad11() {
        str.substring(str.lastIndexOf('1'));
        str.substring(str.indexOf('1'));
    }

    private void good12() {
        if (str.contains("1")) {
            str.substring(str.lastIndexOf('1'), str.lastIndexOf('1', 1));
            str.substring(str.indexOf('1', 2));
        }
    }

    private void bad12() {
        str.substring(str.lastIndexOf('1'), str.lastIndexOf('1', 1));
        str.substring(str.indexOf('1', 2));
    }

    private void good2() {
        if (str.length() > 10) {
            str.substring(str.lastIndexOf('1') - 1);
            str.substring(str.lastIndexOf('1') - 5);
        }
    }

    private void bad2() {
        str.substring(str.lastIndexOf('1') - 1);
        str.substring(str.lastIndexOf('1') - 5);
    }

    private void good3() {
        String a = str.length() > 5 ? str.substring(0, str.length() - 5) : str;
    }

    private void bad3() {
        String b = "b";
        String a = b.length() > 1 ? str.substring(0, str.length() - 5) : str;
    }

    private void good4() {
        String a = str.substring(2, 4);
    }

    private void bad4() {
        String a = str.substring(-1, -2);
    }

    private void good5() {
        int i = 1;
        if (i > 0) {
            str.substring(i);
        }
    }

    private void bad5() {
        int i = 1;
        str.substring(i);
    }

    private void good6() {
        for (int i = 0; i < 10; i = i + 2) {
            str.substring(i);
            int j = 9;
        }
        for (int i = 0; i < 10; i = i + 2) {
            str.substring(i, i);
        }
    }
}
