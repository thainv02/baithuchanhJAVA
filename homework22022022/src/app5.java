import java.util.Scanner;

public class app5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen ");
        int n = scanner.nextInt();
        int sum = 0;

        // Tìm tổng ước số
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;// Nếu là ước số thì cộng vào tổng
        }
        // So sánh tổng ước số với số đã cho để tìm ra số hoàn hảo
        if (sum == n & n != 0) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong phai la so hoan hao");
        }

    }

}
