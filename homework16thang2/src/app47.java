import java.util.Scanner;

public class app47 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap số nguyên bất kỳ ");
            number = scanner.nextInt();
            sum = sum + number;
        } while (sum < 100);
        {
            System.out.println("tong cac so vua nhap la: " + sum);
        }
    }

}
