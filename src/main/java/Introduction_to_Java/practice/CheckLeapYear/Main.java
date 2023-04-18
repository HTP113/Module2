package Introduction_to_Java.practice.CheckLeapYear;

import java.util.Scanner;// thư viện

public class Main {// tên file là Main.java, do đó tên của lớp cũng là Main.

    public static void main(String[] args) {//Đây là phương thức main(), Chương trình sẽ bắt đầu thực thi từ đây.
        //Tạo một đối tượng Scanner để đọc dữ liệu từ input stream//là từ bàn phím (System.in)
        Scanner scanner = new Scanner(System.in);
        int year;//Khai báo biến year để lưu năm cần kiểm tra.
        System.out.println("Enter a year: ");//In ra thông báo để yêu cầu người dùng nhập vào một năm.

        year = scanner.nextInt();
        //Sử dụng phương thức nextInt() của đối tượng Scanner để đọc một số nguyên từ input stream
        // và lưu vào biến year.
        if (year % 4 == 0) {//Sử dụng toán tử % để kiểm tra xem năm đó có chia hết cho 4 hay không
            if (year % 100 == 0) {//Nếu năm chia hết cho 4, kiểm tra xem năm đó có chia hết cho 100 hay không.
                if (year % 400 == 0) {//Nếu năm chia hết cho 100, kiểm tra xem năm đó có chia hết cho 400 hay không.
                    System.out.printf("%d is a leap year", year);


                } else {//else cuối cùng sẽ được thực thi nếu năm chia hết cho 100 nhưng không chia hết cho 400.
                    System.out.printf("%d is NOT a leap year", year);
                }


            } else {//else thứ hai sẽ được thực thi nếu năm chia hết cho 4 nhưng không chia hết cho 100
                System.out.printf("%d is a leap year", year);
            }


        } else {//được thực thi khi năm không chia hết cho 4
            System.out.printf("%d is NOT a leap year", year);
        }


    }
}

