package com.Note;
/**Các ký tự định dạng trong printf() của Java được sử dụng để định dạng các giá trị in ra. Dưới đây là một số ký tự định dạng thường sử dụng:

        %s: đại diện cho chuỗi (string)
        %d: đại diện cho số nguyên (integer)
        %f: đại diện cho số thực (floating point)
        %c: đại diện cho ký tự (character)
        %b: đại diện cho giá trị boolean (true hoặc false)
        %n: ký tự xuống dòng (line break)
 ví dụ:
 String name = "John";
 int age = 30;
 double height = 1.75;

 System.out.printf("My name is %s and I am %d years old. My height is %.2f meters.%n", name, age, height);
 // Kết quả: My name is John and I am 30 years old. My height is 1.75 meters.

 **/
public class Note {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        double height = 1.75;

        System.out.print("My name is ");
        System.out.print(name);
        System.out.print(" and I am ");
        System.out.print(age);
        System.out.print(" years old.");
// Kết quả: My name is John and I am 30 years old.

        System.out.printf("My name is %s and I am %d years old. My height is %.2f meters.", name, age, height);
// Kết quả: My name is John and I am 30 years old. My height is 1.75 meters.

        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println("My height is " + height + " meters.");
// Kết quả:
// My name is John and I am 30 years old.
// My height is 1.75 meters.

    }
}
