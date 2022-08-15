package com.baidu.bugbye.bca.rule;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.os.Build;

public class ApiCompatiable {

    @TargetApi(15)
    public void good1() {
        ActionBar actionBar = this.getActionBar();
        int sdkInt = Build.VERSION.SDK_INT;
        if (sdkInt >= 11) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void good2() {
        ActionBar actionBar = this.getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @TargetApi(15)
    public void bad1() {
        ActionBar actionBar = this.getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private ActionBar getActionBar() {
        Object a = null;
        return (ActionBar) a;
    }


}
