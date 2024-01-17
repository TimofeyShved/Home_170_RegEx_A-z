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

        // Находим выражение
        // можно использовать \\
        //Pattern p3 = Pattern.compile("1\\+1=2");
        // или \\Q \\E (дословно)
        Pattern p3 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m3 = p3.matcher("22+1=23, 1+1=2, 2*4=8");
        while (m3.find()){
            System.out.println(m3.start() + " " + m3.group() +" ");
        }

        // Находим слово
        // можно использовать []
        Pattern p4 = Pattern.compile("gr[ae]y");
        Matcher m4 = p4.matcher("gruy, gramy, grey, gray, groy, greay");
        while (m4.find()){
            System.out.println(m4.start() + " " + m4.group() +" ");
        }
    }
}
