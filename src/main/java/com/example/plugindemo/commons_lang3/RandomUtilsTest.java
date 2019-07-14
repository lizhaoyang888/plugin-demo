package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 22:42
 */
public class RandomUtilsTest {

    public static void main(String[] args){

        //byte[] randomBytes = RandomUtils.nextBytes(10);
        System.out.println(RandomUtils.nextInt(1,1000));

        //随机5个字 有可能是乱码
        String random = RandomStringUtils.random(5);
        //在指定范围内随机3个字符
        String randomChars = RandomStringUtils.random(3,'a','b','c','d','e');
        //随机10个Ascii
        String randomAscii = RandomStringUtils.randomAscii(10);
        //随机5个数字  10以内
        String randomNumeric = RandomStringUtils.randomNumeric(5);
        System.out.println(random);
        System.out.println(randomChars);
        System.out.println(randomAscii);
        System.out.println(randomNumeric);

    }

}
