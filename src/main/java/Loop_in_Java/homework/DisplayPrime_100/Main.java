package Loop_in_Java.homework.DisplayPrime_100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.print("1.Print the rectangle \n");
            System.out.print("2.Print the square triangle \n");
            System.out.print("3.Print isosceles triangle \n");
            System.out.print("0.Exit \n");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

        }
    }
}
