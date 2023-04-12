package array_method_in_Java.practice.SmallestValueArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 10, 6, 9};
        int index = minVaLue (arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
    public static int minVaLue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
