package com.baidu.bugbye.bca.rule.findbugs;

import com.baidu.bugbye.bca.rule.findbugs.innerpackage1.Dog;
import com.baidu.bugbye.bca.rule.findbugs.innerpackage2.Food;

public class ExtendsWrongPackage extends Dog {

    // bad override, FindBugs: NM_WRONG_PACKAGE
    public int f(Food food) {
        return 42;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}