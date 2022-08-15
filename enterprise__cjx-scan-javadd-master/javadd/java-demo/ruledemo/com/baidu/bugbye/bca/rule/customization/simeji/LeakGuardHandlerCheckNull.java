package com.baidu.bugbye.bca.rule.customization.simeji;

import com.baidu.bugbye.bca.rule.customization.simeji.utils.LeakGuardHandlerWrapper;

public class LeakGuardHandlerCheckNull extends LeakGuardHandlerWrapper {

    public Object my;
    public String myName;

    public void bad1() {
        my = getOwnerInstance();
    }

    public void good1() {
        my = getOwnerInstance();
        if (my == null) {
            return;
        }
        myName = my.toString();
    }

    public void good2() {
        my = getOwnerInstance();
        if (my != null) {
            myName = my.toString();
        }
        myName = "null";
    }
}
