package com.company;

import java.util.Scanner;

public class daire {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double pi = 3.14;

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("alan:"+alan);
        System.out.println("çevre" + cevre);
    }
}
