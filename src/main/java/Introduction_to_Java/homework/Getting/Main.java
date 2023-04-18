package Introduction_to_Java.homework.Getting;

import java.util.Scanner;// thư viện
import java.lang.Integer;// chống trôi lệnh

public class Main {
    public static void main(String[] args) {// pt là điểm bắt đầu của chương trình.
  //tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím.
        Scanner scanner = new Scanner(System.in);
        //sử dụng để hiển thị thông báo cho người dùng nhập tên của họ.
        System.out.println("Enter your name:");
//đọc dữ liệu người dùng nhập vào và lưu vào biến name.
       String name = scanner.nextLine();
       //in ra lời chào với tên mà người dùng đã nhập vào.
       System.out.println("Hello:" + name);
       //chuyển đổi một chuỗi (string) thành một số nguyên (integer).
        Integer.parseInt(scanner.nextLine());






    }
}
