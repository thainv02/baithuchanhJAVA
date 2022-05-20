import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
        int number;
        HashSet<Integer> hashsIntegers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // them cac phan tu vao hashsetinteger
        hashsIntegers.add(0);
        hashsIntegers.add(3);

        hashsIntegers.add(1);

        hashsIntegers.add(4);

        hashsIntegers.add(2);
        hashsIntegers.add(8);
        // hiển thị các hashsetinteger
        System.out.println("các phần tử có trong hashSetInteger là: ");
        System.out.println(hashsIntegers);
        System.out.println("nhập phần tử cần thêm  ");
        number = scanner.nextInt();
        // them một phần tử mới vào hashsetinteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tại và ngược lại thì thêm vào
        if (!hashsIntegers.contains(number)) {
            hashsIntegers.add(number);
            System.out.println("thêm thành công ! ");
            System.out.println("các phần tử sau khi thêm là :  ");
            System.out.println(hashsIntegers);

        } else {
            System.out.println("phần tử " + number + "đã tồn tại");
        }

    }
}
