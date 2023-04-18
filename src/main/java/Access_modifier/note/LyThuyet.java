package Access_modifier.note;

public class LyThuyet {




}
/**
 -- --biến tham trị (pass-by-value) là khi một giá trị được truyền
 vào hàm thông qua tham số và hàm sử dụng bản sao của giá trị đó.
 Khi giá trị bản sao này được thay đổi, giá trị gốc không bị ảnh hưởng.
vd:
 public static void main(String[] args) {
 int a = 10;
 int b = 20;

 // truyền giá trị của a và b vào hàm swap
 swap(a, b);

 System.out.println("a = " + a); // a vẫn là 10
 System.out.println("b = " + b); // b vẫn là 20
 }

 public static void swap(int x, int y) {
 int temp = x;
 x = y;
 y = temp;
 }

 ----biến tham chiếu (pass-by-reference) là khi một tham chiếu tới một đối tượng được truyền vào hàm.
 Khi tham chiếu này được sử dụng để thay đổi thuộc tính của đối tượng, thì đối tượng gốc cũng bị ảnh hưởng.

vd:public static void main(String[] args) {
 MyClass obj = new MyClass();
 obj.value = 10;

 // truyền tham chiếu tới đối tượng obj vào hàm changeValue
 changeValue(obj);

 System.out.println(obj.value); // giá trị thuộc tính value đã được thay đổi thành 20
 }

 public static void changeValue(MyClass obj) {
 obj.value = 20;
 }

 class MyClass {
 public int value;
 }

-----Access modifier (còn được gọi là phạm vi truy cập)
 là các từ khóa để quy định phạm vi mà một thành viên của lớp (biến, phương thức, lớp con...)
 có thể được truy cập từ các lớp khác.


 +Java định nghĩa 4 access modifier chính:

 --public: được truy cập từ mọi nơi trong chương trình Java, bao gồm cả bên ngoài lớp và bên trong lớp.
 --protected: chỉ có thể truy cập từ các lớp con (subclass) của lớp hiện tại hoặc từ các lớp cùng gói (package).
 --default (không sử dụng bất kỳ access modifier nào): chỉ có thể truy cập từ các lớp cùng gói (package).
 --private: chỉ có thể truy cập từ bên trong lớp hiện tại
vd:
 public class MyClass {
 public int publicVar;
 protected int protectedVar;
 int defaultVar;
 private int privateVar;

 public void publicMethod() {
 // phương thức có access modifier public
 }

 protected void protectedMethod() {
 // phương thức có access modifier protected
 }

 void defaultMethod() {
 // phương thức có access modifier default
 }

 private void privateMethod() {
 // phương thức có access modifier private
 }
 }

 public class MyOtherClass {
 public void someMethod() {
 MyClass myClass = new MyClass();
 myClass.publicVar = 1;      // ok
 myClass.protectedVar = 2;   // lỗi biên dịch, không thể truy cập từ lớp khác và không phải là subclass
 myClass.defaultVar = 3;    // ok
 myClass.privateVar = 4;    // lỗi biên dịch, không thể truy cập từ lớp khác

 myClass.publicMethod();     // ok
 myClass.protectedMethod();  // lỗi biên dịch, không thể truy cập từ lớp khác và không phải là subclass
 myClass.defaultMethod();    // ok
 myClass.privateMethod();    // lỗi biên dịch, không thể truy cập từ lớp khác
 }
 }

------
 Package trong lập trình là một tập hợp các module,
 class và các tài nguyên khác được đóng gói lại
 để sử dụng trong một ứng dụng. Package giúp cho việc tổ chức, quản lý và phân chia code trở nên dễ dàng hơn. Trong Java,
 package được đặt ở đầu file mã nguồn và sử dụng từ khóa package để định nghĩa tên gói.
vd:java.util, java.io, java.lang,...
-----Lớp kế thừa là một khái niệm trong lập trình hướng đối tượng,
 cho phép lớp con (subclass) kế thừa các thuộc tính và phương thức của lớp cha (superclass) mà không cần phải định nghĩa lại.
 Lớp con có thể mở rộng hoặc thay đổi các phương thức hoặc thuộc tính được kế thừa từ lớp cha,
 và có thể thêm các phương thức hoặc thuộc tính mới.
vd:public class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
 this.name = name;
 this.age = age;
 }

 public void displayInfo() {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 }
 }

 public class Student extends Person {
 private int studentId;

 public Student(String name, int age, int studentId) {
 super(name, age);
 this.studentId = studentId;
 }

 public void displayStudentInfo() {
 displayInfo();
 System.out.println("Student ID: " + studentId);
 }
 }
 Trong ví dụ này, lớp Student kế thừa các thuộc tính và phương thức của lớp Person,
 bao gồm thuộc tính name, age và phương thức displayInfo(). Lớp Student cũng có thuộc tính riêng là studentId
 và phương thức displayStudentInfo() để hiển thị thông tin của học sinh
 bao gồm thông tin cá nhân và mã số sinh viên.
--Lớp hiện tại (current class) là lớp đang được thao tác trong vùng địa chỉ của chương trình tại thời điểm hiện tại.
 Trong Java, từ khóa this được sử dụng để đề cập đến đối tượng hiện tại của lớp đó
 giúp phân biệt giữa các biến cục bộ và các thuộc tính của lớp.
vd:public class Calculator {
 private int result;

 public Calculator() {
 this.result = 0; // sử dụng this để truy cập đến thuộc tính của lớp hiện tại
 }

 public void add(int number) {
 this.result += number; // sử dụng this để truy cập đến thuộc tính của lớp hiện tại
 }

 public void subtract(int number) {
 this.result -= number; // sử dụng this để truy cập đến thuộc tính của lớp hiện tại
 }

 public int getResult() {
 return this.result; //
 lớp Calculator có một thuộc tính result
 và các phương thức add(), subtract() và getResult()
 để thực hiện các phép tính và trả về kết quả tính toán.
 Trong phương thức khởi tạo, ta sử dụng từ khóa this để tham chiếu đến thuộc tính result của lớp hiện tại.
 Các phương thức add() và subtract() cũng sử dụng từ khóa this để truy cập đến thuộc tính result.
 Trong phương thức getResult(), ta trả về giá trị của thuộc tính result của lớp hiện tại bằng cách sử dụng từ khóa this

 ---từ khóa "static" được sử dụng để chỉ định rằng một biến, phương thức hoặc khối mã thuộc về lớp,
 chứ không thuộc về đối tượng cụ thể nào của lớp đó.

 Biến static:chia sẻ giữa tất cả các đối tượng của lớp đó, chỉ có một bản sao duy nhất của biến này được tạo ra trong bộ nhớ
 khi lớp được tải vào bộ nhớ. Biến static có thể được truy cập thông qua tên của lớp mà không cần tạo một đối tượng mới.

 Phương thức static: Tương tự như biến static, phương thức static cũng thuộc về lớp và
 có thể được truy cập thông qua tên của lớp mà không cần tạo đối tượng mới.
 Phương thức static không thể truy cập các biến không static hoặc gọi các phương thức không static từ cùng một lớp.

 Khối static: Khối static là một khối mã được thực thi khi lớp được tải vào bộ nhớ.
 Khối mã này được sử dụng để khởi tạo các biến static hoặc thực hiện các tác vụ khởi tạo khác cho lớp.


----Nested class là một lớp được định nghĩa bên trong một lớp khác.
 Có ba loại nested class trong Java:

+ Static nested class: Là một lớp được định nghĩa bên trong một lớp khác với từ khóa "static".
 Lớp này có thể được truy cập mà không cần tạo đối tượng của lớp bên ngoài nó.
vd:public class OuterClass {
 static class InnerClass {
 public void print() {
 System.out.println("This is a static nested class");
 }
 }
 }
 +Inner class: Là một lớp được định nghĩa bên trong một lớp khác mà không có từ khóa "static".
 Lớp này có thể truy cập các thành viên của lớp bên ngoài nó.
vd:public class OuterClass {
 class InnerClass {
 public void print() {
 System.out.println("This is an inner class");
 }
 }
 }
 +Local class: Là một lớp được định nghĩa trong một phương thức hoặc khối mã. Lớp này chỉ có thể được truy cập trong phương thức hoặc khối mã bên ngoài nó.
 Ví dụ:
 public class OuterClass {
 public void print() {
 class LocalClass {
 public void print() {
 System.out.println("This is a local class");
 }
 }
 LocalClass lc = new LocalClass();
 lc.print();
 }
 }
----Getter là một phương thức
 dùng để truy cập giá trị của một thuộc tính của đối tượng

vd:public type getPropertyName() {
 return propertyName;
 }//"type" là kiểu dữ liệu của thuộc tính, "getPropertyName" là tên của phương thức và "propertyName" là tên của thuộc tính cần truy cập.

--------Setter là một phương thức dùng để thiết lập giá trị cho một thuộc tính của đối tượng.
vd:public void setPropertyName(type propertyName) {
 this.propertyName = propertyName;
 }
 "setPropertyName" là tên của phương thức,
 "type" là kiểu dữ liệu của thuộc tính
 và "propertyName" là tên của thuộc tính cần thiết lập giá trị.
 Trong phương thức setter, từ khóa "this" được sử dụng để xác định rằng thuộc tính được thiết lập chính là thuộc tính của đối tượng hiện tại



 */