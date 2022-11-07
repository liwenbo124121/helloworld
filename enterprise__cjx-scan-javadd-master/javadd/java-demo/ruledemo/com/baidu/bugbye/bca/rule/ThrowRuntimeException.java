package com.baidu.bugbye.bca.rule;


public class ThrowRuntimeException {

    public void good1() {
        try {
            throw new IllegalArgumentException("Invalid parameter!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            supporter1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void good2() throws Exception {
        throw new IllegalArgumentException("Invalid parameter!");
    }

    public void bad1() {
        supporter1();
    }

    private void supporter1() {
        throw new IllegalArgumentException("Invalid parameter!");
    }

}
