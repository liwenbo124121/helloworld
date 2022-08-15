package com.baidu.bugbye.bca.rule.findbugs;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lvzhiwang on 2019/1/30.
 */
public interface FieldMovedOutOfInterface {

    String name = "1111", name2 = "2";

    File user = new File("1111");

    //    MS_OOI_PKGPROTECT
    String[] strings = {"1", "2", "3"};

    //    MS_OOI_PKGPROTECT
    public static final HashMap maps = new HashMap();

    //    MS_OOI_PKGPROTECT
    public static int[] data2 = new int[5];

    //    MS_OOI_PKGPROTECT
    public static final Set set = new HashSet();

    static final Set set2 = new HashSet();

    List list = new ArrayList<>();

}


