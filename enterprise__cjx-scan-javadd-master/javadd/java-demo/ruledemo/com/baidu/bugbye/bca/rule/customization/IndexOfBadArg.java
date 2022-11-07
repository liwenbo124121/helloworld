package com.baidu.bugbye.bca.rule.customization;

public class IndexOfBadArg {

    public boolean bad1(int bad1) {
        String str = "121213";
        int post = str.indexOf("1", bad1);
        return true;
    }

    public boolean bad2(int bad2) {
        String str = "121213";
        if (bad2 > 0) {
            System.out.println("11111");
        }
        int post = str.indexOf("1", bad2);
        return true;
    }

    public void bad3(int bad3) {
        String str = "121213";
        int post = str.indexOf("1", getNum(1));
    }

    public void bad4(int bad3) {
        String str = "121213";

        int post = str.indexOf("1", bad3++);
    }

    public void bad5(int bad5) {
        String str = "121213";

        int post = str.indexOf("1", ++bad5);
    }


    public boolean good1(int good1) {
        String str = "121213";
        if (good1 >= 0) {
            int post = str.indexOf("1", good1);
        }
        return true;
    }

    public void good2(int good2) {
        String str = "121213";
        if (getNum(1) > 0) {
            int post = str.indexOf("1", getNum(1));
        }

    }

    public boolean good3(int good3) {
        String str = "121213";
        int tmp = getNum(1);
        if (tmp < 0) {
            return false;
        }
        int post = str.indexOf("1", tmp);
        return true;
    }

    public boolean good4(int good4) {
        String str = "121213";
        if (getNum(1) < 0) {
            return false;
        }
        int post = str.indexOf("1", getNum(1));
        return true;
    }

    public int getNum(int num) {
        if (num >= 1) {
            return 1;
        }
        return -1;
    }

    public boolean good5(int good5) {
        String str = "121213";
        if (good5 > 0) {
            int post = str.indexOf("1", good5++);
        }
        return true;
    }

    public boolean good6(int good6) {
        String str = "121213";
        if (good6 > 0) {
            int post = str.indexOf("1", ++good6);
        }
        return true;
    }

}
