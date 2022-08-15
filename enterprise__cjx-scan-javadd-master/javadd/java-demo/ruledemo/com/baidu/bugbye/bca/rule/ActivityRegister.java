package com.baidu.bugbye.bca.rule;

import android.content.Intent;
import com.baidu.bugbye.bca.supporter.ActivityRegisterSupporter1;
import com.baidu.bugbye.bca.supporter.ActivityRegisterSupporter2;

public class ActivityRegister {

    public void good1() {
        Intent intent = new Intent();
        intent.putExtra("intentkey", "the message from main activity");
        intent.setClass(null, ActivityRegisterSupporter1.class);
    }

    public void bad1() {
        Intent intent = new Intent();
        intent.putExtra("intentkey", "the message from main activity");
        intent.setClass(null, ActivityRegisterSupporter2.class);
    }

}
