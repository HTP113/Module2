package Introduction_to_Java.practice.UseOperator;

import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
       float width; //khai báo biến
       float height;// khai báo biến
//Chương trình tạo một đối tượng Scanner để đọc dữ liệu nhập dữ liệu từ bàn phím
       Scanner sc = new Scanner(System.in);


        //phương thức nextFloat() của đối tượng Scanner để đọc giá trị của chiều rộng và chiều cao từ bàn phím
        // và lưu giá trị vào hai biến tương ứng width và height.
      System.out.println("Enter width: ");
       width = sc.nextFloat();

        System.out.println("Enter height: ");
       height = sc.nextFloat();
// tính diện tích của hình chữ nhật bằng
// cách nhân chiều rộng với chiều cao và gán giá trị cho biến area.
       float area = width * height;

       System.out.println("Area is: " + area);
    }
}
