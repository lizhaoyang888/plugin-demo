package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 22:00
 */
public class ArrayUtilsTest {

    public static void main(String[] args){
        //空数组
        int[] empty_int_array = ArrayUtils.EMPTY_INT_ARRAY;
        Integer[] empty_integer_array = ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;

        //将null转换为空数组
        int[] null_array = null;
        null_array = ArrayUtils.nullToEmpty(null_array);

        //将包装类和基本类型互换
        Integer[] integer_arr = ArrayUtils.toArray(1,2,3);
        int[] int_arr = ArrayUtils.toPrimitive(integer_arr);
        integer_arr = ArrayUtils.toObject(int_arr);

    }
}
