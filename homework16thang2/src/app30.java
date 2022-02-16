import java.util.Scanner;

public class app30 {
    public static void main(String[] args) throws Exception {
        int n, surplus, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so n la: ");
        n = scanner.nextInt();
        while (n > 0) {
            surplus = n % 10;
            n = n / 10;
            sum = sum + surplus;
        }
        System.out.println("tong cac chu so trong n la: " + sum);
    }
}
