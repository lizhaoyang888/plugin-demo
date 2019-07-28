package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-24 02:30
 */
public class DateUtilsTest {
    public static void main(String[] args) throws Exception{
        method();
    }

    static void method() throws Exception{
        //String转Date
        Date date = DateUtils.parseDate("20171012 14:30:12", Locale.TRADITIONAL_CHINESE, "yyyyMMdd hh:mm:ss");
        out(date);

        //Date转String
        Date now = new Date();
        String dd = DateFormatUtils.format(now,"yyyy-MM-dd hh:mm:ss",Locale.TRADITIONAL_CHINESE);
        out(dd);
    }


    static void out(Object o){
        System.out.println(o);
    }
}
