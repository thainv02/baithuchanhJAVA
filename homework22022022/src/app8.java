import java.util.Scanner;

public class app8 {
    public static void main(String[] args) throws Exception {
        int memory = 0, n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("so n la: ");

        while (n != 0) {
            n = scanner.nextInt();
            if (memory < n && n % 5 == 0) {
                memory = n;
            }
        }
        System.out.println("số lớn nhất và chia hết cho 5 trong các số vừa nhập là :" + memory);
    }
}
