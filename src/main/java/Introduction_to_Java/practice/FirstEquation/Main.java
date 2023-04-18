package Introduction_to_Java.practice.FirstEquation;

import java.util.Scanner;

//a * x + b = c.
public class Main {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");//in ra thông báo yêu cầu nhập hệ số ct
        System.out.println("Given a equation as 'a * x + b =c' , please enter constants");//in ra thông báo
        //Sử dụng lớp Scanner để đọc dữ liệu từ bàn phím. Đầu tiên
        Scanner scanner = new Scanner(System.in);
        // chương trình in ra thông báo để yêu cầu người dùng nhập giá trị cho các hằng số a, b và c.
        //sử dụng lớp Scanner để đọc giá trị người dùng nhập từ bàn phím và lưu chúng vào các biến a, b và c.
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        // sd câu lệnh check
        if (a != 0) {
            //Nếu a khác 0, chương trình tính giá trị của ẩn số x
            // bằng cách sử dụng công thức (c - b) / a và in ra kết quả thông qua lệnh System.out.printf.
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);

        } else {

            if (b == c) {
                System.out.println("The solution is all x!");
                //Nếu a bằng 0, chương trình sẽ kiểm tra giá trị của b và c.
                // Nếu b bằng c, nghĩa là phương trình là đúng với mọi giá trị của x,
                // chương trình sẽ in ra thông báo "The solution is all x!".
            } else {
                // Nếu b khác c, nghĩa là không có giá trị của x nào thỏa mãn phương trình,
                // chương trình sẽ in ra thông báo "No solution".
                System.out.println("No solution");
            }

        }

    }
}
