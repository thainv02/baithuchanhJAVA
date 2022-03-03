import java.util.Scanner;

public class app74 {
    public static void main(String[] args) throws Exception {
        int number;// khai báo biến number
        Scanner scanner = new Scanner(System.in);
        // nếu number bé hơn 0 bắt nhập lại
        do {
            System.out.println("số phần tử của mảng là : ");
            number = scanner.nextInt();
        } while (number < 0);
        int a[] = new int[number];// gán mảng a có độ dài là number
        // nhập phần tử của mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhập phần tử thứ " + i + " của mảng :");
            a[i] = scanner.nextInt();
        }
        // tính tổng phẩn tử của mảng
        int sum = 0;
        for (int j = 0; j < number; j++) {
            if (a[j] % 2 == 0) {
                sum = sum + a[j];
            }
        }
        System.out.println("tổng các số chẵn trong mảng là :" + sum);
    }
}
