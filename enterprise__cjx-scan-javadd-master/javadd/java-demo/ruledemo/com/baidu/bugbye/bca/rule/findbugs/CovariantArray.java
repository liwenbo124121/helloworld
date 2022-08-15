package com.baidu.bugbye.bca.rule.findbugs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lvzhiwang on 2019/2/28.
 */
public class CovariantArray {

    /*abstract static class Parent {
    }

    static class Child extends Parent {
    }

    static class GrantChild extends Parent {
    }

    protected Number[] field2 = null;
    protected Parent[] parents = null;


    public void caaField(GrantChild c, Parent p) {

        parents = new Child[10];
        //        bad
        parents[0] = p;
        //        bad
        parents[1] = c;
    }

    public static void main(String[] args) {
        Person p = new Person();
        Person s = new Stuendt();
        Person t = new Teacher();

        Person[] person = new Person[10];
        //      good
        person[0] = p;
        //        good
        person[1] = s;
        //      good
        person[2] = t;


        Person[] student = new Stuendt[10];
        //      bad
        student[0] = p;
        //      good
        student[1] = s;
        //      bad
        student[2] = t;
        //      good
        student[3] = new Stuendt();

        //        bad
        student[4] = getPerson();

        Stuendt[] student2 = new Stuendt[10];
        //        good
        student2[0] = new Stuendt();

        student2[0] = (Stuendt) getPerson2();

    }

    public static Person getPerson() {
        Stuendt stuendt = new Stuendt();
        return stuendt;
    }

    public static void getPerson(Person p) {
        Person[] studnet = new Stuendt[10];
        //        bad
        studnet[0] = p;

        Person[] person = new Person[1];
        //        good
        person[0] = p;
    }


    public static Person getPerson2() {
        Stuendt p = new Stuendt();
        return p;
    }

    private static int[] objArray2intArray(Object[] objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }

        int[] arrays = new int[objects.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) objects[i];
        }

        return arrays;
    }

    public static void test() {
        List<int[]> stateList = new LinkedList<>();
        int[][] stateListBuilt = new int[10][];
        stateListBuilt[0] = stateList.get(0);
    }*/

}


class Person {

}

class Stuendt extends Person {

}


class Teacher extends Person {

}

