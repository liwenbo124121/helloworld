package com.baidu.bugbye.bca.rule.flow;

public class NullArgument {

    public void good1() {
        referenceWithCheck(null);
    }

    public void bad1() {
        reference(null);
    }

    private void reference(Object object) {
        object.toString();
    }

    private void referenceWithCheck(Object object) {
        if (null != object) {
            object.toString();
        }
    }
}
