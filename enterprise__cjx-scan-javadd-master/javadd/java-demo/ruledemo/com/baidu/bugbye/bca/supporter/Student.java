package com.baidu.bugbye.bca.supporter;

/**
 * Created by zhangquan07 on 18/1/29.
 */

public class Student {
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        String a = "say something";
    }

    private void _say() {
        String a = "inner say";
    }
}
