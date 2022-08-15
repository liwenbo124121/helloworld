package com.baidu.bugbye.bca.rule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by lvzhiwang on 2019/4/18.
 */
public class ConcurrentModification {

    public static void bad1(Collection arrayList) {
        for (Object value : arrayList) {
            arrayList.remove(1);
        }
    }


    public static void bad2(Collection arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            arrayList.remove(integer);
        }
    }

    public static void bad3(Collection arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Integer integer = iterator.next();
            arrayList.remove(integer);
        }

    }

    public static void bad4(Collection arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        int size = arrayList.size();
        for (int a = 0; a < 2; a++) {
            Integer integer = iterator.next();
            for (int i = 0; i < size; i++) {
                arrayList.remove(integer);
            }
        }

    }


    public static void bad5(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer.intValue() == 5) {
                arrayList.remove(integer);
                arrayList.add(integer);
            }
        }

    }


    public static void good1(Collection arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        int size = arrayList.size();
        Integer integer = iterator.next();
        for (int i = 0; i < size; i++) {
            arrayList.remove(integer);
        }

    }

    public static void good2(Collection arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Iterator<Integer> iterator = arrayList.iterator();
            Integer integer = iterator.next();
            arrayList.remove(integer);
        }

    }

    public static void good3(Collection arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            iterator.remove();
            System.out.println("111111"+integer);
        }
    }

}
