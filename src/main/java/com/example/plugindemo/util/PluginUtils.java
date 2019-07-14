package com.example.plugindemo.util;


import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 23:00
 */
public class PluginUtils {
    public static void out(String msg){
        System.out.println(msg);
    }

    public static void out(int num){
        System.out.println(num);
    }

    public static void out(File file){
        System.out.println(file);
    }

    public static void out(boolean flag){
        System.out.println(flag);
    }

    // 打印数组
    public static <T> void out(T... obj) {
        if (obj == null)
            return;
        for (T t : obj) {
            System.out.println(t);
        }
    }

    // 打印列表
    public static <T> void out(List<T> list) {
        if (list == null)
            return;
        for (T t : list) {
            System.out.println(t);
        }
    }

    // 打印Map
    public static void out(Map<?, ?> map) {
        if (map == null)
            return;
        for (Object key : map.keySet()) {
            out("key:" + key + "\tvalue:" + map.get(key));
        }
    }

}
