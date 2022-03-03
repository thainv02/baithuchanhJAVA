import java.util.Scanner;

public class appb6 {
    public static void main(String[] args) throws Exception {
        int number, giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên dương : ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            giaithua = giaithua * i;
        }
        System.out.printf("%d! = %d", number, giaithua);
    }
}
