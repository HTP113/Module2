package Loop_in_Java.homework.DisplayPrime_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Thêm số nguyên tố nếu bạn muốn hiển thị:");
        int number = input.nextInt();
        int count = 0;
        int point = 0;
        for (int N = 2; N < 1000; N++) {
            if (point < number) {
                for (int j = 1; j <= N; j++) {
                    if (N % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(N);
                    point += 1;
                }
                count = 0;

            } else {
                break;
            }
        }
    }
}
