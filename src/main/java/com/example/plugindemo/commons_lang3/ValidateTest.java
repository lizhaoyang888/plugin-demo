package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.Validate;

public class ValidateTest {
    public static void main(String[] args){
        Validate.exclusiveBetween(1,1000000,99);
        Validate.isInstanceOf(String.class,new Object());
    }
    static void out(Object o){
        System.out.println(o);
    }
}
