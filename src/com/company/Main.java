package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    // Регулярные выражения (фильтр)

        // Находим символ
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()){
            System.out.println(m.start() + " " + m.group() +" ");
        }

        // Находим слово
        Pattern p2 = Pattern.compile("cat");
        Matcher m2 = p2.matcher("About a cats and dogs");
        while (m2.find()){
            System.out.println(m2.start() + " " + m2.group() +" ");
        }
    }
}
