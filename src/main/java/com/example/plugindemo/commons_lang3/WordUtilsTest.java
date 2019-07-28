package com.example.plugindemo.commons_lang3;

import org.apache.commons.lang3.text.WordUtils;


public class WordUtilsTest {
    public static void main(String[] args){
        String capitalizedName = WordUtils.capitalizeFully("abc_def_gh", '_');
        out(capitalizedName);
        String msg = "It is a truth universally acknowledged,that a single man in possession of a good fortune, must be in want of a wife.";
        String gg = WordUtils.capitalizeFully(msg);
        out(gg);
    }
    static void out(Object o){
        System.out.println(o);
    }

}
