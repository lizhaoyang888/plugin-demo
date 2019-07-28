package com.example.plugindemo.commons_codec;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Test {

    //MD5是一种不可逆的加密技术，不过据说现在MD5也不怎么安全了，具体可以google以下MD5碰撞。
    //在DigestUtils这个类下还有其他各种算法，例如SHA1等
    public static void main(String[] args){
        System.out.println("===============MD5======================");
        String result = DigestUtils.md5Hex("我叫李朝阳");
        System.out.println(result);

        System.out.println("===============SHA======================");
        String res = DigestUtils.sha1Hex("我叫李朝阳");
        System.out.println(res);
    }
}
