package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int education = 0, grading = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("enter your years of education");
        education = s.nextInt();
        System.out.println("enter your total bagrut grade");
        grading = s.nextInt();

        if ((education >= 15) || (education > 12 && grading > 90)) {
            System.out.println("congratulation," +
                    " you have accepted to pilot");
        }
        else
            System.out.println("rejected");

    }
}
