package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String day = "monday";
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println("будний день - работай");
        } else if (day.equals("saturday") || day.equals("sunday") ) {
            System.out.println("выходной день - отдыхай");
        }
    }
}
