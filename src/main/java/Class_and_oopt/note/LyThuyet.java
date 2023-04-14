package Class_and_oopt.note;

public class LyThuyet {
    public static void main(String[] args) {

    }
}


/**
  ------Lớp (Class): Là một khuôn mẫu (template) cho một nhóm đối tượng có cùng tính chất.
  ------------Lớp định nghĩa các thuộc tính và phương thức để tạo ra các đối tượng.

 ------- Đối tượng (Object): Là một thực thể của một lớp, được tạo ra từ lớp. Đối tượng có thể được coi như một cá thể,
 có những đặc điểm riêng biệt, tương tác với các đối tượng khác.

 ----- Thuộc tính (Property/Attribute): Là các biến mô tả các đặc điểm của một đối tượng.
 Thuộc tính có thể là kiểu nguyên thủy như số nguyên, số thực, chuỗi ký tự, hoặc là đối tượng khác.

 ---- Phương thức (Method): Là các hành động được định nghĩa trong lớp để thực hiện các tác vụ trên đối tượng.
 Phương thức có thể trả về giá trị hoặc không trả về giá trị.

------ Khai báo lớp:
 public class MyClass {
 // khai báo thuộc tính và phương thức của lớp
 }
 Khai báo đối tượng:
 MyClass obj = new MyClass(); // tạo một đối tượng của lớp MyClass




 ------------class làtừkhoáđược dùngđểkhaibáobiến
 class_name là tên củalớp
         class body là phầnthâncủalớp:nơi khaibáocácthànhphầncủalớpnhư các
        trường (field), các phương thức (method) và các phương thức khởi tạo
        (constructor)
         Constructor –phươngthức khởitạo: làmộtphươngthức đặcbiệt

---------------Một sốquyướckhiđặttênlớp:
        Tênlớp nênlàmột danhtừ
         Tênlớp nêntuântheo quytắcCamel
         Tênlớp nênđơngiản,cónghĩa
         Tênlớp không thểtrùng với cáctừkhoá trong Java
         Tênlớp không đượcbắtđầubằng chữsố.Cóthểbắtđầubằngkýtựdollar
        ($)hoặcdấugạchdưới (_)

 Constructor làmộtphươngthức đặcbiệtgiúpkhởitạođốitượng
  Constructor cótêntrùngvớitêncủa lớp
 -- Mộtlớp cóthểcónhiềuconstructor
 Nếukhôngkhaibáo constructor cholớp thìmặcđịnhlớp đó cómột
 constructorkhôngcóthamsố

 -------------Cóthểtruy xuất cácthành phầncủađốitượng thôngquabiếntrỏ
 đến đốitượng
  Sửdụngdấuchấm(.)đểtruyxuấtthuộc tínhcủađốitượng

 obj.propertyName; // truy xuất thuộc tính propertyName của đối tượng obj
 Sửdụngdấuchấm(.)đểgọiphươngthức củađốitượng

 Sửdụngtừkhoápublic khikhaibáo thuộc tínhsẽchophéptruycập
 trực tiếp vàocácthuộc tínhđó

------ Cú pháp khai báogetter:
 public returnTypegetPropertyName()
  Đối với cácthuộc tính kiểuboolean thìtêngetter bắtđầubằngchữis:
 public boolean isPropertyName()

------ Cú pháp khai báosetter:
 public void setPropertyName(dataType propertyValue)

---- Từkhoáthisđược sửdụng đểđại diệnchođốitượng hiệntại
  Cóthểsửdụngtừkhoáthisđểtruy cậpđếncác thànhphầncủađối
 tượng hiệntại


 -----Tạo  đối tượng:
 MyClass obj1 = new MyClass(); // tạo một đối tượng của lớp MyClass

----------- Sử dụng đối tượng:
 obj1.methodName(); // gọi phương thức methodName của đối tượng obj1


 public class Student {
 String name;
 int age;
 double gpa;

 public void displayInfo() {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("GPA: " + gpa);
 }
 }
 **/