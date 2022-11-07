package com.baidu.bugbye.bca.rule;

public class StringIndex {

    public String bad1(String s) {
        return s.substring(3, 2);
    }

    public String bad2(String s) {
        int min = 3, max = 2;
        return s.substring(min, max);
    }

    public CharSequence bad3(String s) {
        return s.subSequence(3, 2);
    }

    public CharSequence bad4(String s) {
        int min = 3, max = 2;
        return s.subSequence(min, max);
    }

    public String bad5() {
        String s = "123";
        return s.substring(4);
    }

    public String bad6() {
        String s = "123";
        int max = 4;
        return s.substring(max);
    }

    public char bad7() {
        String s = "123";
        return s.charAt(4);
    }

    public char bad8() {
        String s = "123";
        int max = 4;
        return s.charAt(max);
    }

    public int bad9() {
        String s = "123";
        return s.codePointAt(4);
    }

    public int bad10() {
        String s = "123";
        int max = 4;
        return s.codePointAt(max);
    }

    public String good1(String s) {
        return s.substring(2, 3);
    }

    public String good2(String s) {
        int min = 2, max = 3;
        return s.substring(min, max);
    }

    public CharSequence good3(String s) {
        return s.subSequence(2, 3);
    }

    public CharSequence good4(String s) {
        int min = 2, max = 3;
        return s.subSequence(min, max);
    }

    public String good5() {
        String s = "123";
        return s.substring(3);
    }

    public String good6() {
        String s = "123";
        int max = 3;
        return s.substring(max);
    }
}
