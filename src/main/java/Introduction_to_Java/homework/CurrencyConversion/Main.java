package com.homework.CurrencyConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //khai báo hai biến: vndvà usd.
double vnd =23000;
double usd;
//Scannerđối tượng mới để đọc đầu vào của người dùng từ bảng điều khiển.
        Scanner scanner = new Scanner(System.in);
        // nhập số USD cần chuyển đổi.
        System.out.println("Mời bạn nộp số tiền USD: ");
        //sd nextDouble()phương thức của Scannerlớp để đọc đầu vào
        // của người dùng dưới dạng double giá trị và gán nó cho usd biến
        usd = scanner.nextDouble();
        //gán kết quả cho biến quydoi.
        double quydoi = usd * 23000;
        // in ra giá trị của 'quydoi'
        System.out.println("Gía trị VND: " + quydoi);
    }
}

