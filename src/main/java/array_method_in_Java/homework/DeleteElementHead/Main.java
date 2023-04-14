package array_method_in_Java.homework.DeleteElementHead;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng đã nhập là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Nhập phần tử bạn muốn xóa:");
        int X = input.nextInt();
        int k,index_delete;
        for (index_delete = k = 0; k < arr.length; k++) {
            if (X != arr[k]) {
                arr[index_delete] = arr[k];
                index_delete++;
            }
        }
        for (int l = arr.length -1; l >= index_delete; l--){
            arr[l] = 0;
        }
        System.out.print("Mảng sau khi xóa là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
