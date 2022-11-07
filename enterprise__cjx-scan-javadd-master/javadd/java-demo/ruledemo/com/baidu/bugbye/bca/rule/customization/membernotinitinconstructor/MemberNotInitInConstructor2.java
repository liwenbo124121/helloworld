package com.baidu.bugbye.bca.rule.customization.membernotinitinconstructor;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by lvzhiwang on 2019/3/19.
 */
public class MemberNotInitInConstructor2 extends Activity {

    private ArrayList list;
    private ArrayList list2;

    public MemberNotInitInConstructor2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList();
        init();
    }

    private void init() {
        list2 = new ArrayList();
        System.out.println(list2);
    }

    public void getActivity() {
        System.out.println(list2.get(0));
    }
}
