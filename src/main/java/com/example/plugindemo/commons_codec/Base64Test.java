package com.example.plugindemo.commons_codec;

import org.apache.commons.codec.binary.Base64;

public class Base64Test {

    //Base64是可解码的，通常用于把二进制数据编码为可写的字符形式的数据。
    public static void main(String[] args){
        System.out.println("===============base64======================");
        Base64 base64 = new Base64();
        String s = base64.encodeToString("我叫李朝阳".getBytes());
        System.out.println(s);
        String s1 = new String(base64.decode(s));
        System.out.println(s1);

    }

}
