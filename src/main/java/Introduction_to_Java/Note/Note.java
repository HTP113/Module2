/**
 * java là một ngôn ngữ lập trình hướng đối tượng
 * Tính đa nền tảng
 * Tính bảo mật
 * Tính dễ học và sử dụng
 * Tính linh hoạt và mở rộng

 --
 --
 Có nhiều định dạng khác nhau có thể được sử dụng trong hàm printf() của Java để định dạng và in ra giá trị của các biến. Sau đây là một số ví dụ về định dạng phổ biến:

 %d: in ra giá trị của biến kiểu số nguyên.
 %f: in ra giá trị của biến kiểu số thực.
 %s: in ra giá trị của biến kiểu chuỗi.
 %c: in ra giá trị của biến kiểu ký tự.
 %b: in ra giá trị của biến kiểu boolean.
 Bạn cũng có thể sử dụng các ký tự đặc biệt để thêm các hiệu ứng định dạng, ví dụ:

 %20s: canh lề phải chuỗi với chiều rộng là 20 ký tự.
 %-20s: canh lề trái chuỗi với chiều rộng là 20 ký tự.
 %d%%: in ra ký tự %.

package com.Note;
Các ký tự định dạng trong printf() của Java được sử dụng để định dạng các giá trị in ra. Dưới đây là một số ký tự định dạng thường sử dụng:

        %s: đại diện cho chuỗi (string)
        %d: đại diện cho số nguyên (integer)
        %f: đại diện cho số thực (floating point)
        %c: đại diện cho ký tự (character)
        %b: đại diện cho giá trị boolean (true hoặc false)
        \n: ký tự xuống dòng (line break)
        \t: tab
 ví dụ:
 String name = "John";
 int age = 30;
 double height = 1.75;

 System.out.printf("My name is %s and I am %d years old. My height is %.2f meters.%n", name, age, height);
 // Kết quả: My name is John and I am 30 years old. My height is 1.75 meters.


public class Note {
 --public: Đây là từ khóa được sử dụng để chỉ ra phạm vi truy cập của lớp hoặc phương thức trong Java
 --Note có phạm vi truy cập là công khai, có thể được truy cập từ bất kỳ đâu. trunfd với tên của mã nguồn jv
--class: Đây là từ khóa được sử dụng để khai báo một lớp trong Java. Lớp Note đc khai báo ở đây



 public static void main(String[] args) {
 --Đây là phương thức chính của chương trình Java. Tất cả các chương trình Java đều phải có một phương thức main() như thế này để có thể chạy được.
 Phương thức này là công khai(public)
 tĩnh(static),
 không trả về giá trị (void)
 và có tham số đầu vào là một mảng các đối số (String[] args).

        String name = "John";
        int age = 30;
        double height = 1.75;

        System.out.print("My name is ");
        System.out.print(name);
        System.out.print(" and I am ");
        System.out.print(age);
        System.out.print(" years old.");

 System.out.println("Hello, World!");: Đây là lệnh in ra chuỗi "Hello, World!" trên màn hình.
// Kết quả: My name is John and I am 30 years old.

        System.out.printf("My name is %s and I am %d years old. My height is %.2f meters.", name, age, height);
// Kết quả: My name is John and I am 30 years old. My height is 1.75 meters.

        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println("My height is " + height + " meters.");
// Kết quả:
// My name is John and I am 30 years old.
// My height is 1.75 meters.

------------Trong Java, còn rất nhiều phương thức nextX() để nhập các kiểu dữ liệu khác nhau.-----nextBoolean(): nhập một giá trị kiểu boolean từ bàn phím (true hoặc false).
 nextBoolean(): nhập một giá trị kiểu boolean từ bàn phím (true hoặc false
 nextByte(): nhập một giá trị kiểu byte từ bàn phím.
 nextInt(): nhập một giá trị kiểu số nguyên (int) từ bàn phím.
 nextLong(): nhập một giá trị kiểu số long từ bàn phím.
 nextFloat(): nhập một giá trị kiểu số thực (float) từ bàn phím.
 nextDouble(): nhập một giá trị kiểu số thực (double) từ bàn phím.
 nextLine(): nhập một chuỗi từ bàn phím, bao gồm cả khoảng trắng.


    }
}



 **/