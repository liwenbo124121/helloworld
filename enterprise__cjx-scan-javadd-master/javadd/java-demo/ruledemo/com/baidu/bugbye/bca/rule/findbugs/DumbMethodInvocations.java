package com.baidu.bugbye.bca.rule.findbugs;

import redis.clients.jedis.Jedis;

import java.sql.Connection;
import java.sql.DriverManager;

public class DumbMethodInvocations {

    public void bad1() {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            // bad1 con = DriverManager.getConnection("url");
            con = DriverManager.getConnection("url", "user", getPasswd());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bad2() {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            // bad2 con = DriverManager.getConnection("url", "user", "passwd");
            con = DriverManager.getConnection("url", "user", getPasswd());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void good2() {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("url", "user", getPasswd());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bad3() {
        String host  = "localhost";
        int port = 6379;
        Jedis jedis = null;
        try {
            jedis = new Jedis(host, port);
            jedis.auth(getPasswd());
            // bad3 jedis = new Jedis(host, port);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != jedis) {
                try {
                    jedis.close();
                } catch (Exception e) {
                    System.out.println("redis连接关闭失败");
                    e.printStackTrace();
                }
            }
        }
    }

    public void bad4() {
        Jedis jedis = null;
        String host  = "localhost";
        int port = 6379;
        jedis = new Jedis(host, port);
        // bad4 jedis.auth("123456");
        jedis.auth(getPasswd());
    }

    public void good4() {
        Jedis jedis = null;
        String host  = "localhost";
        int port = 6379;
        jedis = new Jedis(host, port);
        jedis.auth(getPasswd());
        jedis.close();
    }

    public String getPasswd() {
        return "";
    }
}
