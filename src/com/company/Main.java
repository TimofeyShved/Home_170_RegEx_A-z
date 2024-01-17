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

    }
}
