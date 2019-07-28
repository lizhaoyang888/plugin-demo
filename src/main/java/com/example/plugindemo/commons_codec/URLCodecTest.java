package com.example.plugindemo.commons_codec;

import org.apache.commons.codec.net.URLCodec;

public class URLCodecTest {

    //URLCodec可以对url中的参数进行编码。
    public static void main(String[] args) throws Exception{
        System.out.println("===============SHA======================");
        URLCodec codec = new URLCodec();
        String s = codec.encode("我叫李朝阳", "utf-8");
        System.out.println(s);

        String s1 = codec.decode(s, "utf-8");
        System.out.println(s1);

    }
}
