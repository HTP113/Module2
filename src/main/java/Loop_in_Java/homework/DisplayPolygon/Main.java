package Loop_in_Java.homework.DisplayPolygon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Print the rectangle \n");
            System.out.println("2.Print the square triangle \n");
            System.out.println("3.Print isosceles triangle \n");
            System.out.println("0.Exit  \n");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều rộng:");
                    int widthRect = input.nextInt();
                    System.out.print("Nhập chiều cao: ");
                    int heightRect = input.nextInt();
                    for (int i = 0; i < heightRect; i++) {
                        for (int j = 0; j < widthRect; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
            }
        }
    }
}