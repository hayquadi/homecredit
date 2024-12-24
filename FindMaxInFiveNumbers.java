//new comment
import java.util.Scanner;

public class FindMaxInFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Số lớn nhất là: ");
        // Nhập 5 số từ người dùng
        System.out.println("Nhập 5 số:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Tìm số lớn nhất
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Hiển thị kết quả
        System.out.println("Số lớn nhất là: " + max);

        scanner.close();
    }
}
