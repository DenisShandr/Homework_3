package com.academy;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName;
        System.out.print("Enter your name: ");
        userName = in.nextLine().trim(); //Убираем пробелы по краям
        userName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase(); //Имя с заглавной буквы
        int userAge;
        System.out.print("Enter your age: ");
        userAge = in.nextInt();
        System.out.println(String.format("Hello, %s! You are %d years old.", userName, userAge));
        System.out.printf("%s is %d years old.", userName, userAge); //Можно ещё и так
    }
}
