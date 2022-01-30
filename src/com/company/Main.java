package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int mat,muzik,fizik,kimya,turkce,tarih;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat = scanner.nextInt();
        System.out.println("muzik notunuz:");
        muzik = scanner.nextInt();
        System.out.println("fizik notunuz:");
        fizik = scanner.nextInt();
        System.out.println("kimya notunuz:");
        kimya = scanner.nextInt();
        System.out.println("turkce notunuz:");
        turkce = scanner.nextInt();
        System.out.println("tarih notunuz:");
        tarih = scanner.nextInt();

        int toplam = (muzik+mat+fizik+kimya+turkce+tarih);
        double sonuc = toplam/6.0;
        System.out.println("ortalamanız: "+sonuc);
        System.out.println(sonuc>60?"Geçtiniz":"kaldınız");
    }
}

