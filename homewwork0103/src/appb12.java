import java.util.Scanner;

public class appb12 {
    public static void main(String[] args) throws Exception {
        int current, colum;
        Scanner scanner = new Scanner(System.in);
        // bắt nhập vào số hàng và cột nếu bé hơn 0 bắt nhập lại
        do {
            System.out.println("số dòng của mảng là : ");
            current = scanner.nextInt();
            System.out.println("số cột của mảng là : ");
            colum = scanner.nextInt();
        } while (current < 0 && colum < 0);
        int a[][] = new int[current][colum];// gán mảng a có số dòng là curent và số cột là colum
        // nhập các phần tử của mảng
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("nhập phần tử thứ [" + j + "," + i + "] của mảng :");
                a[j][i] = scanner.nextInt();
            }
        }
        // so sánh và tìm ra phần tử max
        int max = 0;
        for (int b = 0; b < current; b++) {
            for (int c = 0; c < colum; c++) {
                if (a[b][c] > max) {
                    max = a[b][c];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng là:" + max);
    }
}
