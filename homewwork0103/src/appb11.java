import java.util.Scanner;

public class appb11 {
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
        // in mảng khi chưa sắp xếp
        System.out.println("mảng chưa sắp xếp là :");
        for (int j = 0; j < a.length; j++) {
            System.out.print(" " + a[j]);
        }
        System.out.println(" ");
        System.out.println("mảng sắp xếp tăng dần là :");
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int j = 0; j < number; j++) {
            System.out.print(" " + a[j]);
        }
    }
}
