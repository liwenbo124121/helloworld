package com.baidu.bugbye.bca.rule;

public class EqualsNullArg {

    public boolean bad1(String str) {
        if (str.equals(null)) {
            return true;
        }
        return false;
    }

    public boolean bad2(String str) {
        String str1 = null;
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }

    public boolean bad3(String str) {
        String str1 = "123";
        str1 = null;
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }

    public boolean good1(String str) {
        String str1 = null;
        str1 = "123";
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }
}
