package com.example.plugindemo.commons_io;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.net.URL;

public class IOUtilsTest {

    public static void main(String[] args) throws Exception {
        InputStream in = new URL( "http://commons.apache.org" ).openStream();
        try {
            System.out.println(IOUtils.toString(in));
        }finally {
            IOUtils.closeQuietly(in);
        }
    }
}
