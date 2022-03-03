import java.util.Scanner;

public class appb1 {
    public static void main(String[] args) throws Exception {
        // tính tổng hiệu tích thương chia lấy dư của 2 số a b
        float a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so a la: ");
        a = scanner.nextFloat();
        System.out.println("so b la: ");
        b = scanner.nextFloat();
        System.out.printf("tông hai số %d + %d = %d%n", a, b, a + b);
        System.out.printf("hiệu hai số %d - %d = %d%n", a, b, a - b);
        System.out.printf("tích hai số %d * %d = %d%n", a, b, a * b);
        System.out.printf("thương hai số %d / %d = %d%n", a, b, a / b);
        System.out.printf(" %d % %d = %d%n", a, b, a % b);
        if (a > b) {
            System.out.println("so a lớn hơn số b ");
        } else if (a < b) {
            System.out.println("so b lớn hơn số a ");
        } else {
            System.out.println("so a bằng số b ");
        }
    }
}
