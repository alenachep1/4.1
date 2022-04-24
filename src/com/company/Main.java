package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        while (a < 11) {
            System.out.print(+a+" ");
            a++;
        }

        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(+i+" ");

        }

        System.out.println();
        int i = 5;
        for (; i < 31; i++) {
            if (i % 7 == 5) {
                System.out.println("Сегодня пятница, " + i + " число");
            }
        }


        int n = 2021;
        for (n = 1821; n < 2121; n++) {
            if (n % 79 == 0) {
                System.out.println(n + "");
            }
        }
    }
}
