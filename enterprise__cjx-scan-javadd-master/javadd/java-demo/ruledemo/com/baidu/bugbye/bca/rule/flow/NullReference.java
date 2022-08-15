package com.baidu.bugbye.bca.rule.flow;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class NullReference {

   /* Object fieldObj;

    public void bad1() {
        Object obj = null;
        obj.toString();
    }

    public void bad2() {
        Object obj;
        obj = null;
        obj.toString();
    }

    public void bad3(Object obj) {
        if (obj == null && obj.toString() != null) {
            obj.toString();
        }
    }

    public void bad4(Object obj) {
        if (obj.toString() != null || obj != null) {
            obj.toString();
        }
    }

    public void bad5(Object obj) {
        if (obj == null) {
            obj.toString();
        }
    }

    public void bad6(Object obj) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        if (obj == null && obj.toString() != null) {//+++
        }
    }

    public void bad7(Object obj, boolean b) {
        boolean a = true;
        boolean c = true;
        boolean d = true;
        int i = 0;
        if (!(!((b) || ++i > 0 || obj == null) && obj.toString() != null)
                && obj.toString() != null) {//+++
            obj.toString();
            obj.toString();
        }

    }

    public void bad8(Object obj) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        int i = 0;
        if (!((obj != null) && obj.toString() != null) && obj.toString() != null) {//--
            obj.toString();
            obj.toString();
        }
    }

    public void bad81(Object obj) {
        if (!(obj != null && obj.hashCode() > 0) || obj.toString() != "") {
            obj.toString();
        } else {
            if (obj.hashCode() > 0) {
                obj.hashCode();
            } else {
                obj.getClass();
            }
        }
    }

    public void bad9(Object obj) {
        try {
            if (obj == null) {
                return;
            } else {
                obj.hashCode();
            }
        } finally {
            obj.toString();//TODO
        }
    }

    public void bad10(Object obj) {
        obj.toString();
        if (null != obj) {
            obj.toString();
        }
    }

    public void bad11(Object obj) {
        String a = obj == null ? "null" : obj.toString();//TODO
        obj.toString();
    }

    public void bad12(Object obj, int i) {
        if (null == obj) {
            obj.getClass();
        }
        switch (i) {
            case 1: {
                obj.hashCode();
                break;
            }
            default:
                obj.toString();
        }
    }

    public void bad13() {
        String a = getNullObject().toString();
    }

    public void bad14(Object object) {
        boolean bbb = object != null && object.toString() != null;
        object.toString();
    }

    public void good1() {
        if (fieldObj != null) {
            ((String) fieldObj).toString();
        }
    }

    private void good2() {
        if (fieldObj == null) {
            fieldObj = new Object();
            fieldObj.toString();
        }
    }

    private void good3() {
        if (fieldObj == null) {
            try {
                fieldObj = new Object();
                fieldObj.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void good4() {
        if (fieldObj != null) {
            fieldObj.toString();
            fieldObj = null;
        }
        fieldObj = new Object();
        fieldObj.toString();
    }

    public void good5(Object obj) {
        if (obj == null) {
            return;
        }
        obj.toString();
    }

    public void good6(Object obj) {
        if (obj != null) {
            obj.toString();
            int a = 0;
        }
        obj = new Object();
        obj.toString();
    }

    public void good7() {
        Object obj = new Object();
        if (obj == null) {
            throw new RuntimeException();
        }
        try {
            obj.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void good8() {
        String str = null;
        if (StringUtils.isEmpty(str)) {
            str = new String();
        }
        str.toString();
    }

    public void good9() {
        String str = null;
        if (str instanceof String) {
            str.toString();
        }
    }

    public boolean good10() {
        String str = null;
        boolean a;
        a = str == null || str.toString() == null;
        boolean b = str == null || str.toString() == null;
        return str == null || str.toString() == null;
    }

    public void good11() {
        if (null == fieldObj) {
            init();
        }
        fieldObj.toString();
    }

    private void init() {
        this.fieldObj = new Object();
    }

    public void good12() {
        if (fieldObj == null) {
            fieldObj = new Object();
        }
        Runnable r = new Runnable() {
            @Override
            public void run() {
                fieldObj = null;
            }
        };
        fieldObj.toString();
    }

    public void good13() {
        if (fieldObj == null) {
            fieldObj = new Runnable() {
                @Override
                public void run() {
                }
            };
        }
        fieldObj.toString();
    }

    public void good14() {
        Object object = null;
        for (int i = 0; object != null; i++) {
            object.toString();
        }
    }

    public void good15() {
        Object object = null;
        if ((object = new Object()) != null) {
            object.toString();
        }
    }

    public void good16(Object object) {
        boolean bbb = object != null && object.toString() != null;
    }

    public void good17(Object object) {
        object = object != null ? object : new Object();
        object.toString();
    }

    public Object good18(Object object) {
        object = null;
        return object == null ? new Object() : object.toString();
    }

    public void good19(Object obj) {
        if (obj == null) {
            // do something
        }
        Assert.assertNotNull(obj);
        obj.toString();
    }

    public void good20(String obj) {
        if (obj == null) {
            // do something
        }
        if (StringUtils.isNotBlank(obj)) {
            obj.equals("3");
        }
    }

    public void good21() throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(""));
        String line;
        while (!StringUtils.isEmpty(line = fr.readLine())) {
            line.toString();
        }
    }

    public void good22() throws IOException {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.forEach(one -> {
            if (one == null) {
                return;
            }
            one.toString();
        });
    }

    private Object getNullObject() {
        Object object = new Object();
        if (object == null) {
            return object;
        }
        return object;
    }

    public void good23(int a, int b, Object add2) {
        if (a > 0 || b > 0 || add2 == null) {
            return;
        } else {
            if (add2.hashCode() > 0 || add2 != null) {
                add2.toString();
            } else if (b < 0) {
                add2.getClass();//----
            }
        }
    }


    public void good24(Object add3) {
        try {
            if (add3 == null) {
                return;
            } else {
                add3.hashCode();
            }
        } finally {
            add3.toString();//TODO
        }
    }

    public void good25(int a, int b, Object add2) {
        if (add2 == null) {
            return;
        } else if (add2.hashCode() > 0 || add2 != null) {
            add2.toString();
        } else if (b < 0) {
            add2.getClass();//----
        }

    }


    public void good26(String obj) {
        int size = obj == null ? 0 : obj.length();

        for (int i = 0; i < size; i++) {
            System.out.println(obj.getBytes());
        }
    }

    public void bad15(String obj) {
        int size = obj == null ? 0 : obj.length();

        for (int i = 0; i <= size; i++) {
            System.out.println(obj.getBytes());
        }
    }


    public void good28(String obj) {
        int size = obj == null ? 5 : obj.length();

        for (int i = 5; i > size; i--) {
            System.out.println(obj.getBytes());
        }
    }

    public void bad16(String obj) {
        int size = obj == null ? 5 : obj.length();

        for (int i = 5; i >= size; i--) {
            System.out.println(obj.getBytes());
        }
    }

    public void good30(String obj) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            size = obj == null ? 0 : obj.length();
            System.out.println(obj.getBytes());
        }
    }


    public static boolean good1(Date s, Date d) {
        if (s == null && d == null) {
            return false;
        } else if (s == null && d != null) {
            return true;
        } else if (s != null && d == null) {
            return true;

        } else {
            return s.getTime() != d.getTime();
        }

    }


    public static boolean bad1(Date s, Date d) {
        if (s == null) {
            return false;
        } else if (s == null && d != null) {
            return true;
        } else if (s != null && d == null) {
            return true;

        } else {
            return s.getTime() != d.getTime();
        }

    }*/
}


