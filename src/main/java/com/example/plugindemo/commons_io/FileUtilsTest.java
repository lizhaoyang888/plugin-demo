package com.example.plugindemo.commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.util.List;

public class FileUtilsTest {

    public static void main(String[] args) throws Exception {
        File file = new File("./pom.xml");
        List<String> lines = FileUtils.readLines(file, "UTF-8");

        LineIterator it = FileUtils.lineIterator(file, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println(line);
            }
        } finally {
            LineIterator.closeQuietly(it);
        }
    }
}
