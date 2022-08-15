package com.baidu.bugbye.bca.rule.customization.membernotinitinconstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzhiwang on 2019/3/15.
 */
public class MemberNotInitInConstructor extends Student {

    private String str = "string";
    private Student student;

    private List list = new ArrayList();

    private int age;

    public MemberNotInitInConstructor(int age) {
        this.age = age;
    }

    public MemberNotInitInConstructor(Student student) {
        this.student = student;
    }

    public MemberNotInitInConstructor(Student student, int age) {
        this.student = student;
        this.age = age;
    }

    public void bad1() {
        student.getNo();
    }

    public void bad2(String string) {
        person.getName();
    }


    public void good1() {
        if (student != null) {
            student.getNo();
        }
    }


    public void good2() {
        if (student == null) {
            return;
        }
        student.getNo();
    }


    public void good3() {
        student = new Student();
        student.getNo();
    }

    public void bad3() {
        setPerson(new Person());
        student.getNo();
    }

    public void goo4() {
        setPerson(new Person());
        person.getName();
    }

    public class DoHomeWork implements DoJob {


        @Override
        public void fillBlank(int a, int b, int result) { // bad
            student = new Student();
            student.getNo();
        }

    }

    public void good5() {
        list.get(0);
    }


    public void good6() {
        if (student == null) {
            student = new Student();
        }
        student.getNo();
    }


    private void good7() {
        if (str.contains("1")) {
            str.substring(str.lastIndexOf('1'));
        }
    }

    private String staticMember;

    public void setStaticMember(String staticMember) {
        this.staticMember = staticMember;
    }

    public static MemberNotInitInConstructor good8() {
        MemberNotInitInConstructor init = new MemberNotInitInConstructor(11);
        init.setStaticMember("1223");
        init.staticMember = "123";
        return init;
    }


    public void doof8() {
        staticMember.toString();
    }


    private class InnerClass {
        private String strInner;

        public InnerClass(String str) {
            this.strInner = str;
        }

        public void getInnerInfo() {
            strInner.toString();
            System.out.println("111");
        }
    }


}
