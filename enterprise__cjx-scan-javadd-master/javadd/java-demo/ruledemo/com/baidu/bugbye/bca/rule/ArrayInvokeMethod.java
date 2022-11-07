package com.baidu.bugbye.bca.rule;

public class ArrayInvokeMethod {
    public void bad1(String[] args) {
        String argStr = args.toString();
    }

    public void bad2(String[] args) {
        int argHash = args.hashCode();
    }

    public void bad3() {
        System.out.println("entity {} type {}  error" + new Object[]{123, 234});
    }

    public boolean bad4(int[] a1, int[] a2) {
        if (a1.equals(a2)) {
            return true;
        }
        return false;
    }
}
