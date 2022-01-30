package com.company;

import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("armut?");
        double armut = scanner.nextDouble()*2.14;
        System.out.println("elma?");
        double elma = scanner.nextDouble()*3.67;
        System.out.println("domates?");
        double domates = scanner.nextDouble()*1.11;
        System.out.println("muz?");
        double muz = scanner.nextDouble()*0.95;
        System.out.println("patlican?");
        double patlican = scanner.nextDouble()*5;

        double tutar=armut+elma+domates+muz+patlican;
        System.out.println("tutar: "+ tutar);
    }
}
