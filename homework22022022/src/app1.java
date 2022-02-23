import java.util.Scanner;

public class app1 {
    public static void main(String[] args) throws Exception {
        // tìm ucln của a và b
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so a la: ");
        a = scanner.nextInt();
        System.out.println("so b la: ");
        b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.printf("UCLN là : %d", a + b);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN là :" + a);
    }
}
