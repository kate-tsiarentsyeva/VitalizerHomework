package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int i = in.nextInt();
        int sum = 0;
        String length = String.valueOf(i);
        int [] mas = new int [length.length()];

        for (int j = 0; j<mas.length; j++) {
            mas [j] = Character.getNumericValue(length.charAt(j));
            sum = sum + mas [j];
        }
        System.out.println(sum);
    }
}
