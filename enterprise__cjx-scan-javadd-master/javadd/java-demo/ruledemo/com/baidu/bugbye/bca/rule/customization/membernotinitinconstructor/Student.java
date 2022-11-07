package com.baidu.bugbye.bca.rule.customization.membernotinitinconstructor;

/**
 * Created by lvzhiwang on 2019/3/15.
 */
public class Student {

    public Person person;

    public int no;


    public void bad1() {
        // bad
        person.getName();
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNo(int no) {
        this.no = no;
    }


    public Person getPerson() {
        return person;
    }

    public int getNo() {
        return no;
    }


    public void info() {
        System.out.println("111111");
    }


}
