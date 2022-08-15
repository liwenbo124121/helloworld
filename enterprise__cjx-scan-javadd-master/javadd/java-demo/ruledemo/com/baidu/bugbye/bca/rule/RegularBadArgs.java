package com.baidu.bugbye.bca.rule;

import java.io.File;
import java.util.regex.Pattern;

public class RegularBadArgs {
    public void bad1(String str) {
        str.split("|");
        str.matches("|");
        str.replaceFirst("|", "||");
        str.replaceAll("|", "||");
    }

    public void bad2(String str) {
        str.split(".");
        str.matches(".");
        str.replaceFirst(".", "||");
        str.replaceAll(".", "||");
    }

    public void bad3(String any1) {
        any1.split(File.separator);
    }

    void bad4() {
        Pattern.compile(File.separator);
    }
}
