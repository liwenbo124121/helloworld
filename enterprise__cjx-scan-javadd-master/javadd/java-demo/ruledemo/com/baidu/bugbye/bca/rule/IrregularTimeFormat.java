package com.baidu.train.json;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IrregularTimeFormat {

    public static void bad1() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYMMdd-yy");
        System.out.println(sdf1.format(date));
    }


    public static void bad2() {
        Date date = new Date();
        System.out.println(date);
        String time = "YYMMdd-yy";
        SimpleDateFormat sdf1 = new SimpleDateFormat(time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY年MM月dd日");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(time);
        System.out.println(sdf1.format(date));
    }




    public static void bad3() {
        String dateStr = "2020年1月20日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date);
    }

    public static void main(String[] args) {
        bad1();
    }


}
