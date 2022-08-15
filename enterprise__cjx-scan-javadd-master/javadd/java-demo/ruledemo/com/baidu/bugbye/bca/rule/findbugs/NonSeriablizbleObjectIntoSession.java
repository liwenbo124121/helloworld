package com.baidu.bugbye.bca.rule.findbugs;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lvzhiwang on 2019/3/8.
 */
public class NonSeriablizbleObjectIntoSession {

    static class Foo {
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    static class Foo2 implements Serializable {

    }

    static class Foo3 extends Foo2 {

    }

    HttpSession session;

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public void good1(Map<String, String> map) {
        session.setAttribute("map", map);
    }

    public void good2(Set<String> set) {
        session.setAttribute("set", set);
    }

    public void bad1(Foo foo) {
        session.setAttribute("foo", foo);
    }

    public void good9(Foo2 foo2) {
        session.setAttribute("foo", foo2);
    }

    public void good3(Foo3 foo3) {
        session.setAttribute("foo", foo3);
    }

    public void bad2(Set<Foo> fooSet) {
        session.setAttribute("fooSet", fooSet);
    }


    public void good4(Set<Foo2> foo2Set) {
        session.setAttribute("fooSet", foo2Set);
    }

    public void good5(Map<Foo2, String> fooMap2) {
        session.setAttribute("fooMap", fooMap2);
    }

    public void bad3(Map<Foo, String> fooMap) {
        session.setAttribute("fooMap", fooMap);
    }

    public void bad4(Map<String, Foo> fooMap) {
        session.setAttribute("fooMap", fooMap);
    }

    public void good6(Map fooMap) {
        session.setAttribute("fooMap", fooMap);
    }

    public void good7(Set set) {
        session.setAttribute("set", set);
    }

    public void good8() {
        session.setAttribute("set", getmap1());
    }

    public Map<Foo, String> getmap1() {
        Map<Foo, String> map = new HashMap<>();
        return map;
    }
}
