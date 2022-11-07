package com.baidu.bugbye.bca.rule.findbugs;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by lvzhiwang on 2019/3/4.
 */
public class BadCastOfCollection {


    //        BC_BAD_CAST_TO_ABSTRACT_COLLECTION
    public void bad2(Collection coll) {
        Set set = (Set) coll;
        System.out.println(set.size());
    }

    public void good(Collection coll) {
        if (coll instanceof Set) {
            Set set = (Set) coll;
            System.out.println(set.size());
        }
    }

    public void good1() {
        ArrayList list = new ArrayList();
        Collection arrayList = (Collection) list;
        System.out.println(arrayList.size());
    }


    //    TODO
    public void good2(Collection coll) {
        if (Utils.isInstance1(Set.class, coll)) {
            Set set = (Set) coll;
            System.out.println(set.size());
        }
    }

    // TODO
    public void good3(Collection coll) {
        if (Utils.isInstance2(Set.class, coll)) {
            Set set = (Set) coll;
            System.out.println(set.size());
        }
    }

    // TODO
    public void good4(Collection coll) {
        if (getCol(coll) instanceof Map) {
            Set set = (Set) getCol(coll);
            System.out.println(set.size());
        }
    }

    public Collection getCol(Collection collection) {
        return collection;
    }


}

class Utils {

    public static boolean isInstance2(Class<?> cls, Object obj) {
        return UtilsTwo.isInstanceof(cls, obj);
    }


    public static boolean isInstance1(Class<?> cls, Object obj) {
        return cls.isInstance(obj);
    }
}

class UtilsTwo {

    public static boolean isInstanceof(Class<?> cls, Object obj) {
        return cls.isInstance(obj);
    }
}
