package com.baidu.bugbye.bca.rule;

public class ReturnValueIgnored {
    public void bad1() {
        String a = "";
        a.trim();
        a.substring(0);
    }
}
