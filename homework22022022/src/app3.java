import java.util.Scanner;

//kiểm tra số nguyên tố
public class app3 {
    public static void main(String[] args) throws Exception {
        int number, count = 01;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so number la: ");
        number = scanner.nextInt();
        if (number < 2) {
            System.out.println("so number không là số nguyên tố");
        }
        for (int i = 2; i > number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("so number la so nguyên tố ");
        } else {
            System.out.println("so number không la so nguyên tố ");
        }
    }
}
