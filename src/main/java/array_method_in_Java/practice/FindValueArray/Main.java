package array_method_in_Java.practice.FindValueArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name=sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
if (!isExist)
    System.out.println("No found" + input_name + "int the list.");
    }
}
