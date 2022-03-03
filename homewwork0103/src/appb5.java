import java.util.Scanner;

public class appb5 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 số nguyên dương : ");
            number = sc.nextInt();
            sum = sum + number;
        } while (sum <= 100);

        System.out.println("Tổng các chữ số vừa nhập là: " + sum);
    }
}
