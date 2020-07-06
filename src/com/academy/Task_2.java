package com.academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static void main(String[] args) {
        String usualString = "";
        StringBuilder builderString = new StringBuilder();
        Integer temp;
        Pattern pattern = Pattern.compile("\\s+\\d{2}\\s+");


        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1001);
            usualString += temp.toString() + " ";
        }
        System.out.println("String line: ");
        System.out.println(usualString);
        Matcher matcher = pattern.matcher(usualString);
        System.out.println("Modified String line: ");
        System.out.println(matcher.replaceAll(" -1 "));

        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1001);
            builderString.append(temp + " ");
        }
        System.out.println("StringBuilder line: ");
        System.out.println(builderString);
        matcher = pattern.matcher(builderString);
        System.out.println("Modified StringBuilder line: ");
        System.out.println(matcher.replaceAll(" -1 "));
    }
}
