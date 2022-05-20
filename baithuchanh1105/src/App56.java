import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashSetsStrings = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào hashsetstring
        hashSetsStrings.add("wilsom");
        hashSetsStrings.add("Nike");
        hashSetsStrings.add("Volvo");
        hashSetsStrings.add("Kia");
        hashSetsStrings.add("Lennovo");
        hashSetsStrings.add("Dell");

        // hiển thị các phần tử trong hashsetstring
        System.out.println("các phần tử có trong hashSetsStrings là: ");
        System.out.println(hashSetsStrings);
        System.out.println("nhập phần tử cần xóa:  ");
        name = scanner.nextLine();

        // nếu phần tử cần xóa có tồn tại trong hashSetsStrings thì thông báo xóa thành
        // công
        // và hiện thị các phần tử còn lại thông báo xóa k thành công
        if (hashSetsStrings.contains(name)) {
            hashSetsStrings.remove(name);
            System.out.println("xóa thành công ! ");
            System.out.println("các phần tử sau khi xóa là :  ");
            System.out.println(hashSetsStrings);
        } else {
            System.out.println("xóa k thanh cong !");
        }
    }
}
