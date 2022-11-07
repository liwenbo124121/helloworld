package com.baidu.bugbye.bca.rule.findbugs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by lvzhiwang on 2019/1/30.
 */
public class StaticFieldProtected {

    int age = 12;

    static int num = 0;

    //    MS_SHOULD_BE_FINAL
    protected static String name = "1132";

    //    MS_SHOULD_BE_FINAL
    public static String name2 = "3333";

    public static final String name3 = "333";

    //    MS_SHOULD_BE_FINAL
    public static HashMap<String, String> map1 = new HashMap();

    //    MS_FINAL_PKGPROTECT
    public static int[] data2 = new int[5];

    //    MS_PKGPROTECT
    public static final int[] data3 = new int[5];

    //    MS_PKGPROTECT
    protected static final int[] data4 = new int[5];

    //    good
    private static final int[] data5 = new int[5];

    //    MS_PKGPROTECT
    protected static final String[] str = new String[3];

    //    MS_PKGPROTECT
    public static final String[] str2 = str;

    //    MS_PKGPROTECT
    protected static final String[] str3 = str;

    //    MS_MUTABLE_COLLECTION_PKGPROTECT
    public static final HashMap<String, String> maps = new HashMap();

    //    MS_MUTABLE_COLLECTION_PKGPROTECT
    protected static final HashMap<String, String> maps2 = new HashMap();

    //    good
    private static final Hashtable<String, String> hashtable = new Hashtable();

    //    good
    static final HashMap<String, String> maps21 = new HashMap();

    //    good
    static final String[] array0 = new String[3];

    //    MS_PKGPROTECT
    protected static final String[] array01 = new String[3];

    //    good
    static final int[] array1 = new int[2];

    //    good
    static final int[] array = {1, 2, 3, 4, 5};


    //    MS_PKGPROTECT
    public static final int[] array2 = {1, 2, 3, 4, 5};

    public static final Stack stck = new Stack();

}


