package com.academy;

public class Task_4 {
    public static void main(String[] args) {
        String str = "   This   line  is   for  example   ";
        str = str.trim();
        int count = 0;
        String[] arrayOfSplits = str.split("\\s+");
        for (String a : arrayOfSplits) {
            if (!str.equals("")) {
                count++;
                System.out.print(count + ". ");
                System.out.println(a);
            } else {
                count = 0;
            }
        }
        System.out.println("Amount of words: " + count);
    }
}
