package Introduction_to_Java.practice;
//nhập gói java.util.Date vào lớp Main,
// cho phép sử dụng lớp Date để làm việc với thời gian.
import java.util.Date;

public class Main {
    //khai báo lớp Main được định nghĩa bởi từ khóa "public".
    //Lớp Main chứa phương thức "main" để bắt đầu chương trình.
    public static void main(String[] args) {//có kiểu trả về là void, 1tham số kiểu mảng String.các đối số ko sd
      // tạo một đối tượng Date mới gọi là "now" để đại diện cho thời gian hiện tại
       Date now = new Date();//dối tượng được khởi tạo bằng cách gọi hàm tạo không tham số của lớp Date.
       //câu lệnh để in ra màn hình hiện tại của đối tượng Date 'now'
        System.out.println("this is: " + now);
    }
}
