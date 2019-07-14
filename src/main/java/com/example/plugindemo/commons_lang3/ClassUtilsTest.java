package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassPathUtils;
import org.apache.commons.lang3.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 22:25
 */
public class ClassUtilsTest {

    public static void main(String[] args){
        //返回class包名
        String fullPath = ClassPathUtils.toFullyQualifiedPath(ClassUtilsTest.class,"fullPath");
        System.out.println(fullPath);

        //获取该类的所有父类 不包含接口
        List<Class<?>> allSuperclasses = ClassUtils.getAllSuperclasses(ArrayList.class);
        System.out.println(ArrayUtils.toString(allSuperclasses));

        //获取该类的所有父接口
        List<Class<?>> allInterfaces = ClassUtils.getAllInterfaces(ArrayList.class);
        System.out.println(ArrayUtils.toString(allInterfaces));

        //基本类型与包装类型
        System.out.println(ClassUtils.isPrimitiveOrWrapper(Integer.class));

        //获取到该类的继承结构
        Iterable<Class<?>> hierarchy = ClassUtils.hierarchy(ArrayList.class,ClassUtils.Interfaces.INCLUDE);
        hierarchy.forEach(System.out::println);
    }
}
