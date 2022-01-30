package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,select;

        System.out.println("sayı 1:");
        n1 = scanner.nextInt();
        System.out.println("sayı 2:");
        n2 = scanner.nextInt();
        System.out.println("1-toplama\n2-Çıkarma" +
                "\n3-Çarpma\n4-bölme");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("geçersiz islem");

        }
    }
}
