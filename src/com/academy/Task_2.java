package com.academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static void main(String[] args) {
        String usualString = "";
        StringBuilder builderString = new StringBuilder();
        Integer temp;


        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1001);
            usualString += temp.toString() + " ";
        }
        System.out.println("String line: ");
        System.out.println(usualString);
        changeTwoDigitNumber(usualString);

        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1001);
            builderString.append(temp + " ");
        }
        System.out.println("StringBuilder line: ");
        System.out.println(builderString);
        changeTwoDigitNumber(builderString.toString());

    }

    private static void changeTwoDigitNumber(String incomingString) {
        Pattern pattern = Pattern.compile("\\s+\\d{2}\\s+");
        Matcher matcher = pattern.matcher(incomingString);
        System.out.println("Modified line: ");
        System.out.println(matcher.replaceAll(" -1 "));
    }
}
