package com.baidu.bugbye.bca.rule;

public class ObjEqual {

    public static void main(String[] args) {
        Integer iObj = 1;
        int i = 1;
        Byte bObj = 1;
        byte b = 1;
        boolean flag = true;
        String strA = "string";
        String strB = new String("string");
        Overred overredA = new Overred();
        Overred overredB = new Overred();

        System.out.println(i == b);  // good
        System.out.println(iObj != 0);  // good
        System.out.println(i == (short) b);  // good
        System.out.println(bObj == (long) iObj);  // good
        System.out.println(flag == Boolean.TRUE);  // good
        System.out.println(strA != null);  // good
        System.out.println(strA == "string"); // bad  TODO
        System.out.println(strA == strB); // bad
        System.out.println(overredA == overredB); // bad
        System.out.println(i == help());  // good
        System.out.println(strA.getClass() == String.class);  // good
    }

    private static class Overred {
        @Override
        public boolean equals(Object object) {
            return true;
        }
    }

    public static int help() {
        return 1;
    }
}