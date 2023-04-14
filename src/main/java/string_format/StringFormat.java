package string_format;

public class StringFormat {
    public static void main(String[] args) {
        System.out.printf("%s %d %f\n", "Hello", 56, 5.12345678);
        System.out.printf("%10s %d %.2f\n", "Hello", 56, 5.123456784567893234);
        System.out.printf("%-10s %d %.2f\n", "Hello", 56, 5.123456784567893234);


    }
}
