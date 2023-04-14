package string_format;

import java.util.Scanner;

public class TroiLenh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn:");
        String name = scanner.nextLine();
//        scanner.nextLine();

        System.out.println("Nhập số:");

        int a = scanner.nextInt();



        System.out.println(name);
        System.out.println(a*2);
    }
}
