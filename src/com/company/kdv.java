package com.company;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOrani=0.18;
        Scanner scanner = new Scanner(System.in);

        tutar = scanner.nextInt();

        if(tutar>0 && tutar<= 1000) {
        double kdvliTutar = tutar*kdvOrani + tutar;
            System.out.println(kdvliTutar);
        }
        else {
            double kdvliTutar = tutar*0.08 + tutar;
            System.out.println(kdvliTutar);
        }


    }
}
