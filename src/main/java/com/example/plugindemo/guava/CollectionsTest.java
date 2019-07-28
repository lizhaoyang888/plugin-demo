package com.example.plugindemo.guava;

import com.google.common.collect.*;
import com.google.common.primitives.Ints;

import java.util.List;

public class CollectionsTest {
    public static void main(String[] args){
        // list();
        // multiset();
        // multimap();
        primitives();
    }

    public static void out(Object o){
        System.out.println(o);
    }

    public static void list(){
        List<String> list = Lists.newArrayList("a", "b", "c", "d");
        out(list);
    }

    public static void multiset(){
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("a");
        multiset.add("b", 5);//add "b" 5 times
        System.out.println(multiset.elementSet());//[a, b]
        System.out.println(multiset.count("a"));//2
        System.out.println(multiset.count("b"));//5
        System.out.println(multiset.count("c"));//0
    }

    public static void multimap(){
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.put("a", 1);
        multimap.put("a", 2);
        multimap.put("a", 4);
        multimap.put("b", 3);
        multimap.put("c", 5);

        System.out.println(multimap.keys());//[a x 3, b, c]
        System.out.println(multimap.get("a"));//[1 ,2, 4]
        System.out.println(multimap.get("b"));//[3]
        System.out.println(multimap.get("c"));//[5]
        System.out.println(multimap.get("d"));//[]

        System.out.println(multimap.asMap());//{a=[1, 2, 4], b=[3], c=[5]}
    }

    //基本类型
    public static void primitives(){
        System.out.println(Ints.asList(1,2,3,4));
        System.out.println(Ints.compare(1, 20));
        System.out.println(Ints.join(" ", 1, 2, 3, 4));
        System.out.println(Ints.max(1, 3, 5 ,4, 6));
        System.out.println(Ints.tryParse("1234"));
    }

}
