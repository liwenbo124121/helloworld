package com.baidu.bugbye.bca.rule.metrics;


public class CodeMetrics {
    private int i;
    public int j;
    public int id;
    private String name;
    public static String s;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void branchNets() {

        if (1 == 1) {
            if (11 == 11) {
                this.id = 11;
                if (111 == 111) {
                    this.id = 111;
                } else if (112 == 112) {
                    this.id = 112;
                }
            }
            if (12 == 12) {
                this.id = 12;
            } else if (13 == 13) {
                this.id = 13;
            } else {
                this.id = 14;
            }
            if (15 == 15) {
                this.id = 15;
            }
        } else if (2 == 2) {
            if (21 == 21) {
                this.id = 21;
            }

            if (22 == 22) {
                this.id = 22;
            } else if (23 == 23) {
                this.id = 23;
            } else {
                this.id = 24;
            }
        } else {
            if (10 == 10) {
                this.id = 10;
            }

            if (20 == 20) {
                this.id = 20;
            } else if (30 == 30) {
                this.id = 30;
            } else {
                this.id = 40;
                if (400 == 400) {
                    this.id = 400;
                }
            }
        }

        for (int k = 0; k < 10; k ++) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
        }

        while (this.j < 0) {
            System.out.println("While");
        }

        try {
            this.j = 100/0;
        } catch (ArithmeticException  e) {
            e.printStackTrace();
        }

        switch (getI()) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("default");
                break;
        }

        for (int t = getI(); t < 10; t ++) {
            if (3 == t) {
                continue;
            } else if (t > 5) {
                for (int a = 10; a > 1; a --) {
                    while (t < this.j) {
                        System.out.println("While");
                        if (t < 7) {
                            this.id = 7;
                        }
                    }
                    try {
                        this.j = 100 / 0;
                    } catch (ArithmeticException  e) {
                        e.printStackTrace();
                    }
                }
            } else {
                break;
            }

            if (this.j == 0) {
                switch (getI()) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            }
        }

    }

    public int moreArgsFunction (int p1, int p2, int p3, int p4, int p5, int p6, String s1, String s2) {
        return getI();
    }

    /**
     * Test longlongFunction
     *
     */
    public void longLongFunction() {
        int i = 0; // My id
        if (2 > 1) {
            i ++;
        } else {
            System.out.println("else");
        }


























































































































































































































































































































































































































































































































































































































































        // for 500+ lines
        System.out.println("500+ lines function");
    }

    public void m1() {
        this.name = "one";
    }

    public void m2() {
        this.name = "two";
    }

    public void m3() {
        this.name = "three";
    }

    public void m4() {
        this.name = "four";
    }

    public void m5() {
        this.name = "five";
    }

    public void m6() {
        this.name = "six";
    }

    public void m7() {
        this.name = "seven";
    }

    public void m8() {
        this.name = "eight";
    }

}

class NoFunctionClass {
    public static int idNum;
    private String idName;

}