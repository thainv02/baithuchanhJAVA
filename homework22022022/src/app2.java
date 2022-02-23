import java.util.Scanner;

// ktra tam giác
public class app2 {
    public static void main(String[] args) throws Exception {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập số a , b ,c không âm !!");
            System.out.println("so a la: ");
            a = scanner.nextDouble();
            System.out.println("so b la: ");
            b = scanner.nextDouble();
            System.out.println("so c la: ");
            c = scanner.nextDouble();
        } while (a < 0 || b < 0 || c < 0);
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
