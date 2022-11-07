package com.baidu.bugbye.bca.rule;

public class InfiniteRecurisiveLoop {
    private int id;

    public void bad1() {
        bad1();
    }

    public void bad2() {
        bad2();
    }


    public void bad3(String str) {
        bad3("111");
    }

    public void bad4(double s) {
        bad4(1.0);
    }

    public void bad5(int a, int b) {
        bad5(10, 11);
    }

    public void bad6(InfiniteRecurisiveLoop inf) {
        bad6(inf);
    }

    public void bad7(InfiniteRecurisiveLoop inf, String str) {
        bad7(inf, "abcd");
    }

    public void bad8(boolean inf, int c) {
        bad8(false, 10);
    }

    public void bad9(boolean in) {
        bad9(true);
    }

    public void good1() {
        if (id > 0) {
            return;
        } else {
            good1();
        }

    }

    public void good2(String i) {
        good2(Integer.valueOf(i));

    }

    public void good2(int i) {
        id = i;
    }

    public <T> void good3(T t) {
        t.toString();
        good3(t);
    }

    public void good04(double d) {

        good04((int) 10);
    }

    public void good4(Class<?> cls) {
        cls.toString();
        good4(cls);
    }

    public void good5(int a, int b) {
        good5("a", 11);
    }

    // bad
    public void good5(String c, int d) {
        good5("sad", 99);
    }

    public void good6(int num, int age) {
        good6("asd", 2);
    }

    // bad
    public void good6(String num, int age) {
        good6("asd", 2);
    }


    public void bad10(Object inf) {
        bad10(new InfiniteRecurisiveLoop());
    }


    class User extends Person {
        private String name;

        public String getName() {
            return "name";
        }

        public int getAge() {
            return 10;
        }
    }

    class Person extends A {
        private String sex;
    }

    class A {

    }


    public void bad12(User user) {
        bad12(user);
    }

    public void bad13(A a) {
        User user1 = new User();
        bad13(user1);
    }

    public void goodX(int age, String name, User user) {
        goodX(user.getAge(), user.getAge(), user);
    }

    // bad
    public void goodX(int age, int age1, User user) {
        goodX(user.getAge(), user.getAge(), user);
    }

    public void goodX(User user) {
        goodX(user.getName());
    }

    // bad
    public void goodX(String user) {
        goodX(user);
    }

}
