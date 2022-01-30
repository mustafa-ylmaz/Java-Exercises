package com.company;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, passWord;

        System.out.println("k.adınız:");
        userName = scanner.nextLine();
        System.out.println("şifre:");
        passWord = scanner.nextLine();

        if (userName.equals("user") && passWord.equals("java"))
            System.out.println("giriş yapıldı");
        else
            System.out.println("hatalı giriş");
    }
}
