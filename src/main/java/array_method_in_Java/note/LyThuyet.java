package array_method_in_Java.note;

//System.out.println(arrayTotring(numbers));
//        reverseArray(numbers);
//        System.out.println(arrayTotring(numbers));
//
//
//        }
//    public static void basic() {
//        int a = 5;
//        int b = 2;
//
//        System.out.println(a + " cong " + b + " = " + (a+b));
//
//        System.out.printf("%s cong %s = %s\n", a, b, (a+b));
//    }
//public static int findMaxValue(int [] numbers){
//        int max = numbers[0];
//        for (int i = 1;i< numbers.length;i++){
//        if (max < numbers[i]) {
//        max = numbers[i];
//        }
//        }
//        return max;
//        }
//// viet ham dao nguoc mang// int[] numbers = {1, 9, 2, 4};
//public static void reverseArray(int[] numbers){
//        for (int i = 0; i < numbers.length / 2; i++){
//        int temp = numbers[i];
//        numbers[i] = numbers[numbers.length - 1- i];
//        numbers[numbers.length - 1 -i] = temp;
//        }
//        }
//
//public static String arrayTotring(int[] numbers){
//        String str = "[";
//        for (int i = 0; i < numbers.length; i++){
//        str += numbers[i];
//        if (i < numbers.length - 1){
//        str += ", ";
//        }else {
//        str += "]";
//        }
//        }
//        return str;
//        }
//        }

public class LyThuyet {
        //public class Main {
//    public static void main(String[] args) {
//BIẾN MẢNG VÀ ĐỐI TƯỢNG MẢNG----------------------------------
//        Đối tượng mảng(array object):Là một đối tượng thực sự trong bộ nhớ,được cấp phát bộ nhớ động
//        khi khởi tạo mảng bằng cú pháp new.Nó chứa dữ liệu và các phương thức để truy cập và thao tác
//        với dữ liệu đó.

//        Biến mảng(array variable):Là một biến tham chiếu(reference variable)đến đối tượng mảng trong
//        bộ nhớ.Biến mảng chỉ chứa địa chỉ bộ nhớ của đối tượng mảng,không chứa dữ liệu thực tế của
//        mảng đó.Biến mảng được sử dụng để tham chiếu đến đối tượng mảng và thực hiện các thao tác
//
////        VD:int arr=new int[10];
////        arr là biến mảng chỉ lưu địa chỉ vùng nhớ của đối tượng mảng mà không lưu trữ dữ liệu
////        new int[10] là đối tượng mảng có vùng nhớ chưa 10 giá trị  trên đối tượng mảng đó.
//

//        Array------------------------------------------
//        - Biến đặc biệt, lưu trữ được nhiều giá trị;
//        - Các giá trị cùng kiểu dữ liệu, khác nhau về chỉ số;
//        - Tên mảng, các phần tử, chỉ số, độ dài;

//         Khai báo mảng ------------------------------------------------
//        elementType[] arrayRefVar;
//        elementType: kiểu dữ liệu các phần tử trong mảng;
//        arrayRefVar: tên mảng;
//        -   Khi khai báo biến mảng thì sẽ không có việc cấp phát bộ nhớ ngay cho các phần tử
//        của mảng. Chỉ có việc cấp phát bộ nhớ cho tham chiếu đến mảng.
//        -   Nếu không gắn tham chiếu đến mảng thì giá trị của biến mảng là null
//        Ví dụ: khai báo mảng số thực myList:
//        double[] myList;
//        myList là 1 biến chứa tham chiếu đến 1 mảng
//        Tuy nhiên tường gọi myList là 1 mảng

//        Khởi tạo mảng ------------------------------------------
     //   arrayRefVar = new elementType[arraySize];

//         *********** Khai báo, khởi tạo và gắn tham chiếu cho biến mảng --------------------------------
    //    elementType[] arrayRefVar =  new elementType[arraySize];
//        hoặc
      //  elementType arrayRefVar[] = new elementType[arraySize];

//         - Gán giá trị cho các phần tử mảng ----------------------------
//        arrayRefVar[index] = value;
//        Ví dụ: khai báo String gồm 10 phần tử:
//        str là biến mảng
//        new String[10] là đối tượng mảng
//        String[] str = new String[10];
//        int[] array = new int[5];
//        array[0] = 0;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 5;
//
//        //--------------Khởi tạo nhanh mảng-------------
//        String[] str = {"h","e","l","l","o"};
//        int[] nums = {1,2,3,4};
//
//
//        //-----------------Cách khác----------------------
//        double[] arr;
//        int size = 5;
//        arr = new double[size];
//
//        //*Nhập liệu cho mảng
//        System.out.println("Input data for array");
//        for (int i = 0; i < arr.length; i++){
//            System.out.printf("arr[%d] = ", i);
//            arr[i] = scanner.nextDouble();
//        }
//
//        //*Hiển thị dữ liệu mảng
//
//        System.out.println("Show data of array:");
//        for (double i: arr){ //for-each: Dùng trong trường hợp không thay đổi dữ liệu mảng
//            System.out.println(i);
//        }
//
//    }
//}
    }

