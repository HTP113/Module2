package Loop_in_Java.note;

public class Note {

}
/**
 * forVòng lặp for được sử dụng để lặp lại một khối mã một số lần cụ thể.
 * for (khởi tạo; điều kiện; bước nhảy) {
 *   // các lệnh thực hiện trong vòng lặp
 * }
 *vd
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }

 or
 int sum = 0;
 for (int i = 1; i <= 10; i++) {
 sum += i;
 }
 System.out.println("Tổng các số từ 1 đến 10 là: " + sum);

 for (khởi tạo; điều kiện; bước nhảy) {
 // các lệnh thực hiện trong vòng lặp
 }

 *Vòng lặp while:
 * Vòng lặp while được sử dụng để lặp lại một khối mã cho đến khi điều kiện không còn đúng nữa.

 while (điều kiện) {
 // các lệnh thực hiện trong vòng lặp
 }
 vd
 *int i = 0;
 * while (i < 10) {
 *   System.out.println(i);
 *   i++;
 * }
 * or
 * int sum = 0;
 * int i = 1;
 * while (i <= 10) {
 *   sum += i;
 *   i++;
 * }
 * System.out.println("Tổng các số từ 1 đến 10 là: " + sum);
 *
 *
 *
 *Vòng lặp do-while:
 * Vòng lặp do-while tương tự với vòng lặp while,
 nhưng khối lệnh được thực hiện ít nhất một lần, ngay cả khi điều kiện ban đầu là sai.

 *do {
 *   // các lệnh thực hiện trong vòng lặp
 * } while (điều kiện);
 * vd
 *int i = 0;
 * do {
 *   System.out.println(i);
 *   i++;
 * } while (i < 10);
 *or
 *import java.util.Scanner;
 *
 * public class DoWhileExample {
 *   public static void main(String[] args) {
 *     Scanner scanner = new Scanner(System.in);
 *     String password = "abc123";
 *     String input;
 *     do {
 *       System.out.print("Nhập mật khẩu: ");
 *       input = scanner.nextLine();
 *     } while (!input.equals(password));
 *     System.out.println("Mật khẩu đúng.");
 *   }
 * }
 *break được sử dụng để kết thúc vòng lặp và chuyển tiếp đến câu lệnh ngay sau vòng lặp
 *
 *for (int i = 0; i < 10; i++) {
 *     if (i == 5) {
 *         break;
 *     }
 *     System.out.println(i);
 * }
 * System.out.println("Kết thúc vòng lặp");
 *for sẽ in ra các giá trị từ 0 đến 9. Khi giá trị của biến i đạt tới 5,
 *  lệnh break được thực hiện và vòng lặp sẽ kết thúc. Sau đó, chương trình sẽ tiếp tục thực hiện câu lệnh "Kết thúc vòng lặp".
 *
 *continue được sử dụng để bỏ qua phần còn lại của vòng lặp hiện tại và chuyển đến vòng lặp tiếp theo
  hoặc kết thúc vòng lặp nếu không còn phần tử nào
 *
 * for (int i = 0; i < 10; i++) {
 *     if (i % 2 == 0) {
 *         continue;
 *     }
 *     System.out.println(i);
 * }
 * System.out.println("Kết thúc vòng lặp");
 *vòng lặp for sẽ in ra các số lẻ từ 1 đến 9. Khi giá trị của biến i là một số chẵn, lệnh continue được thực hiện và phần thân của vòng lặp sẽ bị bỏ qua. Sau đó,
 * vòng lặp sẽ tiếp tục với giá trị i tiếp theo.
 */