import java.util.Scanner;

public class app7 {
    public static void main(String[] args) throws Exception {
        double memory = 0, n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so n la: ");

        while (n != 0) {
            n = scanner.nextDouble();
            if (memory < n) {
                memory = n;
            }
        }
        System.out.println("số lớn nhất trong các số vừa nhập là :" + memory);
    }
}
