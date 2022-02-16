import java.util.Scanner;

public class app40 {
    public static void main(String[] args) throws Exception {
        int numberday;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap numberday ");
        numberday = scanner.nextInt();
        switch (numberday) {
            case 2:
                System.out.println("hôm nay là thứ 2 ");
                break;
            case 3:
                System.out.println("hôm nay là thứ 3 ");
                break;
            case 4:
                System.out.println("hôm nay là thứ 4 ");
                break;
            case 5:
                System.out.println("hôm nay là thứ 5 ");
                break;
            case 6:
                System.out.println("hôm nay là thứ 6 ");
                break;
            case 7:
                System.out.println("hôm nay là thứ 7 ");
                break;
            case 8:
                System.out.println("hôm nay là chủ nhật  ");
                break;
            default:
                System.out.println("số ngày không đúng ");
                break;

        }
    }
}
