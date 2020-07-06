package com.academy;

public class Task_1 {

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

        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1001);
            builderString.append(temp + " ");
        }
        System.out.println("StringBuilder line: ");
        System.out.println(builderString);
    }
}
