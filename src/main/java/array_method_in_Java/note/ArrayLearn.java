package array_method_in_Java.note;

public class ArrayLearn {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 2, 4};

        System.out.println(arrayTotring(numbers));
        reverseArray(numbers);
        System.out.println(arrayTotring(numbers));


    }
//    public static void basic() {
//        int a = 5;
//        int b = 2;
//
//        System.out.println(a + " cong " + b + " = " + (a+b));
//
//        System.out.printf("%s cong %s = %s\n", a, b, (a+b));
//    }
    public static int findMaxValue(int [] numbers){
        int max = numbers[0];
        for (int i = 1;i< numbers.length;i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    // viet ham dao nguoc mang// int[] numbers = {1, 9, 2, 4};
    public static void reverseArray(int[] numbers){
        for (int i = 0; i < numbers.length / 2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1- i];
            numbers[numbers.length - 1 -i] = temp;
        }
    }

    public static String arrayTotring(int[] numbers){
        String str = "[";
        for (int i = 0; i < numbers.length; i++){
            str += numbers[i];
            if (i < numbers.length - 1){
                str += ", ";
            }else {
                str += "]";
            }
        }
        return str;
    }
}
