package com.company;

import java.util.Scanner;

public class kitleIndeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuz:");
        double boy = scanner.nextDouble();
        System.out.println("boyunuz:");
        double kilo = scanner.nextDouble();

        double indeks = (kilo/boy)*boy;
        System.out.println("kitle indeksiniz :" + indeks);

    }
}
