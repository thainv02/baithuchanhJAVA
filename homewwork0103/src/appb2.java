import java.util.Scanner;

public class appb2 {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp vào 1 số bất kỳ ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("số vừa nhập là số chẵn");
        } else {
            System.out.println("số vừa nhập là số lẻ");
        }
    }
}
