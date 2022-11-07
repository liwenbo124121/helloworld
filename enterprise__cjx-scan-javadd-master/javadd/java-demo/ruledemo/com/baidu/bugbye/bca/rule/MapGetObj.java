package com.baidu.bugbye.bca.rule;

import android.text.TextUtils;
import com.baidu.bugbye.bca.supporter.TestModel;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class MapGetObj {
    private HashMap<String, String> hm;

    public String good1() {
        Object obj = hm.get("key");
        if (obj != null) {
            return obj.toString();
        } else {
            return null;
        }
    }

    public String good11() {
        Object obj = hm.get("key");
        int i = 0;
        if (obj != null) {
            if (i == 0) {
                return obj.toString();
            } else {
                return null;
            }
        }
        return null;
    }

    public String good2() {
        Object obj = null;
        obj = hm.get("key");
        if (obj != null) {
            return obj.toString();
        } else {
            return null;
        }
    }

    public String good3() {
        Object obj = null;
        obj = hm.get("key");
        if (obj == null) {
            return "test";
        }
        return obj.toString();
    }

    public String good31() {
        Object obj = null;
        obj = hm.get("key");
        if (!TextUtils.isEmpty((String) obj)) {
            return obj.toString();
        } else {
            return "";
        }

    }

    public String good5(String key) {
        String url = null;
        if (!TextUtils.isEmpty(key)) {
            url = hm.get(key);
        }
        if (!TextUtils.isEmpty(url)) {
            return url.getClass().toString();
        } else {
            return "";
        }
    }

    public String bad1() {
        Object obj = hm.get("key");
        return obj.toString();
    }

    public String bad2() {
        Object obj = null;
        obj = hm.get("key");
        return obj.toString();
    }

    public String bad3() {
        Object obj = null;
        obj = hm.get("key");
        if (hm.isEmpty()) {
            return obj.toString();
        } else {
            return "";
        }

    }

    public String good41() {
        Object obj = null;
        if (hm.get("key") != null) {
            obj = hm.get("key").getClass().toString();
            return (String) obj;
        } else {
            return null;
        }
    }

    public String bad41() {
        Object obj = null;
        if (hm == null) {
            obj = hm.get("key").getClass().toString();
        }
        return "";
    }

    public String good42() {
        Object obj = null;
        if (hm.get("key") == null) {
            return "";
        }
        obj = hm.get("key").getClass().toString();
        return obj.toString();
    }

    public String bad42() {
        Object obj = null;
        obj = hm.get("key").getClass().toString();
        return (String) obj;
    }

    HashMap<String, String> map = new HashMap<>();

    public String good43() {
        Object obj = null;
        if (map.get("234") != null) {
            obj = map.get("234").getClass().toString();
        } else {
            obj = map.get("234").getClass().toString();
        }
        return obj.toString();
    }

    public String bad43() {
        Object obj = null;
        if (map.get("123") != null) {
            obj = map.get("234").getClass().toString();
        } else {
            obj = map.get("234").getClass().toString();
        }
        return obj.toString();
    }

    public String good44() {
        Object obj = null;
        try {
            switch (map.get("app").toString()) {
                case "com.adamrocker.android.input.simeji":
                    obj = hm.get("123").getClass().toString();
                    break;
                case "com.simejikeyboard":
                    obj = hm.get("234").getClass().toString();
                    break;
                default:
                    obj = hm.get("234").getClass().toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    public String bad5(String key) {
        String url = null;
        if (!TextUtils.isEmpty(key)) {
            url = hm.get(key);
        }
        return url.getClass().toString();
    }

    public String bad6() {
        Object obj = null;
        try {
            obj = hm.get("key");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    public void bad7() {
        if (hm.get("app_title").toString().length() > 15 && hm.get("123").toString().length() < 10) {
            hm.get("app_title");
        }
    }

    public void good61(String key) {
        method(hm.get(key));
    }

    public void good62(String key) {
        Object obj = hm.get(key);
        method(obj);
    }

    public void good7(Map map) {
        map.entrySet();
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            hm.get(entry.getKey()).toString();
        }
    }

    public void good81(String key) {
        Map map = null;
        if (map.containsKey(key)) {
            hm.get(key).toString();
        }
    }

    public void good82(String key) {
        if (hm.containsKey(key)) {
            String s = hm.get(key);
            s.getClass();
        }
    }

    public String good9() {
        TestModel t = new TestModel();
        t.string = hm.get("key");
        if (t.string != null) {
            return t.string.toString();
        } else {
            return null;
        }
    }

    public String bad9() {
        TestModel t = new TestModel();
        t.string = hm.get("key");
        return t.string.toString();
    }

    Map<String, List<String>> listMap;

    public String good10(String key) {
        List<String> values = listMap.get(key);
        return (values != null ? values.get(0) : null);
    }

    public void good12() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : map.keySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            String value = map.get(key);
            try {
                stringBuilder.append((key != null ? URLEncoder.encode(key, "UTF-8") : ""));
                stringBuilder.append("=");
                stringBuilder.append(value != null ? URLEncoder.encode(value, "UTF-8") : "");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("This method requires UTF-8 encoding support", e);
            }
        }
    }

    public void good14(Map<String, Map<String, String>> mNewTipsSourceMap) {
        Map newTipsSrc = mNewTipsSourceMap.get("123");

        if (null == newTipsSrc) {
            newTipsSrc = new HashMap();
            mNewTipsSourceMap.put("123", newTipsSrc);
        }
        newTipsSrc.put("123", newTipsSrc);
    }

    public void good15(Map<String, String> sRecordMap) {

        String record = sRecordMap.get("123");
        if (record == null) {
            record.toString();
        }
        if (true) {
            record.toString();
        }
    }

    Map<String, List<Map>> mMap;

    public void good16(String name, Map map) {
        if (!TextUtils.isEmpty(name) && map != null) {
            List<Map> list = mMap.get(name);
            if (list == null) {
                list = new ArrayList<Map>();
                mMap.put(name, list);
            }
            list.add(map);
        }
    }

    public void good17(Map<String, Integer> mPluginCurEntrance, String plugin) {
        Integer value = mPluginCurEntrance.get(plugin);
        int curEntrance = (value == null) ? 123 : value.intValue();
    }

    public void good18() {
        Iterator<String> keys = hm.keySet().iterator();
        String key;
        while (keys.hasNext()) {
            key = keys.next();
            hm.get(key).toLowerCase().toString();
        }
    }

    private boolean good19(String packageName, String methodName) {
        return hm.containsKey(packageName) && hm.get(packageName).contains(methodName);
    }


    public void method(Object obj) {
        obj.toString();
    }

}
