package com.baidu.bugbye.bca.rule.flow;

public class SwitchCase {

    public void test1() {
        int a = 0;
        {
            int b = 0;
        }
        Object obj = null;
        switch (a) {
            case 1:
                obj.equals("1");
                break;
            case 2: {
                obj.equals("2a");
            }
            obj.equals("2b");
            case 3: {
                obj.equals("3a");
            }
            {
                obj.equals("3b");
            }
            default:
                obj.equals("default");
        }
    }

}
