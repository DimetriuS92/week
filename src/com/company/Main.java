package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели:");
        String day = scanner.nextLine();
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println("будний день - работай");
        } else if (day.equals("saturday") || day.equals("sunday") ) {
            System.out.println("выходной день - отдыхай");
        }
    }
}
