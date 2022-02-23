import java.util.Scanner;

public class app9 {
    // có 1 cách khác là tạo 1 hàm để đảo ngược rồi gọi vào hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, reversed = 0;
        System.out.println("Nhập vào số cần đảo ngược: ");
        number1 = sc.nextInt();
        number2 = number1;
        while (number1 != 0) {
            int digit = number1 % 10;
            reversed = reversed * 10 + digit;
            number1 /= 10;
        }
        System.out.printf("Số " + number2 + " sau khi đảo ngược là: " + reversed);
    }
}
