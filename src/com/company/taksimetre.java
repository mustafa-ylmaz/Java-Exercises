package com.company;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km; double perKm=2.20,total=10;
        Scanner scanner = new Scanner(System.in);

        km = scanner.nextInt();

        total += (perKm * km);
        System.out.println(total<20?20:total);

    }
}
