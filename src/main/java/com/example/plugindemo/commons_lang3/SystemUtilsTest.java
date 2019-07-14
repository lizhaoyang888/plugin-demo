package com.example.plugindemo.commons_lang3;

import com.example.plugindemo.util.PluginUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * @Author: lichaoyang
 * @Date: 2019-06-23 22:55
 */
public class SystemUtilsTest {

    public static void main(String[] args){
        //JRE路径
        PluginUtils.out(SystemUtils.getJavaHome());

        PluginUtils.out(SystemUtils.getJavaIoTmpDir());

        //项目路径
        PluginUtils.out(SystemUtils.getUserDir());

        //用户路径
        PluginUtils.out(SystemUtils.getUserHome());

        PluginUtils.out(SystemUtils.isJavaAwtHeadless());

        PluginUtils.out(SystemUtils.JAVA_VERSION);

        //操作系统名称
        PluginUtils.out(SystemUtils.OS_NAME);


    }


}
