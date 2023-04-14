package array_method_in_Java.homework.FindMinimumValueArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SIZE =5;
        int [] arr = new int [SIZE];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < SIZE;i++){
            System.out.println("Nhập giá trị cho phần tử thứ " + (i+1)+ ":");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < SIZE;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Gía trị nhỏ nhất trong mảng là: " + min);
    }
}
