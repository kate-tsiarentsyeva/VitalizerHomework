package com.company;

public class task3 {

    public static void main(String[] args) {

        String names[] = new String[]{"Вова", "Коля", "Даша", "Маша", "Вася"};

        for (int i = 0;i < names.length; i++) {
            switch (names[i]) {
                case ("Вова"):
                    System.out.println("Вова, привет!");
                    break;
                case ("Коля"):
                    System.out.println("Коля, пока!");
                    break;
                case ("Даша"):
                    System.out.println("Даша! Давно не виделись!");
                    break;
                case ("Маша"):
                    System.out.println("Маша, как дела?");
                    break;
                default:
                    System.out.println("О, а это кто?");
                    ;
            }
        }
    }
}
