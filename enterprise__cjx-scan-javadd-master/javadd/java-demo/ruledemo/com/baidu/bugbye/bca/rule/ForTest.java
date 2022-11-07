package com.baidu.bugbye.bca.rule;

import android.support.v4.app.FragmentActivity;

public class ForTest {
    public FragmentActivity getTemp() {
        return null;
    }

    public void stopService() {
        FragmentActivity t = getTemp();
        t.stopService(null);
    }
}
