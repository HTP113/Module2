package array_method_in_Java.note.Note;

public class Note {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    //Trong đoạn mã trên, phương thức main () không có tham số và không có kiểu dữ liệu trả về.
    // Nó chỉ in ra một chuỗi "Hello World!" ra màn hình.


}




/**
 * Mảnglàmộtbiếnthamchiếuđếnmộtloạt giátrị liêntiếp nhau
 * cócùngkiểudữliệu
 Tênmảng:Tuânthủ theo quytắcđặttêncủabiến
 • Phầntử:Cácgiátrịđược lưu trữtrongmảng
 • Chỉ số:Vịtrí củacácphầntửtrongmảng.Chỉ sốbắtđầutừ0.
 • Độdài:S
 cú pháp
 vd :int[] numbers = new int[5];
 int kiểu dữ liệu
 numbers tên mảng
 5 là số lượng phần tử trong mảng

 vd khác String[] names = {"John", "Mary", "Tom"};
 String là kiểu dữ liệu
 names là tên mảng
 john,mary... giá trị các phần tử


các phương thức
 length: Trả về độ dài của mảng, tức là số lượng phần tử trong mảng.

 clone: Tạo một bản sao của mảng, có cùng kích thước và các phần tử giống nhau với mảng gốc.

 equals: So sánh hai mảng với nhau, trả về giá trị true nếu hai mảng có cùng kích thước
 và các phần tử giống nhau, và false nếu ngược lại.

 fill: Điền một giá trị cho tất cả các phần tử của mảng.

 sort: Sắp xếp các phần tử của mảng theo thứ tự tăng dần hoặc giảm dần.

 binarySearch: Tìm kiếm một giá trị trong mảng đã được sắp xếp theo thứ tự tăng dần hoặc giảm dần.

 toString: Trả về một chuỗi biểu diễn cho mảng, hiển thị các phần tử của mảng và giá trị của chúng.
-------------
 public void sayHello() {
 System.out.println("Hello World!");
 }
 Trong đoạn mã trên, phương thức sayHello() không có tham số và không có kiểu dữ liệu trả về.
 Nó chỉ in ra một chuỗi "Hello World!" ra màn hình.
 ------------
 public void greetUser(String name) {
 System.out.println("Hello " + name + "!");
 }
 Phương thức greetUser() có một tham số kiểu String là name, và không có kiểu dữ liệu trả về.
 Nó sẽ in ra một chuỗi chào mừng tới người dùng có tên được truyền vào.

 ------------
 public int getRandomNumber() {
 Random random = new Random();
 return random.nextInt(100);
 }
 Phương thức getRandomNumber() không có tham số và có kiểu dữ liệu trả về là int.
 Nó sẽ trả về một số nguyên ngẫu nhiên từ 0 đến 99.
 -----------
 public double calculateBMI(double weight, double height) {
 double bmi = weight / (height * height);
 return bmi;
 }

 Phương thức calculateBMI() có hai tham số kiểu double là weight (cân nặng) và height (chiều cao)
 , và có kiểu dữ liệu trả về là double. Nó tính chỉ số BMI (Body Mass Index) của người dùng
 dựa trên cân nặng và chiều cao được truyền vào, và trả về kết quả này.






 */