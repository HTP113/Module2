package Introduction_to_Java.practice.BodyWeight;

import java.util.Scanner;//Import thư viện

public class Main {
    public static void main(String[] args) {
        //tạo đối tượng scanner kiểu Scanner để nhận dữ liệu nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi; //Khai báo các biến kiểu double.
        System.out.println("Your weight (in kilogram):");// in ra màng hình dòng chữ
        weight = scanner.nextDouble();//Yêu cầu người dùng nhập cân nặng
        System.out.println("You height (in meter):");//in ra màng hình dòng chữ
        height = scanner.nextDouble();//và chiều cao.
        bmi = weight / Math.pow(height, 2);//Tính chỉ số BMI bằng cách chia cân nặng (kg) cho bình phương chiều cao (m).
       // Hiển thị tiêu đề bảng kết quả "bmi" và "Interpretation" bằng cách sử dụng phương thức System.out.printf.
        // %s là định dạng để in ra một chuỗi.
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        //Dựa vào giá trị chỉ số BMI để hiển thị kết quả tương ứng.
        // Nếu BMI nhỏ hơn 18,hiển thị "Underweight
        if (bmi < 18)
            //%f là định dạng để in ra giá trị số thực.
         //   %-20 là định dạng để canh lề trái chuỗi kết quả in ra với chiều rộng là 20
            //.3 là định dạng để chỉ lấy hai chữ số thập phân của giá trị số thực.
        System.out.printf("%-20.3f%s", bmi, "Underweight");

        //nếu từ 18 đến dưới 25, hiển thị "Normal"
        else if (bmi < 25.0)
            System.out.printf("%-20.3f%s",bmi,"Normal");
        //nếu từ 25 đến dưới 30, hiển thị "Overweight";

        else if (bmi < 30.0)
            System.out.printf("%-20.3f%s",bmi,"Overweight");
//và nếu lớn hơn hoặc bằng 30, hiển thị "Obese".
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
    }



