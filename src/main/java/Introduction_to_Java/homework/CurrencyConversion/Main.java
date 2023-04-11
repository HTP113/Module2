package com.homework.CurrencyConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double vnd =23000;
double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nộp số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gía trị VND: " + quydoi);
    }
}

