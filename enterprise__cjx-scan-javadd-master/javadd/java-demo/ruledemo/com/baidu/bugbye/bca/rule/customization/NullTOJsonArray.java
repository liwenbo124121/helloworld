package com.baidu.bugbye.bca.rule.customization;

import android.text.TextUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzhiwang on 2019/3/18.
 */
public class NullTOJsonArray {

    // StringUtils.em
    // TextUtils.isEmpty
    public void bad1() throws Exception {
        String str = getName(1);
        JSONArray a = new JSONArray(str);
    }


    public void bad2() throws Exception {
        JSONArray a = new JSONArray(getName(1));
    }


    public void good1() throws Exception {
        String str = getName(1);
        if (str != null) {
            JSONArray a = new JSONArray(str);
        }

    }


    public void good2() throws Exception {
        String str = getName(1);
        if (str == null) {
            return;
        }
        JSONArray a = new JSONArray(str);
    }


    public void good3() throws Exception {
        String str = getName(1);
        if (str == null) {
            System.out.println("1111");
        } else {
            JSONArray a = new JSONArray(str);
        }

    }


    public void good4() throws Exception {
        if (getName(1) != null) {
            JSONArray a = new JSONArray(getName(1));
        }
    }

    public void good5() throws Exception {
        if (getName(1) == null) {
            return;
        }
        JSONArray a = new JSONArray(getName(1));
    }


    public void good6() throws Exception {

        if (getName(1) == null) {
            System.out.println("1111");
        } else {
            JSONArray a = new JSONArray(getName(1));
        }

    }

    public String getName(int num) {
        if (num > 1) {
            return null;
        }
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        return list.toString();

    }

    // StringUtils.isBlank()
    // StringUtils.isEmpty()
    // TextUtils.isEmpty()
    public void good7() throws Exception {
        String str7 = getName(1);
        if (!StringUtils.isBlank(str7)) {
            JSONArray a = new JSONArray(str7);
        }

    }

    public void good7A() throws Exception {
        if (!StringUtils.isBlank(getName(1))) {
            JSONArray a = new JSONArray(getName(1));
        }

    }

    public void good8() throws Exception {
        String str8 = getName(1);
        if (!StringUtils.isEmpty(str8)) {
            JSONArray a = new JSONArray(str8);
        }

    }

    public void good8A() throws Exception {
        if (!StringUtils.isEmpty(getName(8))) {
            JSONArray a = new JSONArray(getName(8));
        }

    }

    public void good9() throws Exception {
        String str9 = getName(1);
        if (StringUtils.isEmpty(str9)) {
            System.out.println("11111");
        } else {
            JSONArray a = new JSONArray(str9);
        }
    }

    public void good9A() throws Exception {
        if (StringUtils.isEmpty(getName(9))) {
            System.out.println("11111");
        } else {
            JSONArray a = new JSONArray(getName(9));
        }
    }

    public void good10() throws Exception {
        String str10 = getName(1);
        if (StringUtils.isEmpty(str10)) {
            return;
        } else {
            JSONArray a = new JSONArray(str10);
        }
    }

    public void good11() throws Exception {
        String str11 = getName(1);
        if (TextUtils.isEmpty(str11)) {
            return;
        }
        JSONArray a = new JSONArray(str11);
    }

    public void good11A() throws Exception {
        if (TextUtils.isEmpty(getName(11))) {
            return;
        }
        JSONArray a = new JSONArray(getName(11));
    }

    public void good12() throws Exception {
        String str = getName(1);
        if (str == null) {
            return;
        }
        JSONArray a = new JSONArray(str);
    }


    public void good13() throws Exception {
        String str = getName(1);
        if (str == null) {
            System.out.println("1111");
        } else {
            JSONArray a = new JSONArray(str);
        }

    }

}
