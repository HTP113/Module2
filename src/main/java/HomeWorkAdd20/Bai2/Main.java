package HomeWorkAdd20.Bai2;
//in ra gia trị mà tích giá trị nhân với chỉ số chia hết cho 3
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 8,5,3};
        int max;

         max = arr[1];

        for(int i = 3; i < arr.length; i+=2){
            if(arr[i] > max){


                    max = arr[i];


            }

        }
        System.out.println(max);
    }
}
