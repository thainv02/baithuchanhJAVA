package Shape;

import java.util.Scanner;

public class tamgiac extends Point {

    static double a1;
    static double a2;
    static double b1;
    static double b2;
    static double c1;
    static double c2;

    static double a = Math.sqrt((b1 - a1) * (b1 - a1) + (b2 - a2) * (b2 - a2));
    static double b = Math.sqrt((c1 - a1) * (b1 - a1) + (b2 - a2) * (b2 - a2));
    static double c = Math.sqrt((a1 - c1) * (a1 - c1) + (b2 - c2) * (b2 - c2));

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào toạ độ a1");
        a1 = scanner.nextFloat();

        System.out.println("nhập vào toạ độ a2");
        a2 = scanner.nextDouble();

        System.out.println("nhập vào toạ độ b1");
        b1 = scanner.nextDouble();

        System.out.println("nhập vào toạ độ b2");
        b2 = scanner.nextDouble();

        System.out.println("nhập vào toạ độ c1");
        c1 = scanner.nextDouble();

        System.out.println("nhập vào toạ độ c2");
        c2 = scanner.nextDouble();
        if (a + b > c || a + c > b || b + c > a) {
            if (a == b && a == c && b == c) {
                System.out.println("là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("là tam giác cân");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("là tam giác vuông");
            } else {
                System.out.println("là tam giác thường");
            }
        } else {
            System.out.println("a , b ,c không tạo thành tam giác");
        }
    }

}
