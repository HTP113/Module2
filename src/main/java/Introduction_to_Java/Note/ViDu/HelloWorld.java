
package Introduction_to_Java.Note.ViDu;

public class HelloWorld {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);
    }

    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }
        }
/** Trong chương trình trên, JDK được sử dụng để biên dịch chương trình thành mã bytecode Java:
javac HelloWorld.java
Sau khi biên dịch, JRE được sử dụng để thực thi chương trình, bằng cách chạy lệnh sau:
  java HelloWorld
Khi chạy chương trình, JVM sẽ tải và thực thi mã bytecode Java, và kết quả được hiển thị trên màn hình:
        Hello, World!

           JDK được sử dụng để biên dịch chương trình,
        JDK cung cấp các công cụ để phát triển và biên dịch ứng dụng Java,
        bao gồm trình biên dịch, trình gỡ lỗi và các thư viện phát triển.

           JRE được sử dụng để thực thi chương trình
         JRE cung cấp các thành phần cần thiết để thực thi các ứng dụng Java,
         bao gồm máy ảo Java (JVM), thư viện tiêu chuẩn và các tập tin cấu hình.

           JVM được sử dụng để tải và thực thi mã bytecode Java.
 VM là một phần mềm độc lập nền tảng được sử dụng để thực thi các ứng dụng Java.
 JVM tải mã bytecode Java và thực thi nó trên hệ thống của bạn.
   -------- JDK, JRE và JVM là các thành phần khác nhau trong hệ sinh thái Java,------------
 ------------tương tự như các dụng cụ, nguyên liệu và lò nướng được sử dụng để nấu món ăn.--------

 ----hằng số được khai báo bằng từ khóa final.
 Sau khi được khai báo, giá trị của hằng số không thể thay đổi.
 final int PI = 3.14159265359;

 ---Stack là một vùng nhớ được sử dụng để lưu trữ các tham số và các biến local của phương thức mỗi khi một phương thức được gọi ra.



-- Heap là một vùng nhớ trong bộ nhớ được sử dụng để lưu trữ các đối tượng
 khi từ khóa new được gọi ra, các biến static và các biến toàn cục (biến instance)



 String tenSach = "Lap trinh Java";
        int namXuanBan = 2021;
        double giaTien = 15.5;
        boolean conSach = true;
        char maKho = 'M';
        System.out.println("Ten sach: "+ tenSach);
        System.out.println("Nam: "+ namXuanBan);
        System.out.println("Gia: "+ giaTien);
        System.out.println("Con sach: "+ conSach);
        System.out.println("Ma kho: "+ maKho);

 các kiểu dữ liệu khác nhau trong Java: cách khai báo


 int age = 27;dùng để lưu trữ giá trị số nguyên trong phạm vi từ -2,147,483,648 đến 2,147,483,647.
 double salary = 5000.50;
 boolean isMarried = true;  dùng để lưu trữ giá trị true hoặc false.
 char gender = 'M';  dùng để lưu trữ một ký tự Unicode.
 String name = "John Smith";
 byte b = 100;  dùng để lưu trữ giá trị số nguyên trong phạm vi từ -128 đến 127
 short s = 1000;  dùng để lưu trữ giá trị số nguyên trong phạm vi từ -32,768 đến 32,767.
 dùng để lưu trữ giá trị số nguyên trong phạm vi từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807. long l = 1234567890;
 float f = 3.14f;  dùng để lưu trữ giá trị số thực có độ chính xác đơn giản.
 long l = 1234567890;  dùng để lưu trữ giá trị số nguyên trong phạm vi từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807
*/


