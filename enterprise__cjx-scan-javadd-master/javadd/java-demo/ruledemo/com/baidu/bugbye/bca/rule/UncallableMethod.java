package com.baidu.bugbye.bca.rule;

public class UncallableMethod {
    public UncallableMethod() {

    }

    /**
     * invocation
     */
    public void good1() {
        Object threadLocal = new Object() {
            public boolean equals() {
                return true;
            }

            public boolean equals(Object obj) {
                return this.equals();
            }
        };
    }

    /**
     * unresolved
     */
    public void good2() {
        InnerClass json = new InnerClass() {
            @Override
            public String toString() {
                return null;
            }
        };
    }

    /**
     * abstract and interfaces
     */
    public void good3() {
        AbstractClass one = new AbstractClass() {

            @Override
            public void run() {

            }
        };
    }

    public void bad1() {
        Object threadLocal = new Object() {
            public boolean equals() {
                return true;
            }
        };
    }

    private class InnerClass extends Object {

        @Override
        public String toString() {
            return null;
        }
    }

    private abstract class AbstractClass implements Runnable {

    }
}
