package com.baidu.bugbye.bca.rule;

import android.view.LayoutInflater;
import com.baidu.bugbye.bca.supporter.R;

public class BigResource {

    /**
     * use android resource
     */
    public void good1() {
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(android.R.drawable.alert_dark_frame, null);
    }

    /**
     * user normal resource
     */
    public void good2() {
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.drawable.goodResource, null);
    }

    /**
     * use big resource
     */
    public void bad1() {
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.drawable.bigResource, null);
    }

    private LayoutInflater getLayoutInflater() {
        Object r = null;
        return (LayoutInflater) r;
    }

}
