package com.baidu.bugbye.bca.rule.customization.simeji;

import com.baidu.bugbye.bca.rule.customization.simeji.utils.NoProguard;

public class BeanWithoutNoProguard {

    class Bad1Bean {

    }

    @NoProguard
    class Good1Bean {

    }
}
