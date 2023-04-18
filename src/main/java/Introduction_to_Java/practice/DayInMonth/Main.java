package Introduction_to_Java.practice.DayInMonth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //khai báo một đối tượng Scanner để đọc dữ liệu đầu vào từ bàn phím.
        Scanner scanner = new Scanner(System.in);
         //Chương trình sẽ in ra
        System.out.println("Which month that you want to count days? ");
//nhập vào giá trị của tháng từ bàn phím bằng phương thức nextInt() của đối tượng Scanner.
        int month = scanner.nextInt();
//sd switch-case để kiểm tra giá trị của tháng nhập vào
// và gán số ngày tương ứng vào biến dayInMonth.
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "28 or 29";
                //Nếu giá trị của tháng là 2, có thể có 28 hoặc 29 ngày (tùy theo năm nhuận),
                // biến dayInMonth được gán giá trị là "28 or 29".
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //Nếu giá trị của tháng là 1, 3, 5, 7, 8, 10 hoặc 12, có 31 ngày trong tháng,
                // nên biến dayInMonth được gán giá trị là "31"
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //Nếu giá trị của tháng là 4, 6, 9 hoặc 11, có 30 ngày trong tháng,
                // nên biến dayInMonth được gán giá trị là "30".
                dayInMonth = "30";
                break;
            default:
                //Nếu giá trị của tháng không nằm trong các giá trị trên,
                // biến dayInMonth được gán giá trị rỗng.
                dayInMonth = "";
                break;

        }//Nếu giá trị của dayInMonth khác rỗng, chương trình sẽ in ra thông báo "The month 'x' has y days!"
        if (!dayInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, dayInMonth);
       //Nếu giá trị của dayInMonth là rỗng, chương trình sẽ in ra thông báo "Invalid input! ko hợp lệ
        else System.out.println("Invalid input!");
    }
}
//Ví dụ: Nếu người dùng nhập vào giá trị của tháng là 4, chương trình sẽ gán giá trị "30" cho biến dayInMonth
// và in ra thông báo "The month '4' has 30 days!".