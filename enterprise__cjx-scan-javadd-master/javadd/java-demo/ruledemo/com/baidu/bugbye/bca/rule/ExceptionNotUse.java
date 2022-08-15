package com.baidu.bugbye.bca.rule;

public class ExceptionNotUse {
    public void bad1() {
        new Exception("error");
    }

    public void bad2() {
        Exception e = new Exception();
    }

    public void good1() throws Exception {
        Exception e = new Exception();
        throw e;
    }

    public void good2() throws Exception {
        throw new Exception();
    }
}
