package com.baidu.bugbye.bca.rule;

import java.util.ArrayList;
import java.util.List;

public class ListGetJudgeIndex {


    public void good1() {
        List target = new ArrayList<String >();
        int index = this.getIndex();
        if(index > 0){
            return;
        }
        target.get(index);
    }

    public void bad() {
        List target = new ArrayList<String >();
        int index = this.getIndex();
        target.get(index);
    }

    private int getIndex() {
        return 0;
    }
}
