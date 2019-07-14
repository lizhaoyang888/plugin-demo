package com.example.plugindemo.commons_lang3;

import com.example.plugindemo.util.PluginUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 23:25
 */
public class StringUtilsTest {
    public static void main(){

        StringUtils.isEmpty(null);//true
        StringUtils.isEmpty("");//true
        StringUtils.isEmpty(" ");//false

        //任意一个参数为空的话，返回true。如果这些参数都不为空的话返回false
        StringUtils.isAnyEmpty(null,"foo");//true
        StringUtils.isAnyEmpty("","foo");//true
        StringUtils.isAnyEmpty(" ","foo");//false

        //都不为空 返回true
        StringUtils.isNoneEmpty("",null);

        //判断字符对象是不是空字符串，相当于深度的isEmpty
        StringUtils.isBlank(null);//true
        StringUtils.isBlank("");//true
        StringUtils.isBlank(" ");//true
        StringUtils.isBlank(" foo");//false

        //移除字符串两端的空字符串，制表符
        StringUtils.trim(null);//null
        StringUtils.trim("\n\t   ");//""


        StringUtils.contains("abcdefg","ab");//true

        StringUtils.substring("abcdef",2);//cdef
        StringUtils.left("abcdef",2);//ab
        StringUtils.right("abcdef",2);//ef
        StringUtils.mid("abcdef",2,3);//cde

        StringUtils.join(null);//null
        StringUtils.join(new String[]{null});//""
        StringUtils.join(new String[]{"a", "b", "c"});//"abc"
        StringUtils.join(new String[]{null, "", "a"});//"a"

        //特定字符串连接数组
        StringUtils.join(new String[]{"a", "b", "c"}, ';');//"a;b;c"
        StringUtils.join(new String[]{"a", "b", "c"}, null);//"abc"
        StringUtils.join(new String[]{null, "", "a"}, ';');//";;a"

        //删除空格
        StringUtils.deleteWhitespace(" a b c ");//abc

        //删除以特定字符串开头的字符串
        StringUtils.removeStart("www.domain.com", "www.");//"domain.com"
        StringUtils.removeStart("www.domain.com", "domain");//"www.domain.com"

        //为了保证长度统一，可以右边自动用指定的字符补全至指定长度
        StringUtils.rightPad("bat", 5, 'z');//"batzz"

        //将字符串扩展到指定的长度。把主体放在中间，两边自动用空串补齐
        StringUtils.center("ab", 4);//" ab "

        //首字母大、小写
        StringUtils.capitalize("abc");//Abc
        StringUtils.uncapitalize("ABC");//aBC

        //去返大小写 大变小 小变大
        StringUtils.swapCase("The dog has a BONE");//"tHE DOG HAS A bone"

        //判断字符串是否全由字母组成 （只要存在汉字、符号、数字都为false）
        StringUtils.isAlpha("ab-c");//false

        //字符串翻转
        StringUtils.reverse("bat");//"tab"

        //缩略字符串，省略号要占三位。maxWith小于3位会报错。
        StringUtils.abbreviate("abcdefg", 5);//"ab..."

        //包装，用后面的字符串对前面的字符串进行包装
        StringUtils.wrap("ab", 'x');//"xabx"
    }

    public static void main(String[] args){
        PluginUtils.out(StringUtils.wrap("aba","---"));
    }
}
