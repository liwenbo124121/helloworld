package com.baidu.bugbye.bca.rule;

public class ReferenceBeforeNPC {

    public void bad1() {
        Integer integer = null;
        if (integer.toString().equals("1") && integer != null) {
            System.out.println(integer.toString());
        }

        Corgi corgi = new Corgi("Corgi");
        System.out.println(corgi.name);
        if (null == corgi) {
            System.out.println("null");
        }
    }
}

class Corgi {
    public String name;

    public Corgi(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}