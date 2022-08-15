package com.baidu.bugbye.bca.rule;

import com.baidu.bugbye.bca.supporter.ReturnNullInvocationSupporter;

public class ReturnNullInvocation {

    public void good1() {
        ReturnNullInvocationSupporter temp = new ReturnNullInvocationSupporter();
        Object object = temp.getObject();
        if (object != null) {
            object.toString();
        }
    }

    public void good2() {
        ReturnNullInvocationSupporter temp = new ReturnNullInvocationSupporter();
        if (temp.getObject() != null) {
            temp.getObject().toString();
        }
    }

    public void bad1() {
        ReturnNullInvocationSupporter temp = new ReturnNullInvocationSupporter();
        Object object = temp.getObject();
        object.toString();
    }

    public void bad2() {
        ReturnNullInvocationSupporter temp = new ReturnNullInvocationSupporter();
        temp.getObject().toString();
    }

    public void bad3() {
        ReturnNullInvocationSupporter temp = new ReturnNullInvocationSupporter();
        Object object = temp.getObject();
        String str = (String) object;
    }


}
