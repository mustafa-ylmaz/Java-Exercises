package com.company;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;

        System.out.println("Matematik notu: ");
        mat = scanner.nextInt();
        System.out.println("fizik notu: ");
        fizik = scanner.nextInt();
        System.out.println("turkce notu: ");
        turkce = scanner.nextInt();
        System.out.println("kimya notu: ");
        kimya = scanner.nextInt();
        System.out.println("muzik notu: ");
        muzik = scanner.nextInt();

        double average = (mat+fizik+turkce+kimya+muzik)/5;
        if (average<=55) {
            System.out.println("kaldınız");
        }
        else {
            System.out.println("geçtiniz");
        }
        System.out.println("ortalamanız "+average);
    }
}
