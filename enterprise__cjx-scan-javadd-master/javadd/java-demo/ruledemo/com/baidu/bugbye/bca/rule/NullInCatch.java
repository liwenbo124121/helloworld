package com.baidu.bugbye.bca.rule;

public class NullInCatch {
    /*public void bad1() {
        Object obj = null;
        Object obj2;
        try {
            obj = new Object();
        } catch (Exception e) {
            obj.toString();
            e.printStackTrace();
        } finally {
            obj.toString();
        }
        obj.toString();
    }

    public void good1() {
        Object obj = null;
        Object obj2 = null;
        obj2 = new Object();
        try {
            obj = new Object();
        } catch (Exception e) {
            if (obj != null) {
                obj.toString();
            }
            obj2.toString();
            e.printStackTrace();
        } finally {
            obj.toString();
        }
        obj.toString();
    }

    public void good2() {
        Object obj = null;
        Object obj2 = null;
        obj2 = new Object();
        try {
            obj = new Object();
        } catch (Exception e) {
            try {
                obj2.toString();
                e.printStackTrace();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            obj.toString();
        }
        obj.toString();
    }

    public void good3() {
        Object obj = null;
        Object obj2 = null;
        try {
            obj = new Object();
        } catch (Exception e) {
            try {
                obj = new Object();
                obj.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            obj.toString();
        }
    }*/

}
