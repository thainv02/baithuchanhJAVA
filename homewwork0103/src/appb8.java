import java.util.Scanner;

public class appb8 {
    public static void main(String[] args) throws Exception {
        int n;// khai báo biến number
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n : ");
        n = scanner.nextInt();
        int a[] = new int[n];// gán mảng a có độ dài là number
        // nhập phần tử của mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhập phần tử thứ " + i + " của mảng :");
            a[i] = scanner.nextInt();
        }
        // tính tổng phẩn tử của mảng
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + a[j];
        }
        // tính trung bình cộng của các số vừa nhập
        int average = sum / n;

        System.out.println("trung bình cộng của các số vừa nhập là :" + average);
    }
}
