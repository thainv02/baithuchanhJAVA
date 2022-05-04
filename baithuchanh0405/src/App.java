import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String a;
        ArrayList<String> arr = new ArrayList<>();

        arr.add("JAVA");
        arr.add("C#");
        arr.add("PHP");
        arr.add("C++");

        System.out.println("các phần tử trong mảng là : ");

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\n");
        }

        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào thứ tự phần tử cần xóa : ");
        j = scanner.nextInt();
        arr.remove(j);

        System.out.println("các phần tử sau khi xóa là  : ");
        for (int t = 0; t < arr.size(); t++) {
            System.out.print(arr.get(t) + "\n");
        }
        int k;
        System.out.println("nhập vào vị trí cần thêm vào : ");
        k = scanner.nextInt();
        System.out.println("nhập vào giá trị cần thêm vào : ");
        a = scanner.nextLine();
        // a = "abc";
        arr.add(k, a);
        System.out.println("các phần tử sau khi them là  : ");
        for (int t = 0; t < arr.size(); t++) {
            System.out.print(arr.get(t) + "\n");
        }
    }
}
