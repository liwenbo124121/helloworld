package com.baidu.bugbye.bca.rule;

public class ParseCheck {

    public void good1() {
        try {
            String s = "3";
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            System.out.println();
        }
    }

    public void good2() throws NumberFormatException {
        String s = "3";
        Float.parseFloat(s);
    }

    public void bad() {
        String s = "3";
        Float.parseFloat(s);
    }

}
